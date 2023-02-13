/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradepredictorprototype;

/**
 *
 * @author kingt
 */
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.util.ArrayList;

public class Graph extends JPanel {

    ArrayList<Double[]> coordinates = DatabaseManipulation.getPercentages(GradePredictorPrototype.getStudent(), GradePredictorPrototype.getSubject(), new Date(GradePredictorPrototype.getStudent().getDate())); //sets coordinates to be the percentage in a paper for y and date for x
    int mar = 40; //margin
    double finalY;//declares variables
    double average;

    @Override
    protected void paintComponent(Graphics g) {
        double finalX = coordinates.get(coordinates.size() - 1)[0];//sets the date that the paper is being set as the end date
        super.paintComponent(g);
        Graphics2D g1 = (Graphics2D) g;
        g1.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int width = getWidth();//gets the panel width
        int height = getHeight();//gets the panel height
        double x = (double) (width - 2 * mar) / (coordinates.get(coordinates.size() - 1)[0]);//sets a scale for the x direction (based on the amount of the width used by the margin)
        double scale = (double) (height - 2 * mar);//sets a scale for y (based on amount of height used by scale)
        g1.draw(new Line2D.Double(mar, height - mar, mar, height - mar - scale));//draws y axis
        g1.draw(new Line2D.Double(mar, height - mar, width - mar, height - mar));//draws x axis
        g1.drawString("Percentage in assessment", mar + 10, (int) (height - scale - mar) / 1);//adds label for y axis
        g1.drawString("Date of assessment", (int) (width - mar - x), height - mar);//adds label for x axis
        for (double i = 0.1; i <= 1; i += 0.1) {//every 10%
            g1.draw(new Line2D.Double(mar, height - mar - i * scale, mar + finalX * x, height - mar - i * scale)); //draws a horizontal line
            g1.drawString(Math.round(10 * i) + "0%", (int) (mar * 0.4), (int) (height - scale * i - mar) / 1);//adds label for percentage
        }
        if (coordinates.size() > 1) {
            double sigmaX = 0;
            double sigmaY = 0;//declare variables for total x, total y, total x times y, total x squared
            double sigmaXY = 0;
            double sigmaXSquared = 0;
            for (int i = 0; i < coordinates.size() - 1; i++) {
                double y1 = coordinates.get(i)[0];//gets x coordinate
                double x1 = coordinates.get(i)[1];//gets y coordinate
                sigmaX += x1;//adds to total x
                sigmaXSquared += x1 * x1;//adds to total x squared
                sigmaY += y1;//addes to total y
                sigmaXY += x1 * y1;//adds to total x times y
                y1 = height - mar - y1 * scale;//scales y
                x1 = mar + x1 * x;//scales x
                g1.fill(new Ellipse2D.Double(x1 - 2, y1 - 2, 4, 4));//plots coordinate
            }
            double constant = (sigmaY * sigmaXSquared - sigmaX * sigmaXY) / ((coordinates.size() - 1) * sigmaXSquared - sigmaX * sigmaX);//calculates the y intercept of trend line
            double gradient = ((coordinates.size() - 1) * sigmaXY - sigmaX * sigmaY) / ((coordinates.size() - 1) * sigmaXSquared - sigmaX * sigmaX);//calculates gradient of trend line

            finalY = (gradient * finalX) + constant;//sets y value expected when exam is sat
            setAverage();//sets average

            g1.setPaint(Color.WHITE);
            g1.draw(new Line2D.Double(mar, height - mar - constant * scale, mar + finalX * x, height - mar - finalY * scale));//draws trend line
            g1.setPaint(Color.ORANGE);
            g1.draw(new Line2D.Double(mar, height - mar - average * scale, mar + finalX * x, height - mar - average * scale));//draws average line
            double x1 = coordinates.get(coordinates.size() - 2)[1];//sets x to most recent exam sat
            double y1 = x1 * gradient + constant;//sets y coordinate for expected score at date for most recent exam
            gradient *= 0.9;//takes 10% from trend
            finalY = (gradient * finalX) - (gradient * x1) + y1;//updates y with 10% reduction
            g1.setPaint(Color.RED);
            g1.draw(new Line2D.Double(mar + x1 * x, height - mar - y1 * scale, mar + finalX * x, height - mar - finalY * scale));//draws reduces line in red
            gradient = (gradient / 0.9) * 1.1;//increases trend line by 10%
            finalY = (gradient * finalX) - (gradient * x1) + y1;//updates final y
            g1.setPaint(Color.GREEN);
            g1.draw(new Line2D.Double(mar + x1 * x, height - mar - y1 * scale, mar + finalX * x, height - mar - finalY * scale));//draws 10% increased line in green
        }
    }

    public void setAverage() {//method returns average grade
        double total = 0;
        for (int i = 0; i < coordinates.size() - 1; i++) {
            total += coordinates.get(i)[0];//totals percentages achieved

        }
        average = total / (coordinates.size() - 1);//finds mean as average
    }

    public double getTrend() {
        return finalY;//returns finalY
    }

}

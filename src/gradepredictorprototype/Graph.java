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
public class Graph extends JPanel{
    ArrayList<Double[]> coordinates= DatabaseManipulation.getPercentages(GradePredictorPrototype.getStudent(), GradePredictorPrototype.getSubject(), new Date(GradePredictorPrototype.getStudent().getDate()));
    int mar = 40; //margin
    double finalY;
    double average;
    @Override
    protected void paintComponent(Graphics g){
        double finalX = coordinates.get(coordinates.size() - 1)[0];
        super.paintComponent(g);
        Graphics2D g1=(Graphics2D)g;
        g1.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        int width=getWidth();
        int height=getHeight();
        double x=(double)(width-2*mar)/(coordinates.get(coordinates.size() - 1)[0]);
        double scale=(double)(height-2*mar);
        g1.draw(new Line2D.Double(mar,height-mar,mar,height-mar-scale));
        g1.draw(new Line2D.Double(mar,height-mar,width-mar,height-mar));
        g1.drawString("Percentage in assessment", mar + 10, (int)(height-scale-mar)/1);
        g1.drawString("Date of assessment", (int)(width-mar-x), height-mar);
        for(double i = 0.1; i<=1;i+= 0.1 ){
        g1.draw(new Line2D.Double(mar,height - mar - i*scale,mar + finalX * x,height - mar - i*scale)); 
        g1.drawString(Math.round(10*i) + "0%", (int)(mar*0.4), (int)(height-scale*i-mar)/1);
        }
        
        double sigmaX = 0;
        double sigmaY = 0;
        double sigmaXY = 0;
        double sigmaXSquared = 0;        
        for(int i=0;i<coordinates.size() - 1;i++){
            double y1= coordinates.get(i)[0];
            double x1= coordinates.get(i)[1];
            sigmaX += x1;
            sigmaXSquared += x1*x1;
            sigmaY += y1;
            sigmaXY += x1 * y1;
            y1= height-mar-y1*scale;
            x1= mar+x1*x;
            g1.fill(new Ellipse2D.Double(x1-2,y1-2,4,4));
        }
        double constant = (sigmaY * sigmaXSquared - sigmaX * sigmaXY) / ((coordinates.size() - 1) * sigmaXSquared - sigmaX * sigmaX);
        double gradient = ((coordinates.size() - 1) * sigmaXY - sigmaX * sigmaY) / ((coordinates.size() - 1) * sigmaXSquared - sigmaX*sigmaX);
        
        finalY = (gradient*finalX) + constant;
         
        g1.setPaint(Color.WHITE);
        g1.draw(new Line2D.Double(mar,height-mar-constant*scale,mar + finalX*x,height-mar - finalY*scale));
        g1.setPaint(Color.LIGHT_GRAY);
        g1.draw(new Line2D.Double(mar,height-mar-average*scale,mar + finalX*x,height-mar - average*scale));
        double x1 = coordinates.get(coordinates.size() - 2)[1];        
        double y1 = x1*gradient + constant;
        gradient *= 0.9;
        finalY = (gradient*finalX) - (gradient * x1) + y1;
        g1.setPaint(Color.RED);
        g1.draw(new Line2D.Double(mar+x1*x,height-mar-y1*scale,mar + finalX*x,height-mar - finalY*scale));
        gradient = (gradient/0.9) * 1.1;
        finalY = (gradient*finalX) - (gradient * x1) + y1;
        g1.setPaint(Color.GREEN);
        g1.draw(new Line2D.Double(mar+x1*x,height-mar-y1*scale,mar + finalX*x,height-mar - finalY*scale));
        
    }
       
    public double getAverage() {
        double total = 0;
        for(int i=0;i<coordinates.size()-1;i++){
            total += coordinates.get(i)[0];
           
        }
        average = total/(coordinates.size()-1);
        return average;
    }
    public double getTrend() {
        return finalY;
    }
    
}

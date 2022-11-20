/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradepredictorprototype;

/**
 *
 * @author kingt
 */
public class Topic {

    private int topicID;
    private String topic;
    private int overall;
    private int count;
    public Topic(int ID, String topic) {
        this.topic = topic;
        topicID = ID;
        count =0;
        overall = 0;
    }

    public String getTopic() {
        return topic;
    }
    public int getID() {
        return topicID;
    }
    @Override
    public boolean equals(Object compare) {
        if(this == compare) {
            return true;
        }
        if(!(compare instanceof Topic)) {
            return false;
        }
        Topic compared = (Topic) compare;
        
        if(this.topicID == compared.topicID 
                && this.topic.equals(compared.topic)) {
            return true;
    }
        return false;
    }
    public void addOverall(int score) {
        overall += score;
    }
    public void incrementCount() {
        count++;
    }
    public double getOverall() {
        return (double) overall/count;
    }
}

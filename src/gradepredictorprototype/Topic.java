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
    private int overall;//declares variables
    private int count;
    public Topic(int ID, String topic) {
        this.topic = topic;
        topicID = ID;
        count =0;//initialise variables
        overall = 0;
    }

    public String getTopic() {
        return topic;//returns the topic
    }
    public int getID() {
        return topicID;//returns the ID
    }
    @Override
    public boolean equals(Object compare) {//compares a topic to an object for equality 
        if(this == compare) {
            return true;//checks if they are equal
        }
        if(!(compare instanceof Topic)) {
            return false;//checks if compared  object is a topic
        }
        Topic compared = (Topic) compare;//casts compared object into a topic
        
        if(this.topicID == compared.topicID 
                && this.topic.equals(compared.topic)) {//compares variables
            return true;
    }
        return false;
    }
    public void addOverall(int score) {
        overall += score;//adds a score to a total
    }
    public void incrementCount() {
        count++;//increments a counter
    }
    public double getOverall() {
        return (double) overall/count;//averages score
    }
}

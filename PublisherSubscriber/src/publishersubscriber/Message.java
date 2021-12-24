/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package publishersubscriber;

/**
 *
 * @author Amar Murtaza
 */




public class Message {	
	private String topic;
	private String payload;
	
	public Message(){}	
	public Message(String topic, String payload) {
		this.topic = topic;
		this.payload = payload;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getPayload() {
		return payload;
	}
	public void setPayload(String payload) {
		this.payload = payload;
	}
}
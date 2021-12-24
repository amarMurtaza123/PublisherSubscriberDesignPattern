/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package publishersubscriber;

/**
 *
 * @author Amar Murtaza
 */


public class SubscriberImpl extends Subscriber{
	//Add subscriber with PubSubService for a topic
	public void addSubscriber(String topic, PubSubService pubSubService){
		pubSubService.addSubscriber(topic, this);
	}
	
	//Unsubscribe subscriber with PubSubService for a topic
        
	public void unSubscribe(String topic, PubSubService pubSubService){
		pubSubService.removeSubscriber(topic, this);
	}

	//Request specifically for messages related to topic from PubSubService
        
	public void getMessagesForSubscriberOfTopic(String topic, PubSubService pubSubService) {
		pubSubService.getMessagesForSubscriberOfTopic(topic, this);
		
	}	
}
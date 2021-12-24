/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package publishersubscriber;

/**
 *
 * @author Amar Murtaza
 */


public class PublisherImpl implements Publisher {
	//Publishes new message to PubSubService
	public void publish(Message message, PubSubService pubSubService) {		
		pubSubService.addMessageToQueue(message);
	}
}
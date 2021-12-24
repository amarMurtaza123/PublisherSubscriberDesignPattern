/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package publishersubscriber;

/**
 *
 * @author Amar Murtaza
 */

public interface Publisher {	
	//Publishes new message to PubSubService
	void publish(Message message, PubSubService pubSubService);
}

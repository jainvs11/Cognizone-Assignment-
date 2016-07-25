package zone.cogni.assignment.service;

import java.util.Collection;

import zone.cogni.assignment.dto.Message;

/**
 * 
 * @author Vishal
 *
 */
public interface IMessageService {
	Message createMessage(String message);

	Collection<Message> getAllMessages();

	Message getMessage(Integer messageId);
	
	Message softDelete(Integer messageId);
	
	Collection<Message> getEvenDeletedMessages();
}

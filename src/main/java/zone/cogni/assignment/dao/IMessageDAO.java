package zone.cogni.assignment.dao;

import java.util.Collection;

import zone.cogni.assignment.dto.Message;

/**
 * 
 * @author Vishal
 *
 */
public interface IMessageDAO {
	Message createMessage(String message);

	Collection<Message> getAllMessages();

	Message getMessage(Integer messageId);
	
	Message softDelete(Integer messageId);
	
	Collection<Message> getEvenDeletedMessages();
}

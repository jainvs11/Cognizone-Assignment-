package zone.cogni.assignment.service;

import java.util.Collection;

import zone.cogni.assignment.dto.Message;
import zone.cogni.assignment.exception.MessageException;

/**
 * 
 * @author Vishal
 *
 */
public interface IMessageService {
	Message createMessage(String message) throws MessageException;

	Collection<Message> getAllMessages() throws MessageException;

	Message getMessage(Integer messageId) throws MessageException;

	Message softDelete(Integer messageId) throws MessageException;

	Collection<Message> getEvenDeletedMessages() throws MessageException;
}

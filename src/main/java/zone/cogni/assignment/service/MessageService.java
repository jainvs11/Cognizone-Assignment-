package zone.cogni.assignment.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zone.cogni.assignment.dao.IMessageDAO;
import zone.cogni.assignment.dao.MessageDAO;
import zone.cogni.assignment.dto.Message;
import zone.cogni.assignment.exception.MessageException;

/**
 * 
 * @author Vishal
 *
 */
@Service
public class MessageService implements IMessageService {

	@Autowired
	IMessageDAO messageDAO;

	/**
	 * Default Constructor
	 */
	public MessageService() {

	}

	/**
	 * Parameterized Constructor
	 */
	public MessageService(IMessageDAO messageDAO) {
		this.messageDAO = messageDAO;
	}

	@Override
	public Message createMessage(String message) throws MessageException {
		return messageDAO.createMessage(message);
	}

	@Override
	public Collection<Message> getAllMessages() throws MessageException {
		return messageDAO.getAllMessages();
	}

	@Override
	public Message getMessage(Integer messageId) throws MessageException {
		return messageDAO.getMessage(messageId);
	}

	@Override
	public Message softDelete(Integer messageId) throws MessageException {
		return messageDAO.softDelete(messageId);
	}

	@Override
	public Collection<Message> getEvenDeletedMessages() throws MessageException {
		return messageDAO.getEvenDeletedMessages();
	}

	public IMessageDAO getMessageDAO() {
		return new MessageDAO();
	}

	public void setMessageDAO(IMessageDAO messageDAO) {
		this.messageDAO = messageDAO;
	}
}

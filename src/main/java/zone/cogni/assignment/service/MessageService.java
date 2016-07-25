package zone.cogni.assignment.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zone.cogni.assignment.dao.IMessageDAO;
import zone.cogni.assignment.dao.MessageDAO;
import zone.cogni.assignment.dto.Message;

/**
 * 
 * @author Vishal
 *
 */
@Service
public class MessageService implements IMessageService {

	@Autowired
	IMessageDAO messageDAO;

	@Override
	public Message createMessage(String message) {
		return messageDAO.createMessage(message);
	}

	@Override
	public Collection<Message> getAllMessages() {
		return messageDAO.getAllMessages();
	}

	@Override
	public Message getMessage(Integer messageId) {
		return messageDAO.getMessage(messageId);
	}

	public IMessageDAO getMessageDAO() {
		return new MessageDAO();
	}

	public void setMessageDAO(IMessageDAO messageDAO) {
		this.messageDAO = messageDAO;
	}

	public MessageService(IMessageDAO messageDAO) {
		this.messageDAO = messageDAO;
	}

	public MessageService() {
	}

	@Override
	public Message softDelete(Integer messageId) {
		return messageDAO.softDelete(messageId);
	}

	@Override
	public Collection<Message> getEvenDeletedMessages() {
		return messageDAO.getEvenDeletedMessages();
	}
}

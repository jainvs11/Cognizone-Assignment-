package zone.cogni.assignment.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import zone.cogni.assignment.dto.Message;
import zone.cogni.assignment.service.IMessageService;
import zone.cogni.assignment.service.MessageService;

/**
 * 
 * @author Vishal
 *
 */
@RestController
public class MessageController implements IMessageController {

	@Autowired
	private IMessageService messageService;

	/**
	 * Default Constructor
	 */
	public MessageController() {

	}

	/**
	 * Parameterized Constructor
	 */
	public MessageController(IMessageService messageService) {
		this.messageService = messageService;
	}

	/**
	 * Create Message
	 */
	@Override
	public Message createMessage(String message) {
		return messageService.createMessage(message);
	}

	/**
	 * Get all messages
	 */
	@Override
	public Collection<Message> getAllMessages() {
		return messageService.getAllMessages();
	}

	/**
	 * get message
	 */
	@Override
	public Message getMessage(Integer messageId) {
		return messageService.getMessage(messageId);
	}

	/**
	 * Soft delete
	 */
	@Override
	public Message softDelete(Integer messageId) {
		return messageService.softDelete(messageId);
	}

	/**
	 * get soft deleted messages along with all messages
	 */
	@Override
	public Collection<Message> getEvenDeletedMessages() {
		return messageService.getEvenDeletedMessages();
	}

	public IMessageService getMessageService() {
		return new MessageService();
	}

	public void setMessageService(IMessageService messageService) {
		this.messageService = messageService;
	}
}

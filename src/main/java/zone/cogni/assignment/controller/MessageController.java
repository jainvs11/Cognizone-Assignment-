package zone.cogni.assignment.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import zone.cogni.assignment.dto.Message;
import zone.cogni.assignment.exception.MessageException;
import zone.cogni.assignment.service.IMessageService;
import zone.cogni.assignment.service.MessageService;

/**
 * 
 * @author Vishal
 *
 */
@RestController
public class MessageController {

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

	@RequestMapping(value = "/createMessage", method = RequestMethod.POST)
	public Message createMessage(String message) throws MessageException {
		return messageService.createMessage(message);
	}

	/**
	 * Get all messages
	 */

	@RequestMapping(value = "/getAllMessages", method = RequestMethod.GET)
	public Collection<Message> getAllMessages() throws MessageException {
		return messageService.getAllMessages();
	}

	/**
	 * get message
	 */

	@RequestMapping(value = "/getMessage", method = RequestMethod.GET)
	public Message getMessage(Integer messageId) throws MessageException {
		return messageService.getMessage(messageId);
	}

	/**
	 * Soft delete
	 */

	@RequestMapping(value = "/softDelete", method = RequestMethod.DELETE)
	public Message softDelete(Integer messageId) throws MessageException {
		return messageService.softDelete(messageId);
	}

	/**
	 * get soft deleted messages along with all messages
	 */

	@RequestMapping(value = "/getEvenDeletedMessages", method = RequestMethod.GET)
	public Collection<Message> getEvenDeletedMessages() throws MessageException {
		return messageService.getEvenDeletedMessages();
	}

	public IMessageService getMessageService() {
		return new MessageService();
	}

	public void setMessageService(IMessageService messageService) {
		this.messageService = messageService;
	}
}

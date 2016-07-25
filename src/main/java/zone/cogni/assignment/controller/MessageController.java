package zone.cogni.assignment.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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
	 * Create Message
	 */
	@Override
	@RequestMapping("/createMessage")
	public Message createMessage(String message) {
		return messageService.createMessage(message);
	}

	/**
	 * Get all messages
	 */
	@Override
	@RequestMapping("/getAllMessages")
	public Collection<Message> getAllMessages() {
		return messageService.getAllMessages();
	}

	/**
	 * get message
	 */
	@Override
	@RequestMapping("/getMessage")
	public Message getMessage(Integer messageId) {
		return messageService.getMessage(messageId);
	}

	/**
	 * Soft delete
	 */
	@Override
	@RequestMapping("/softDelete")
	public Message softDelete(Integer messageId) {
		return messageService.softDelete(messageId);
	}

	/**
	 * get soft deleted messages along with all messages
	 */
	@Override
	@RequestMapping("/getEvenDeletedMessages")
	public Collection<Message> getEvenDeletedMessages() {
		return messageService.getEvenDeletedMessages();
	}

	public IMessageService getMessageService() {
		return new MessageService();
	}

	public void setMessageService(IMessageService messageService) {
		this.messageService = messageService;
	}

	public MessageController() {

	}

	public MessageController(IMessageService messageService) {
		this.messageService = messageService;
	}
}

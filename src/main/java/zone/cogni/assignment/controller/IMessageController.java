package zone.cogni.assignment.controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import zone.cogni.assignment.dto.Message;

/**
 * 
 * @author Vishal
 *
 */
public interface IMessageController {

	@RequestMapping(value = "/createMessage", method = RequestMethod.POST)
	Message createMessage(String message);

	@RequestMapping(value = "/getAllMessages", method = RequestMethod.GET)
	Collection<Message> getAllMessages();

	@RequestMapping(value = "/getMessage", method = RequestMethod.GET)
	Message getMessage(Integer messageId);

	@RequestMapping(value = "/softDelete", method = RequestMethod.DELETE)
	Message softDelete(Integer messageId);

	@RequestMapping(value = "/getEvenDeletedMessages", method = RequestMethod.GET)
	Collection<Message> getEvenDeletedMessages();
}

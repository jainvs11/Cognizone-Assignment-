package zone.cogni.assignment.controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import zone.cogni.assignment.dto.Message;
import zone.cogni.assignment.exception.MessageException;

/**
 * 
 * @author Vishal
 *
 */
public interface IMessageController {

	@RequestMapping(value = "/createMessage", method = RequestMethod.POST)
	Message createMessage(String message) throws MessageException;

	@RequestMapping(value = "/getAllMessages", method = RequestMethod.GET)
	Collection<Message> getAllMessages() throws MessageException;

	@RequestMapping(value = "/getMessage", method = RequestMethod.GET)
	Message getMessage(Integer messageId) throws MessageException;

	@RequestMapping(value = "/softDelete", method = RequestMethod.DELETE)
	Message softDelete(Integer messageId) throws MessageException;

	@RequestMapping(value = "/getEvenDeletedMessages", method = RequestMethod.GET)
	Collection<Message> getEvenDeletedMessages() throws MessageException;
}

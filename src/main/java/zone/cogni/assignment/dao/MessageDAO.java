package zone.cogni.assignment.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import zone.cogni.assignment.dto.Message;

/**
 * 
 * @author Vishal
 *
 */
@Repository
public class MessageDAO implements IMessageDAO {

	private static Map<Integer, Message> messages = new HashMap<Integer, Message>();
	static Integer currentIndex = 1;

	@Override
	public Message createMessage(String message) {
		Message messageObj = new Message(message, new Date(Calendar.getInstance().getTimeInMillis()).toString(),
				currentIndex++);
		messages.put(messageObj.getMessageId(), messageObj);
		return messageObj;
	}

	@Override
	public Collection<Message> getAllMessages() {
		Collection<Message> allMessages = messages.values();
		Collection<Message> newMessages = new ArrayList<Message>();
		for (Message message : allMessages) {
			if (message.isActive()) {
				newMessages.add(message);
			}
		}
		return newMessages;
	}

	@Override
	public Message getMessage(Integer messageId) {
		return messages.get(messageId);
	}

	@Override
	public Message softDelete(Integer messageId) {
		Message tempMessage = messages.get(messageId);
		tempMessage.setActive(false);
		return tempMessage;
	}

	@Override
	public Collection<Message> getEvenDeletedMessages() {
		return messages.values();
	}
}

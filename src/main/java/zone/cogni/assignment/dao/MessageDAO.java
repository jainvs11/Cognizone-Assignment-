package zone.cogni.assignment.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Repository;

import zone.cogni.assignment.dto.Message;

/**
 * 
 * @author Vishal
 *
 */
@Repository
public class MessageDAO implements IMessageDAO {

	private Map<Integer, Message> messages = new ConcurrentHashMap<Integer, Message>();
	private Integer currentIndex = 1;

	/**
	 * Default Constructor
	 */
	public MessageDAO() {

	}

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
		Message tempMessage = messages.get(messageId);
		if (tempMessage != null && tempMessage.isActive()) {
			return tempMessage;
		} else {
			return null;
		}
	}

	@Override
	public Message softDelete(Integer messageId) {
		Message tempMessage = messages.get(messageId);
		if (tempMessage != null && tempMessage.isActive()) {
			tempMessage.setActive(false);
			return tempMessage;
		} else {
			return null;
		}
	}

	@Override
	public Collection<Message> getEvenDeletedMessages() {
		return messages.values();
	}
}

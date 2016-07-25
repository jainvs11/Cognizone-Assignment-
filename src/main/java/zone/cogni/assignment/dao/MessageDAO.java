package zone.cogni.assignment.dao;

import java.util.Calendar;
import java.util.Collection;
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
		return messages.values();
	}

	@Override
	public Message getMessage(Integer messageId) {
		return messages.get(messageId);
	}
}

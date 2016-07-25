package zone.cogni.assignment.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zone.cogni.assignment.controller.MessageController;
import zone.cogni.assignment.dao.MessageDAO;
import zone.cogni.assignment.service.MessageService;

@SpringBootApplication
public class MessageClient {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(
				new Object[] { MessageController.class, MessageClient.class, MessageService.class, MessageDAO.class },
				args);
	}
}

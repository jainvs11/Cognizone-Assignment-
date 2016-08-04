package zone.cogni.assignment.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author Vishal
 *
 */
@SpringBootApplication(scanBasePackages = "zone.cogni.assignment")
public class MessageClient {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(MessageClient.class, args);
	}
}

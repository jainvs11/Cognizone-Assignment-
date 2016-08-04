/**
 * 
 */
package zone.cogni.assignment.exception;

/**
 * @author Vishal
 *
 */
public class MessageException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4356645955390006260L;

	/**
	 * 
	 */
	public MessageException() {

	}

	/**
	 * @param message
	 */
	public MessageException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public MessageException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public MessageException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public MessageException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}

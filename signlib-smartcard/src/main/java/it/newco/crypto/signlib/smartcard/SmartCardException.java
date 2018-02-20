package it.newco.crypto.signlib.smartcard;

public class SmartCardException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public SmartCardException() {
		super();
	}

	public SmartCardException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public SmartCardException(String message, Throwable cause) {
		super(message, cause);
	}

	public SmartCardException(String message) {
		super(message);
	}

	public SmartCardException(Throwable cause) {
		super(cause);
	}
}

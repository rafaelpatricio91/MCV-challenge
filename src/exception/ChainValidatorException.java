package exception;

public class ChainValidatorException extends RuntimeException {

	private static final long serialVersionUID = 8661543688420478247L;
	
    public ChainValidatorException(String message, Throwable cause) {
        super(message, cause);
    }

    public ChainValidatorException(String message) {
        super(message);
    }

    public ChainValidatorException(Throwable cause) {
        super(cause);
    }
}

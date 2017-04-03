package lab0;

public class MandatoryStringException  extends IllegalArgumentException{
    
    private final static String msg = "Method argument is mandatory.";

    public MandatoryStringException() {
        super(msg);
    }

    public MandatoryStringException(String s) {
        super(msg);
    }

    public MandatoryStringException(String message, Throwable cause) {
        super(msg, cause);
    }

    public MandatoryStringException(Throwable cause) {
        super(cause);
    }
    
}

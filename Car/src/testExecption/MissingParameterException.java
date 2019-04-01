package testExecption;

public class MissingParameterException extends RuntimeException {
    
    
    public MissingParameterException(){
        super();
    }

    public MissingParameterException(String error) {
        super(error);
    }
}

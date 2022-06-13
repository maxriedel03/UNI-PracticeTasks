package programmierung2.testate.testTestat.exceptions;

public class NegativerKaffeekonsumException extends RuntimeException{
    private static final long serialVersionUID = 8423536293234232235L;

    public NegativerKaffeekonsumException(){
        super();
    }
    public NegativerKaffeekonsumException(String s){
        super(s);
    }
}

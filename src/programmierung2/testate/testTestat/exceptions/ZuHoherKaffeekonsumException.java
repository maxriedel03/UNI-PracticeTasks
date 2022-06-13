package programmierung2.testate.testTestat.exceptions;

public class ZuHoherKaffeekonsumException extends Exception{
    private static final long serialVersionUID = 7843943908980342783L;

    public ZuHoherKaffeekonsumException(String s){
        super(s);
    }

    public ZuHoherKaffeekonsumException(){
        super();
    }
}

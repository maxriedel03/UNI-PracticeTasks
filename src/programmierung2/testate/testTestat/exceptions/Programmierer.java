package programmierung2.testate.testTestat.exceptions;

public class Programmierer{
    private int kaffeekonsum;
    private String name;

    public int getKaffeekonsum(){
        return kaffeekonsum;
    }

    public void setKaffeekonsum(int kaffeekonsum) throws ZuHoherKaffeekonsumException{
        if(kaffeekonsum > MAX_KAFFEEKONSUM)
            throw new ZuHoherKaffeekonsumException();
        if(kaffeekonsum < 0)
            throw new NegativerKaffeekonsumException();
        this.kaffeekonsum = kaffeekonsum;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if(name == null)
            throw new NullPointerException();
        this.name = name;
    }

    private static final int MAX_KAFFEEKONSUM = 100;

    public static int getMAX_KAFFEEKONSUM(){
        return MAX_KAFFEEKONSUM;
    }

    public Programmierer(){
        this(0, "Lovelace");
    }

    public Programmierer(int kaffeekonsum, String name){
        try{
            setKaffeekonsum(kaffeekonsum);
        }catch(ZuHoherKaffeekonsumException e){
            this.kaffeekonsum = MAX_KAFFEEKONSUM;
        }catch(NegativerKaffeekonsumException e){
            this.kaffeekonsum = 0;
        }
        setName(name);
    }

    public void trinken(int kaffee) throws ZuHoherKaffeekonsumException{
        kaffeekonsum += kaffee;
        if(kaffeekonsum > MAX_KAFFEEKONSUM)
            throw new ZuHoherKaffeekonsumException();
        if(kaffeekonsum < 0)
            throw new NegativerKaffeekonsumException();

    }




}

package programmierung2.testate.testTestat;

import java.util.Objects;

public class ClothVO{
    private static int nextId = 0;
    protected String brand;
    private int id;

    public ClothVO(String brand){
        setBrand(brand);
        id = nextId;
        nextId++;
    }

    public ClothVO(){
        this(null);
    }

    public static int getNextId(){
        return nextId;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public int getId(){
        return id;
    }

    @Override
    public boolean equals(Object o){
        if(o == this)
            return true;
        if(o == null || o.getClass() != this.getClass())
            return false;
        ClothVO other = (ClothVO) o;
        return Objects.equals(brand, other.brand);
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(brand);
    }

    public ClothVO clone(){
        return new ClothVO(brand);
    }

    @Override
    public String toString(){
        return "ClothVO{id=" + id +", brand" + brand + "}";
    }
}

package programmierung2.testate.testTestat;

import java.awt.Color;
import java.util.Objects;

public class TShirtVO extends ClothVO{
    private Color color;

    public TShirtVO(String brand, Color color){
        super(brand);
        setColor(color);
    }

    public TShirtVO(){
        this(null,null);
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color color){
        this.color = color;
    }

    @Override
    public boolean equals(Object o){
        if(this == o)
            return true;
        if(o == null || o.getClass() != this.getClass())
            return false;
        TShirtVO other = (TShirtVO) o;
        return Objects.equals(color, other.color) && super.equals(o);
    }

    @Override
    public int hashCode(){
        int result = 1;
        int mult = 31;

        result = result + mult * super.hashCode();
        result = result + mult * Objects.hashCode(color);

        return result;
    }

    @Override
    public String toString(){
        return "TShirtVO{" + super.toString() + ", color=" + color.toString() + "}";
    }
}

package programmierung2.testate.testTestat;

public class OwnerVO {


    private static final int MAX_TSHIRTS = 10;
    private TShirtVO[] tShirts;
    private int index;

    public void addTShirt(TShirtVO tShirt){
        if(index < 10) {
            tShirts[index] = tShirt;
            index++;
        }
    }

    public void deleteTShirt(){
        if(index > 0){
            index--;
            tShirts[index] = null;
        }
    }

    public TShirtVO getTShirt(int index){
        return tShirts[index];
    }

    public int getNumberOfTShirts(){
        return index + 1;
    }


    public OwnerVO() {
        this.tShirts = new TShirtVO[MAX_TSHIRTS];
        this.index = 0;
    }

    private static int getMax_TSHIRTS(){
        return MAX_TSHIRTS;
    }

    public TShirtVO[] getTShirts() {
        return tShirts;
    }

    public void setTShirts(TShirtVO[] tShirts) {
        this.tShirts = tShirts;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}

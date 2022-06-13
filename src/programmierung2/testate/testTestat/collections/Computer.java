package programmierung2.testate.testTestat.collections;

public class Computer implements Comparable<Computer>{
    private String modell;
    private int leistung;

    @Override
    public int compareTo(Computer o){
        return Integer.compare(this.getLeistung(), o.getLeistung());
    }

    public Computer(){
        this(null, 0);
    }

    public Computer(String modell, int leistung){
        setModell(modell);
        setLeistung(leistung);
    }

    public String getModell(){
        return modell;
    }

    public void setModell(String modell){
        this.modell = modell;
    }

    public int getLeistung(){
        return leistung;
    }

    public void setLeistung(int leistung){
        this.leistung = leistung;
    }
}

package programmierung2.testate.generalImplementations;


import java.util.Arrays;

//General Guidelines to important feautures to the Testat
public class FirstSampleObjectVO {

    private static final int MAX_DUMMYCLASSES = 10;
    private DummyClass[] dummyClasses;
    private int index;

    //Constructor


    public FirstSampleObjectVO(){
        super();
        setDummyClasses(new DummyClass[10]);
        this.index = 0;
    }


    //Array Methods

    public void addDummyClass(DummyClass dummyClass) {
        if (dummyClasses != null) {
            if (index < MAX_DUMMYCLASSES) {
                dummyClasses[index] = dummyClass;
                index++;
            }
        }
    }

    public void deleteDummyClass() {
        if (dummyClasses != null) {
            if (index > 0) {
                dummyClasses[index - 1] = null; // set object at position index - 1 null ...
                this.index--; // decrement index, minimum value of index is 0
            } else if (index == 0)
                dummyClasses[0] = null;
        }
    }

    public DummyClass getDummyCLass(int index) {
        if (dummyClasses != null) {
            if (index < MAX_DUMMYCLASSES && dummyClasses[index] != null)
                return dummyClasses[index];
            else
                return null;
        } else
            return null;
    }

    public int getNumberOfDummyClasses(){
        return index;
    }

    //Getter and Setter
    public static int getMAX_DUMMYCLASSES(){
        return MAX_DUMMYCLASSES;
    }

    public int getIndex(){
        return  index;
    }

    public DummyClass[] getDummyClasses() {
        return dummyClasses;
    }

    public void setDummyClasses(DummyClass[] dummyClasses) {
        this.dummyClasses = dummyClasses;
    }

    //Java Standard mehthods:

    @Override
    public String toString(){
        return "FirstSampleObjectVO{" + "dummyclasses=" + Arrays.toString(dummyClasses) + ", index=" + index + super.toString() +  "}";
    }

    @Override
    public boolean equals(Object o){
        if(this == o)
            return true;
        if(o == null || o.getClass() != this.getClass())
            return false;
        FirstSampleObjectVO other = (FirstSampleObjectVO) o;
        return Arrays.equals(this.dummyClasses, other.dummyClasses) && super.equals(other);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(dummyClasses);
    }
}

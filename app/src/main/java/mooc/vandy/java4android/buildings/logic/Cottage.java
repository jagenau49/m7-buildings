package mooc.vandy.java4android.buildings.logic;

/**
 * This is the cottage class file.  It is a subclass of House.
 */
public class Cottage
        extends House {

    // TODO - Put your code here.
    private boolean mSecondFloor;
    /*
    a Cottage (in this assignment) is always square and so, the length is equal to the width
and are both described by the single parameter dimension in the constructors.
     */

    public Cottage(int dimension, int lotLength, int lotWidth) { // constructor
super((int)Math.sqrt(dimension),(int)Math.sqrt(dimension),lotLength,lotWidth);
    }

    public Cottage(int dimension, int lotLength, int lotWidth, String owner, boolean
            secondFloor) { // constructor
        super((int)Math.sqrt(dimension),(int)Math.sqrt(dimension),lotLength,lotWidth,owner);
        this.mSecondFloor=secondFloor;

    }

    public boolean hasSecondFloor() {
        return this.mSecondFloor
    }

    public String toString(){
        String output=super.toString();
        if (hasSecondFloor()){
            output+="; is a two story cottage";
        }
        output+="; is a cottage";
        return output;

    }

}


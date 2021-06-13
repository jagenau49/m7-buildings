package mooc.vandy.java4android.buildings.logic;

import java.util.Objects;

/**
 * This is the House class file that extends Building.
 */
public class House
        extends Building {

    // TODO - Put your code here.
    private String mOwner;
    private boolean mPool;

    public House(int length, int width, int lotLength, int lotWidth) {
        super(length, width, lotLength, lotWidth);
        this.mOwner = null;
        this.mPool = false;

    } // constructor

    public House(int length, int width, int lotLength, int lotWidth, String owner) {
        super(length, width, lotLength, lotWidth);
        this.mOwner = owner;

    } //

    constructor

    public House(int length, int width, int lotLength, int lotWidth, String owner, boolean
            pool) {
        super(length, width, lotLength, lotWidth);
        this.mOwner = owner;
        this.mPool = pool;
    } // constructor


    public String getOwner() {
        return mOwner;
    }

    public boolean hasPool() {
    }

    public void setOwner(String mOwner) {
        this.mOwner = mOwner;
    }

    public void setPool(boolean mPool) {
        this.mPool = mPool;
    }

    @Override
    public String toString() { //TODO: Kagidin sonundaki ornek ciktiya uyarla 4. sayfa 2.maddede detaylari var
        String output=super.toString();
        if(this.hasPool()){output+="; has a pool";}
        return output;
    }

    @Override
    public boolean equals(Object o) {
        House mComparedHouse=(House)o;
        if((this.calcBuildingArea()==(mComparedHouse.calcBuildingArea()))&&(this.hasPool()==(mComparedHouse.hasPool()))){
            return true;
        }
        return false;



    }


}

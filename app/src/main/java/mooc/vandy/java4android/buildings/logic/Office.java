package mooc.vandy.java4android.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office
        extends Building {

    // TODO - Put your code here.
    private String mBusinessName;
    private int mParkingSpaces;
    private static int sTotalOffices=0;

    public Office(int length, int width, int lotLength, int lotWidth) {
        super(length,width,lotLength,lotWidth);
        mBusinessName=null;
        mParkingSpaces=0;
        sTotalOffices++;

    }

    public Office(int length, int width, int lotLength, int lotWidth, String businessName) {
        super(length,width,lotLength,lotWidth);
        this.mBusinessName=businessName;
        sTotalOffices++;
    }

    public Office(int length, int width, int lotLength, int lotWidth, String businessName,
                  int parkingSpaces) {
        super(length,width,lotLength,lotWidth);
        this.mBusinessName=businessName;
        this.mParkingSpaces=parkingSpaces;
        sTotalOffices++;
    }


    public String getBusinessName() {
        return mBusinessName;
    }

    public int getParkingSpaces() {
        return mParkingSpaces;
    }

    public static int getTotalOffices() {
        return sTotalOffices;
    }

    public void setBusinessName(String businessName) {
        mBusinessName=businessName;
    }


    public void setParkingSpaces(int parkingSpaces) {
        mParkingSpaces=parkingSpaces;
    }



    public String toString() {
        String output = super.toString();
        if (mBusinessName == null) {
            output += "unoccupied";
        } else {
            output += mBusinessName;
        }
        return output + " (total offices: " + sTotalOffices + ")";
    }



    public boolean equals(Object o) {
        Office mCorporatedOffice=(Office) o;
        int buildingAreaCorporated=mCorporatedOffice.calcBuildingArea();

        if((this.calcBuildingArea()==buildingAreaCorporated)&&(this.mParkingSpaces==mCorporatedOffice.mParkingSpaces)){
            return true;
        }
        return false;
    }

}



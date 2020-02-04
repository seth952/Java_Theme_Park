package stalls;

import behaviours.IReviewed;
import behaviours.ISecurity;


public class TobaccoStall extends Stall implements ISecurity, IReviewed {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() > 17)
        return true;
        else return false;
    }

    @Override
    public int getRating() {
        return 0;
    }
}

package attractions;


import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;

public class RollerCoaster  extends Attraction implements ISecurity, IReviewed, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }
    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getHeight() > 145 && visitor.getAge() > 11)
            return true;
        else return false;
    }

    @Override
    public double defaultPrice() {
        return 0;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return 0;
    }
}

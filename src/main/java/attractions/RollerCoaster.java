package attractions;


import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {

    private final double defaultPrice;

    public RollerCoaster(String name, int rating, double defaultPrice) {
        super(name, rating);
        this.defaultPrice = 8.40;
    }
    @Override
    public boolean isAllowedTo(Visitor visitor) {
       return (visitor.getHeight() > 1.45 && visitor.getAge() > 11);


        }

    @Override
    public double defaultPrice() {
        return this.defaultPrice;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() > 1.45) {

            return this.defaultPrice *2;
        }
        return defaultPrice;
    }
}






package attractions;


import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }
    @Override
    public boolean isAllowedTo(Visitor visitor) {
       return (visitor.getHeight() > 1.45 && visitor.getAge() > 11);


        }

    }






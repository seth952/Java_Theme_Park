package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;

public class Playground extends Attraction implements ISecurity, IReviewed {

    public Playground(String name, int rating) {
        super(name, rating);
    }


    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() < 16)
            return true;
        else return false;
    }
}

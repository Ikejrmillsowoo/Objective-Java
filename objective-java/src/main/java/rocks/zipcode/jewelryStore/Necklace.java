package rocks.zipcode.jewelryStore;
import java.util.Date;

public class Necklace {
    double price;
    String name;
    int item_id;
    Date date_created;

    public Necklace(double price, String name, int item_id, Date date_created){
        this.price = price;
        this.name = name ;
        this.item_id = item_id;
        this.date_created = date_created;
    }
}

package rocks.zipcode.jewelryStore;
import java.util.ArrayList;
import java.util.Date;

public class Necklace extends Store {
    double price;
    String name;
    int item_id;
    Date date_created;



    public Necklace(String name, String owner_name, ArrayList<String> proucts) {
        super(name, owner_name, proucts);
    }

   Store store = new Store("necklace", "store", null);
}

package rocks.zipcode.jewelryStore;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Store {
    private String name;
    private String owner_name;
     ArrayList<String> proucts;


    public static void main(String[] args) {
        ArrayList<String> stuff = new ArrayList<>(List.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"));
        Store store = new Store(null, null, null);
        store.setProucts(stuff);
        System.out.println(store.proucts);
    }

    public Store(String name, String owner_name, ArrayList<String> proucts) {
        this.name = name;
        this.owner_name = owner_name;
        this.proucts = proucts;
    }

    public void populateProducts(){
        for (int i = 0; i < 20; i++) {
            proucts.add(Integer.toString(i));
        }
        System.out.println(proucts.toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public ArrayList<String> getProucts() {
        return proucts;
    }

    public void setProucts(ArrayList<String> proucts) {
        this.proucts = proucts;
    }

    public void sell(){

    }
}

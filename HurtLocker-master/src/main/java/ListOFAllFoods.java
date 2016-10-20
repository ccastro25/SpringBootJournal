import java.util.HashMap;

/**
 * Created by castro on 10/17/16.
 */
public class ListOFAllFoods {



  private   HashMap<String,String> name = new HashMap<String, String>();
   private HashMap<String,String> price = new HashMap<String, String>();
    private HashMap<String,String> type = new HashMap<String, String>();
   private HashMap<String,String> expiration = new HashMap<String, String>();

    public ListOFAllFoods(HashMap<String, String> name, HashMap<String, String> price, HashMap<String, String> type, HashMap<String, String> expiration) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.expiration = expiration;
    }

    public ListOFAllFoods(String put, String put1) {
    }
    public HashMap<String, String> getName() {
        return name;
    }
    public void setName(HashMap<String, String> name) {
        this.name = name;
    }

    public HashMap<String, String> getPrice() {
        return price;
    }

    public void setPrice(HashMap<String, String> price) {
        this.price = price;
    }

    public HashMap<String, String> getType() {
        return type;
    }

    public void setType(HashMap<String, String> type) {
        this.type = type;
    }

    public HashMap<String, String> getExpiration() {
        return expiration;
    }

    public void setExpiration(HashMap<String, String> expiration) {
        this.expiration = expiration;
    }


}

/**
 * Created by castro on 10/17/16.
 */
public class ListOFItems {

    private String name ;
    private String price;
    private String type;
    private String experiration;




    public ListOFItems(String name, String price, String type, String experiration) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.experiration = experiration;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public String getExperiration() {
        return experiration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setExperiration(String experiration) {
        this.experiration = experiration;
    }
}

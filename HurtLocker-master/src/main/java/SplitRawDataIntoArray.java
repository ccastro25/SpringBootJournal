import java.util.ArrayList;

/**
 * Created by castro on 10/17/16.
 */
public class SplitRawDataIntoArray {
 private  Main main = new Main();


  private   String[] splittIntoItems;


    public void splitArray() {
        String list= null;
        try {
            list = main.readRawDataToString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        splittIntoItems = list.split("##");
    }


    public String[] getSplittIntoItems() {
        return splittIntoItems;
    }
}

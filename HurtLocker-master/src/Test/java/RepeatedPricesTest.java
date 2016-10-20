import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by castro on 10/18/16.
 */
public class RepeatedPricesTest {
    HashMap<String, ArrayList> prices ;
   HashMap<String,HashMap<String,String> > repeatePricesArray = new HashMap<String, HashMap<String, String>>();

    RepeatedPrices repeatedPrices = new RepeatedPrices();
    RepeatedNames repeatedNames= new RepeatedNames();

    @Before
    public void setUp(){

        repeatedNames.searchForItems();

        repeatePricesArray = repeatedPrices.getRepeatedNumbers();
        prices = repeatedPrices.getMapfAllPrices();
    }


    @Test
    public void fixPrintPrices() {
        repeatedPrices.addDuplicatesPrices();
        System.out.println(repeatedNames.getApplePrice());
        System.out.println(repeatedNames.getMilkPrice());
        System.out.println(repeatedNames.getBreadPrice());
        System.out.println(repeatedNames.getCookieAndPrice());

       Assert.assertTrue(" the arraylist is not populated ",repeatedNames.getApplePrice().contains("0.23"));
    }



    @Test
    public void placeArrayINHasMap(){
        repeatedPrices.addDuplicatesPrices();
        Assert.assertTrue(" does not have 4 elements",repeatedPrices.getMapfAllPrices().size()==4);
    }
    @Test
    public void checkRepeatedNumber(){
        repeatedPrices.startCheckingPrices();
        System.out.println(repeatePricesArray);

    }





}

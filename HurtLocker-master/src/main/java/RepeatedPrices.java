import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by castro on 10/18/16.
 */
public class RepeatedPrices {
    private RepeatedNames repeatedNames = new RepeatedNames();



    private HashMap<String,ArrayList > mapofAllPrices = new HashMap<String, ArrayList>();
    private Integer count;
    private String[] productPrices = {"Apples","Bread","Cookies","Milk"};
    private  ArrayList<String> doublePrices = new ArrayList<String>();

    public HashMap<String, HashMap<String, String>> getRepeatedNumbers() {
        return repeatedNumbers;
    }

    private  HashMap<String,HashMap<String,String>> repeatedNumbers = new HashMap<String, HashMap<String, String>>();
    private HashMap<String,String> innnerHas;
    private ArrayList<String> removePrices = new ArrayList<String>();

    @Test
    public void startCheckingPrices(){

        addDuplicatesPrices();
        lookthroughArrayOfPrices();
    }


    public void addDuplicatesPrices(){
        repeatedNames.searchForItems();
        mapofAllPrices.put("Apples",repeatedNames.getApplePrice());
        mapofAllPrices.put("Bread",repeatedNames.getBreadPrice());
        mapofAllPrices.put("Cookies",repeatedNames.getCookieAndPrice());
        mapofAllPrices.put("Milk",repeatedNames.getMilkPrice());



    }


    public void lookthroughArrayOfPrices(){



        for (String go : productPrices){
            filterThrougMap(go, mapofAllPrices.get(go));

        }
    }


    public RepeatedNames getRepeatedNames() {
        return repeatedNames;
    }

    public void filterThrougMap(String arrayName, ArrayList<String > prices){
        innnerHas = new HashMap<String, String>();
        Collections.sort(prices);
        doublePrices=prices;
        count=1;

        for (int i=0;i<prices.size();i++){

            for (int j = 0; j < doublePrices.size(); j++) {


                if (prices.get(i).contains(doublePrices.get(j)) && i != j) {
                    removePrices.add(prices.get(i));

                    count++;
                }

            }
            innnerHas.put(prices.get(i), String.valueOf(count));
            repeatedNumbers.put(arrayName, innnerHas);
            prices.removeAll(removePrices);
        }




    }





    public HashMap<String, ArrayList> getMapfAllPrices() {
        return mapofAllPrices;
    }
}

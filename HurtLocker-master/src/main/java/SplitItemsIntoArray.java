import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by castro on 10/17/16.
 */
public class SplitItemsIntoArray {




    private SplitRawDataIntoArray splitRawDataIntoArray = new SplitRawDataIntoArray();



    public ArrayList<ListOFItems> getArrayContainsListItems() {
        return arrayContainsListItems;
    }

    ArrayList<ListOFItems> arrayContainsListItems = new ArrayList<ListOFItems>();
    String[] rawdatatArray;
    String[] arrayWithSubPlitt;
    String name;
    String price;
    String type;
    String expiration;

    public String[] getArrayWithSubPlitt() {
        return arrayWithSubPlitt;
    }

    public void addingItemsToObject() {
        splitRawDataIntoArray.splitArray();
        rawdatatArray = splitRawDataIntoArray.getSplittIntoItems();

        for (int i = 0; i < rawdatatArray.length; i++) {

            arrayWithSubPlitt =splitByNOnAlphaNonNum(i);
                    name = arrayWithSubPlitt[0] + " :" + arrayWithSubPlitt[1];
            price = arrayWithSubPlitt[2] + " :" + arrayWithSubPlitt[3];
            type = arrayWithSubPlitt[4] + " :" + arrayWithSubPlitt[5];
            expiration = arrayWithSubPlitt[6] + " :" + arrayWithSubPlitt[7];
            arrayContainsListItems.add(new ListOFItems(name, price, type, expiration));


        }
    }
        public String[] splitByNOnAlphaNonNum(int i){
            return   rawdatatArray[i].split("[!@$%^&*;:]");
        }


    }














//
//    SplitRawDataIntoArray splitRawDataIntoArray = new SplitRawDataIntoArray();
//
//
//
//
//    private ArrayList<ListOFAllFoods> listWithKeyAndValueOFFood = new ArrayList<ListOFAllFoods>();
//    private String[] containSplitRawData;
//    private String[] arrayWithKeyandVlaue;
//    private HashMap<String,String> name = new HashMap<String, String>();
//    private HashMap<String,String> price = new HashMap<String, String>();
//    private HashMap<String,String> type= new HashMap<String, String>();
//    private HashMap<String,String> expiration= new HashMap<String, String>();
//
//    public void seperateInotKeyAndValuePair(){
//        splitRawDataIntoArray.splitArray();
//        containSplitRawData = splitRawDataIntoArray.getSplittIntoItems();
//
//
//
//        for (int i =0;i<containSplitRawData.length;i++){
//
//            arrayWithKeyandVlaue=  containSplitRawData[i].split("[!@$%^&*;:]");
//            name.put(arrayWithKeyandVlaue[0],arrayWithKeyandVlaue[1]);
//            price.put(arrayWithKeyandVlaue[2],arrayWithKeyandVlaue[3]);
//            type.put(arrayWithKeyandVlaue[4],arrayWithKeyandVlaue[5]);
//            expiration.put(arrayWithKeyandVlaue[6],arrayWithKeyandVlaue[7]);
//
//            listWithKeyAndValueOFFood.add(new ListOFAllFoods(name, price,type,expiration));
//        }
//
//
//    }
//
//    public ArrayList<ListOFAllFoods> getListWithKeyAndValueOFFood() {
//        return listWithKeyAndValueOFFood;
//    }

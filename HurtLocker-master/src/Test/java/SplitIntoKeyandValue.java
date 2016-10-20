import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by castro on 10/17/16.
 */
public class SplitIntoKeyandValue {

    ArrayList<ListOFItems> listOFAllFoodses = new ArrayList<ListOFItems>();
    SplitItemsIntoArray splitItemsIntoArray = new SplitItemsIntoArray();



    @Test
    public void testItemsINArray(){
        splitItemsIntoArray.addingItemsToObject();
        listOFAllFoodses = splitItemsIntoArray.getArrayContainsListItems();
        System.out.println(listOFAllFoodses.get(0).getPrice());
        System.out.println(listOFAllFoodses.get(1).getPrice());
        System.out.println(listOFAllFoodses.get(2).getPrice());
       Assert.assertTrue(listOFAllFoodses.size()==28);
    }





}



























//    SplitRawDataIntoArray splitRawDataIntoArray = new SplitRawDataIntoArray();
//
//    ArrayList<ListOFAllFoods> listWithKeyAndValueOFFood = new ArrayList<ListOFAllFoods>();
//    String[] containSplitRawData;
//    String[] arrayWithKeyandVlaue;
//    HashMap<String,String> name = new HashMap<String, String>();
//    HashMap<String,String> price = new HashMap<String, String>();
//    HashMap<String,String> type= new HashMap<String, String>();
//    HashMap<String,String> expiration= new HashMap<String, String>();
//
//    @Before
//    public void setUP(){
//
//        splitRawDataIntoArray.splitArray();
//        containSplitRawData = splitRawDataIntoArray.getSplittIntoItems();
//    }
//
//    @Test
//    public void putDataIntoObjectTest(){
//
//        for (int i =0;i<containSplitRawData.length;i++){
//
//            arrayWithKeyandVlaue=  containSplitRawData[i].split("[!@$%^&*;:]");
//            System.out.println( arrayWithKeyandVlaue[0]); System.out.println( arrayWithKeyandVlaue[1]);
//            name.put(arrayWithKeyandVlaue[0],arrayWithKeyandVlaue[1]);
//            System.out.println( arrayWithKeyandVlaue[2]); System.out.println( arrayWithKeyandVlaue[3]);
//            price.put(arrayWithKeyandVlaue[2],arrayWithKeyandVlaue[3]);
//            System.out.println( arrayWithKeyandVlaue[4]); System.out.println( arrayWithKeyandVlaue[5]);
//            type.put(arrayWithKeyandVlaue[4],arrayWithKeyandVlaue[5]);
//            System.out.println( arrayWithKeyandVlaue[6]); System.out.println( arrayWithKeyandVlaue[7]);
//            expiration.put(arrayWithKeyandVlaue[6],arrayWithKeyandVlaue[7]);
//
//            listWithKeyAndValueOFFood.add(new ListOFAllFoods(name, price,type,expiration));
//
//            System.out.println( "here sn "+price);
//        }
//
//
//        Assert.assertTrue(" array list doesnt have 28 objects ", containSplitRawData.length==28);
//    }
//
//    @Test
//    public void checkKeyAndValue(){
//        splitTheItemsInotKeyAndValue.seperateInotKeyAndValuePair();
//        System.out.println();
//    }
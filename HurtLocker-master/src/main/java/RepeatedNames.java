import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by castro on 10/18/16.
 */
public class RepeatedNames {
ListOFItems listOFItems;
   private CheckSpellingErrors checkSpellingErrors = new CheckSpellingErrors();
   private ArrayList<ListOFItems> arrayFilledWithSplitValuesAndKeys= new ArrayList<ListOFItems>();
    private ArrayList<String> milkandPrice = new ArrayList<String>();
    private ArrayList<String> breadandPrice = new ArrayList<String>();
    private ArrayList<String> appleAndPrice = new ArrayList<String>();
    private ArrayList<String> cookieAndPrice = new ArrayList<String>();

    private String milkpattern = "([mM][iI][Ll][kK])";
   private String cookiePattern = "([cC][oO0][o0O][kK][Ii][Ee][Ss])";
   private String applesPattern = "([aA][pP][pP][lL][eE][sS])";
   private String breadPattern = "([bB][rR][eE][aA][dD])";
   private int seenMilk;
   private int seenBread ;
   private int seenApple ;
   private int seenCookie;



@Test
    public void searchForItems(){

   checkSpellingErrors.startSpellCheck();
        arrayFilledWithSplitValuesAndKeys= checkSpellingErrors.getArrayWithListWithCorrectSpelling();
        for(int i =0;i<arrayFilledWithSplitValuesAndKeys.size();i++) {
            listOFItems=  arrayFilledWithSplitValuesAndKeys.get(i);

            searchThrwoughObjects(listOFItems);

       }
    }


    public void searchThrwoughObjects( ListOFItems listOFItems){
        String[] splittName = listOFItems.getName().split("[:]");
        String nameHalfOFArray="";
        String[] splitPrice = listOFItems.getPrice().split("[:]");
        String priceHalfOFArray="";

        try{ nameHalfOFArray=splittName[1];}catch (ArrayIndexOutOfBoundsException e){ }
        try{ priceHalfOFArray=splitPrice[1];}catch (ArrayIndexOutOfBoundsException e){ }

        conditionForMatchingArrays(nameHalfOFArray,priceHalfOFArray);
    }

    public void conditionForMatchingArrays(String nameHalfOFArray, String priceHalfOFArray){
       if (!nameHalfOFArray.matches("^(?![\\s\\S])")&&(!priceHalfOFArray.matches("^(?![\\s\\S])"))){



        if(nameHalfOFArray.matches(milkpattern)){
            milkandPrice.add(priceHalfOFArray);
            seenMilk++;}

        else if(nameHalfOFArray.matches(breadPattern)){
            breadandPrice.add(priceHalfOFArray);
            seenBread++;
        }
        else if(nameHalfOFArray.matches(cookiePattern )){
            cookieAndPrice.add(priceHalfOFArray);
            seenCookie++;}
        else if(nameHalfOFArray.matches(applesPattern)){
            appleAndPrice.add(priceHalfOFArray);
            seenApple++;}}

    }

    public ArrayList<String> getMilkPrice() {
        return milkandPrice;
    }

    public ArrayList<String> getBreadPrice() {
        return breadandPrice;
    }

    public ArrayList<String> getApplePrice() {
        return appleAndPrice;
    }

    public ArrayList<String> getCookieAndPrice() {
        return cookieAndPrice;
    }


    public int getSeenMilk() {
        return seenMilk;
    }

    public int getSeenBread() {
        return seenBread;
    }

    public int getSeenApple() {return seenApple;}

    public int getSeenCookie() {
        return seenCookie;
    }

}

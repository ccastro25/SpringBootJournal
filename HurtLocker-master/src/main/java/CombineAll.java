import org.junit.Test;

import java.util.*;

/**
 * Created by castro on 10/19/16.
 */
public class CombineAll {

    private CatchingErros catchingErros = new CatchingErros();
    private CheckSpellingErrors checkSpellingErrors = new CheckSpellingErrors();
    private RepeatedPrices repeatedPrices = new RepeatedPrices();
    private ArrayList<ListOFItems> correctLetters;
    private ListOFItems listOFItems;
    private TreeSet<String> sortedAndFilteredNames = new TreeSet<String>();
    private String[] lastChangeNameForItems;
    private HashMap<String, HashMap<String, String>> mapForPrices;
    private ArrayList<String >finalPrice = new ArrayList<>();
    private ArrayList<String >amountOFTimesPriceWasRepeated = new ArrayList<>();


    private ArrayList<String > sortedNames = new ArrayList<>();



    public void start() {
        checkSpellingErrors.startSpellCheck();
        repeatedPrices.startCheckingPrices();
        catchingErros.checkForErros();
        loopThroughArrayOFObjects();
       nameOFitemAterSortedAndFiltered();
        mapCompletelySeperated();
    }


    public void loopThroughArrayOFObjects() {
        correctLetters = checkSpellingErrors.getArrayWithListWithCorrectSpelling();
        for (int i = 0; i < correctLetters.size(); i++) {
            listOFItems = correctLetters.get(i);

            sortedAndFilteredNames.add(nameByItsSelf(listOFItems.getName()));
        }
    }

    public String nameByItsSelf(String nameWithColon) {
        lastChangeNameForItems = nameWithColon.split(":");
        try {
            return lastChangeNameForItems[1];
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Milk";
        }
    }




    public void mapCompletelySeperated() {

        mapForPrices = repeatedPrices.getRepeatedNumbers();
        for (Map.Entry<String, HashMap<String, String>> entry : mapForPrices.entrySet()) {
            HashMap<String, String> priceMap =    mapForPrices.get(entry.getKey());
            for (String go: priceMap.keySet()){
                finalPrice.add(go);

           amountOFTimesPriceWasRepeated.add(priceMap.get(go)) ;

            }

        }
    }




    public void nameOFitemAterSortedAndFiltered() {
        Iterator iterator;
        iterator = sortedAndFilteredNames.iterator();
        while (iterator.hasNext()){
        String filterdName =   iterator.next().toString();
         sortedNames.add(filterdName);

        }
    }






    public TreeSet<String> getSortedAndFilteredNames() {
        return sortedAndFilteredNames;
    }


    public ArrayList<String> getFinalPrice() {
        return finalPrice;
    }

    public ArrayList<String> getAmountOFTimesPriceWasRepeated() {
        return amountOFTimesPriceWasRepeated;
    }

    public ArrayList<String> getSortedNames() {
        return sortedNames;
    }
}

















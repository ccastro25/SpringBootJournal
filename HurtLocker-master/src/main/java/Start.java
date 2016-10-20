import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by castro on 10/20/16.
 */
public class Start {

    private RepeatedNames repeatedNames = new RepeatedNames();
    private CatchingErros catchingErros = new CatchingErros();
    private Dispay dispay = new Dispay();
    CombineAll combineAll = new CombineAll();
    private ArrayList<String> finalPrices = combineAll.getFinalPrice();
    private ArrayList<String> amountOFTimesPricehasBeenRepeated = combineAll.getAmountOFTimesPriceWasRepeated();
    private ArrayList<String> sortedNamesandNOCopies = combineAll.getSortedNames();
    private int seen = 0;




    public void setUp(){
        combineAll.start();
        catchingErros.getErrors();
        startApple();
        startBread();
        startCookie();
        startMilk();
        printErros();
    }


    public void startApple() {



        dispay.printNameAndSeen(sortedNamesandNOCopies.get(0),amountOFTimesPricehasBeenRepeated.get(3));
        dispay.printPriceAndSeenWithOUtLine(finalPrices.get(0), amountOFTimesPricehasBeenRepeated.get(1));
        dispay.printPriceAndSeenWithLine(finalPrices.get(1), amountOFTimesPricehasBeenRepeated.get(1));
    }


    public void startBread() {


       dispay.printNameAndSeen(sortedNamesandNOCopies.get(1), amountOFTimesPricehasBeenRepeated.get(2));
        dispay.printPriceAndSeenWithOUtLine(finalPrices.get(2), amountOFTimesPricehasBeenRepeated.get(1));
        dispay.printPriceAndSeenWithLine(finalPrices.get(0), amountOFTimesPricehasBeenRepeated.get(1));
    }


    public void startCookie() {


        dispay.printNameAndSeen(sortedNamesandNOCopies.get(2), amountOFTimesPricehasBeenRepeated.get(2));
        dispay.printPriceAndSeenWithOUtLine(finalPrices.get(2), amountOFTimesPricehasBeenRepeated.get(2));


}


    public void startMilk() {


        dispay.printNameAndSeen(sortedNamesandNOCopies.get(3),amountOFTimesPricehasBeenRepeated.get(1));
        dispay.printPriceAndSeenWithOUtLine(finalPrices.get(3), amountOFTimesPricehasBeenRepeated.get(2));
       dispay.printPriceAndSeenWithLine(finalPrices.get(2), amountOFTimesPricehasBeenRepeated.get(2));
    }


    public void printErros(){
catchingErros.checkForErros();
    dispay.printErros(catchingErros.getErrors());

}


}
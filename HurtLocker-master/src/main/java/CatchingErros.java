import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by castro on 10/18/16.
 */
public class CatchingErros {

    private   SplitItemsIntoArray splitItemsIntoArray = new SplitItemsIntoArray();
    private SplitRawDataIntoArray splitRawDataIntoArray = new SplitRawDataIntoArray();
    private String[] arraywithSubSplitt;



    private int errors = 0;


    public void checkForErros()  {
    splitRawDataIntoArray.splitArray();
       splitItemsIntoArray.addingItemsToObject();

        arraywithSubSplitt = splitItemsIntoArray.getArrayWithSubPlitt();
    for (int i = 0; i < splitRawDataIntoArray.getSplittIntoItems().length; i++) {
            arraywithSubSplitt = splitItemsIntoArray.splitByNOnAlphaNonNum(i);

            for (int j =0;j<8;j++){
            if (arraywithSubSplitt[j].matches("^(?![\\s\\S])")) {
                errors++;

            }

            }

        }

    }

    public int getErrors() {
        return errors;
    }






}

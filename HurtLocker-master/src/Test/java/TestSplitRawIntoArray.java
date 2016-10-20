import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by castro on 10/17/16.
 */
public class TestSplitRawIntoArray {

    SplitRawDataIntoArray splitArray = new SplitRawDataIntoArray();


    @Before
    public void setUPSplitArray(){
        try {
            splitArray.splitArray();
        }catch (Exception e){
            System.out.println("Exception thrown");
        }

    }


    @Test
    public  void TestSizeOFArray(){

        Assert.assertTrue(" lenght of array is not 28", splitArray.getSplittIntoItems().length==28);
    }




}

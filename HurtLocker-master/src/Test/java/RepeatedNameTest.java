import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by castro on 10/18/16.
 */
public class RepeatedNameTest {

    RepeatedNames repeatedNames = new RepeatedNames();

    ListOFItems listOFItems;

    @Before
    public void setUp(){
        repeatedNames.searchForItems();


    }

    @Test
    public void searchThroughObjectForBreadTest(){
        listOFItems = new ListOFItems("Name: Bread","3.33","Food","2/23/1923");
        repeatedNames.searchThrwoughObjects(listOFItems);
        Assert.assertTrue(" breadCounter is not counting", repeatedNames.getSeenBread()==6);
    }

    @Test
    public void searchThroughObjectForMilk(){
        listOFItems = new ListOFItems("milk","3.33","Food","2/23/1923");
        repeatedNames.searchThrwoughObjects(listOFItems);
        int actual = repeatedNames.getSeenMilk();

        Assert.assertTrue(" milkConter is not counting ",actual==8);
    }


    @Test
    public void searchThroughObjectForCookieTest(){
        listOFItems = new ListOFItems("Co0kies","3.33","Food","2/23/1923");
        repeatedNames.searchThrwoughObjects(listOFItems);
        Assert.assertTrue(" cookieCounter is not counting", repeatedNames.getSeenCookie()==8);
    }

    @Test
    public void searchThroughObjectForApple(){
        listOFItems = new ListOFItems("name:aPPles","3.33","Food","2/23/1923");
        repeatedNames.searchThrwoughObjects(listOFItems);
        Assert.assertEquals(" milkConter is not counting ", repeatedNames.getSeenApple(),5);
    }



    @Test
    public void testNamesSizeOfErrors(){


       int total= repeatedNames.getSeenCookie()+ repeatedNames.getSeenApple()+ repeatedNames.getSeenBread()+ repeatedNames.getSeenMilk();


        Assert.assertTrue(" the repeated values is less than 26 ",total==26);
    }





}

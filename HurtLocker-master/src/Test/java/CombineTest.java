import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by castro on 10/19/16.
 */
public class CombineTest {

CombineAll combineAll = new CombineAll();

@Before
public void setup()
{
    combineAll.start();
}


@Test
public void nameAloneTest(){
    Assert.assertEquals(" does not split and return the second part of string",combineAll.nameByItsSelf("name:Castro"),"Castro");
}


@Test
    public void checkingSetArray(){

    Assert.assertEquals(" does not have 4 strings ",combineAll.getSortedAndFilteredNames().toString(),"[Apples, Bread, Cookies, Milk]");
}
}

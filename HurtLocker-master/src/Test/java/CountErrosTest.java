import org.junit.Assert;
import org.junit.Test;

/**
 * Created by castro on 10/18/16.
 */
public class CountErrosTest {


CatchingErros erros = new CatchingErros();


    @Test
    public void countErroTest(){
      try{  erros.checkForErros();}
      catch (Exception e){
          System.out.println("not a letter");
      }


     Assert.assertTrue(" does not return 4 errors", erros.getErrors()==4);
    }


}

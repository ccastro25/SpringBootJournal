import org.junit.Test;

/**
 * Created by castro on 10/18/16.
 */


public class Dispay {



    public  void printNameAndSeen( String actualName,String seen){

        System.out.printf("%2s%-7s%-17s%-9s%-5s%-5s%n","name",":",actualName,"seen:",seen,"times");
        System.out.printf("%-28s%1s%n","==================","====================");

    }

 public  void printPriceAndSeenWithLine( String price,String seen){

        System.out.printf("%2s%-7s%-16s%-9s%-5s%-5s%n%n","Price",":",price,"seen:",seen,"times");


    }


    public  void printPriceAndSeenWithOUtLine( String price,String seen){

        System.out.printf("%2s%-7s%-16s%-9s%-5s%-5s%n","Price",":",price,"seen:",seen,"times");
        System.out.printf("%-28s%1s%n","------------------","--------------------");

    }


    public  void printErros(int seen){

        System.out.printf("%2s%-23s%-9s%-5s%-5s%n","Erros",":","seen:",seen,"times");


    }


}

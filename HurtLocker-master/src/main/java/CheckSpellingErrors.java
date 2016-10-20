import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by castro on 10/17/16.
 */
public class CheckSpellingErrors {

    SplitItemsIntoArray splitItemsIntoArray = new SplitItemsIntoArray();



    private ArrayList<ListOFItems> arrayWithListWithCorrectSpelling = new ArrayList<ListOFItems>();
    private String namePattern = "(([nN][Aa][Mm][eE])) ";
    private String milkpattern = "([mM][iI][Ll][kK])";
    private String typepattern = "([Tt][yY][pP][eE])";
    private String foodPattern = "([fF][oO][oO][dD])";
    private String expiration = "([eE][Xx][Pp][iI][rR][aA][tT][iI][oO][nN])";
    private String cookiePattern = "([cC][oO0][o0O][kK][Ii][Ee][Ss])";
    private String applesPattern = "([aA][pP][pP][lL][eE][sS])";
    private String breadPattern = "([bB][rR][eE][aA][dD])";
    private String patternPrice = "([Pp][rR][iI][cC][eE])";
    String[] incorrectSpelling ={namePattern,milkpattern,breadPattern,applesPattern,cookiePattern,typepattern,foodPattern,
            expiration,patternPrice};
    String[] correctSpelling = {"Name","Milk","Bread","Apples","Cookies","Type","Food","Expiration","Price"};



    public void startSpellCheck(){
        splitItemsIntoArray.addingItemsToObject();
        arrayWithListWithCorrectSpelling = splitItemsIntoArray.getArrayContainsListItems();
        changeName();
        changeMilk();
        changeBread();
        changeApples();
        changeCookies();
        changeType();
        changeFood();
        changeExpire();
        changePrice();

    }

    public void changeName() {

        Pattern pattern;
        for (int i = 0; i < arrayWithListWithCorrectSpelling.size(); i++) {
            arrayWithListWithCorrectSpelling.get(i).getName();
                 pattern = Pattern.compile(incorrectSpelling[0]);
                Matcher matcher = pattern.matcher(arrayWithListWithCorrectSpelling.get(i).getName());
                String replaceAll = matcher.replaceAll(correctSpelling[0]);
                arrayWithListWithCorrectSpelling.get(i).setName(replaceAll);


    }
    }



            public void changeMilk(){

                Pattern pattern;
                for (int i = 0; i < arrayWithListWithCorrectSpelling.size(); i++) {
                    arrayWithListWithCorrectSpelling.get(i).getName();
                    pattern = Pattern.compile(incorrectSpelling[1]);
                    Matcher matcher = pattern.matcher(arrayWithListWithCorrectSpelling.get(i).getName());
                    String replaceAll = matcher.replaceAll(correctSpelling[1]);
                    arrayWithListWithCorrectSpelling.get(i).setName(replaceAll);


                }
            }

    public void changeBread(){

        Pattern pattern;
        for (int i = 0; i < arrayWithListWithCorrectSpelling.size(); i++) {
            arrayWithListWithCorrectSpelling.get(i).getName();
            pattern = Pattern.compile(incorrectSpelling[2]);
            Matcher matcher = pattern.matcher(arrayWithListWithCorrectSpelling.get(i).getName());
            String replaceAll = matcher.replaceAll(correctSpelling[2]);
            arrayWithListWithCorrectSpelling.get(i).setName(replaceAll);


        }


        }

    public void changeApples() {

        Pattern pattern;
        for (int i = 0; i < arrayWithListWithCorrectSpelling.size(); i++) {
            arrayWithListWithCorrectSpelling.get(i).getName();
            pattern = Pattern.compile(incorrectSpelling[3]);
            Matcher matcher = pattern.matcher(arrayWithListWithCorrectSpelling.get(i).getName());
            String replaceAll = matcher.replaceAll(correctSpelling[3]);
            arrayWithListWithCorrectSpelling.get(i).setName(replaceAll);


        }
    }



    public void changeCookies(){

        Pattern pattern;
        for (int i = 0; i < arrayWithListWithCorrectSpelling.size(); i++) {
            arrayWithListWithCorrectSpelling.get(i).getName();
            pattern = Pattern.compile(incorrectSpelling[4]);
            Matcher matcher = pattern.matcher(arrayWithListWithCorrectSpelling.get(i).getName());
            String replaceAll = matcher.replaceAll(correctSpelling[4]);
            arrayWithListWithCorrectSpelling.get(i).setName(replaceAll);


        }
    }

    public void changeType(){

        Pattern pattern;
        for (int i = 0; i < arrayWithListWithCorrectSpelling.size(); i++) {
            arrayWithListWithCorrectSpelling.get(i).getType();
            pattern = Pattern.compile(incorrectSpelling[5]);
            Matcher matcher = pattern.matcher(arrayWithListWithCorrectSpelling.get(i).getType());
            String replaceAll = matcher.replaceAll(correctSpelling[5]);
            arrayWithListWithCorrectSpelling.get(i).setType(replaceAll);


        }


    }

    public void changeFood(){

        Pattern pattern;
        for (int i = 0; i < arrayWithListWithCorrectSpelling.size(); i++) {

            pattern = Pattern.compile(incorrectSpelling[6]);
            Matcher matcher = pattern.matcher(arrayWithListWithCorrectSpelling.get(i).getType());
            String replaceAll = matcher.replaceAll(correctSpelling[6]);
            arrayWithListWithCorrectSpelling.get(i).setType(replaceAll);


        }
    }

    public void changeExpire(){

        Pattern pattern;
        for (int i = 0; i < arrayWithListWithCorrectSpelling.size(); i++) {

            pattern = Pattern.compile(incorrectSpelling[7]);
            Matcher matcher = pattern.matcher(arrayWithListWithCorrectSpelling.get(i).getExperiration());
            String replaceAll = matcher.replaceAll(correctSpelling[7]);
            arrayWithListWithCorrectSpelling.get(i).setExperiration(replaceAll);


        }


    }
    public void changePrice(){

        Pattern pattern;
        for (int i = 0; i < arrayWithListWithCorrectSpelling.size(); i++) {

            pattern = Pattern.compile(incorrectSpelling[8]);
            Matcher matcher = pattern.matcher(arrayWithListWithCorrectSpelling.get(i).getPrice());
            String replaceAll = matcher.replaceAll(correctSpelling[8]);
            arrayWithListWithCorrectSpelling.get(i).setPrice(replaceAll);


        }


    }


    public ArrayList<ListOFItems> getArrayWithListWithCorrectSpelling() {
        return arrayWithListWithCorrectSpelling;
    }

}





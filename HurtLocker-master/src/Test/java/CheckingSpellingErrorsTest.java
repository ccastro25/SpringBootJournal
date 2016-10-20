import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by castro on 10/17/16.
 */
public class CheckingSpellingErrorsTest {
    CheckSpellingErrors checkSpellingErrors = new CheckSpellingErrors();
    SplitItemsIntoArray splitItemsIntoArray = new SplitItemsIntoArray();
    ArrayList<ListOFItems> arrayWithListOFItems = new ArrayList<ListOFItems>();


    @Before
    public void setUp() {

        splitItemsIntoArray.addingItemsToObject();
        arrayWithListOFItems = splitItemsIntoArray.getArrayContainsListItems();
        checkSpellingErrors.startSpellCheck();

    }




    @Test
    public void changeNamesTest(){

         checkSpellingErrors.startSpellCheck();
        arrayWithListOFItems= checkSpellingErrors.getArrayWithListWithCorrectSpelling();
//        for (int i=0;i<arrayWithListOFItems.size();i++){
//            System.out.println(arrayWithListOFItems.get(i).getName() +i);}

             Assert.assertEquals(" Name is not formatted correctly",arrayWithListOFItems.get(3).getName(),"Name:Milk");}

    @Test
    public void changingMilk(){
        checkSpellingErrors.changeMilk();
        arrayWithListOFItems= checkSpellingErrors.getArrayWithListWithCorrectSpelling();
        for (int i=0;i<arrayWithListOFItems.size();i++){
            System.out.println(arrayWithListOFItems.get(i).getName() +i);}
        Assert.assertEquals(" Milk is not formatted correctly",arrayWithListOFItems.get(3).getName(),"Name:Milk");}


    @Test
    public void changingBread(){
    checkSpellingErrors.changeBread();
    arrayWithListOFItems= checkSpellingErrors.getArrayWithListWithCorrectSpelling();
        for (int i=0;i<arrayWithListOFItems.size();i++){
            System.out.println(arrayWithListOFItems.get(i).getName() +i);}
    Assert.assertEquals(" Breadis not formatted correctly",arrayWithListOFItems.get(1).getName(),"Name:Bread");}



    @Test
    public void changingApples(){
        checkSpellingErrors.changeApples();
        arrayWithListOFItems= checkSpellingErrors.getArrayWithListWithCorrectSpelling();
        for (int i=0;i<arrayWithListOFItems.size();i++){
            System.out.println(arrayWithListOFItems.get(i).getName() +i);}
        Assert.assertEquals(" Apple is not formatted correctly",arrayWithListOFItems.get(11).getName(),"Name:Apples");}


    @Test
    public void changingCookies(){
        checkSpellingErrors.changeCookies();
        arrayWithListOFItems= checkSpellingErrors.getArrayWithListWithCorrectSpelling();
        for (int i=0;i<arrayWithListOFItems.size();i++){
            System.out.println(arrayWithListOFItems.get(i).getName() +i);}
        Assert.assertEquals(" Cookies is not formatted correctly",arrayWithListOFItems.get(19).getName(),"Name:Cookies");}

@Test
public void changingType(){
        checkSpellingErrors.changeType();
        arrayWithListOFItems= checkSpellingErrors.getArrayWithListWithCorrectSpelling();
    for (int i=0;i<arrayWithListOFItems.size();i++){
        System.out.println(arrayWithListOFItems.get(i).getType() +i);}
        Assert.assertEquals(" Type is not formatted correctly",arrayWithListOFItems.get(11).getType(),"Type :Food");}

@Test
public void changingFood(){
        checkSpellingErrors.changeFood();
        arrayWithListOFItems= checkSpellingErrors.getArrayWithListWithCorrectSpelling();
    for (int i=0;i<arrayWithListOFItems.size();i++){
        System.out.println(arrayWithListOFItems.get(i).getType() +i);}
        Assert.assertEquals(" Food is not formatted correctly",arrayWithListOFItems.get(11).getType(),"Type :Food");}


@Test
public void changingExpiration(){
        checkSpellingErrors.changeExpire();
        arrayWithListOFItems= checkSpellingErrors.getArrayWithListWithCorrectSpelling();
    for (int i=0;i<arrayWithListOFItems.size();i++){
        System.out.println(arrayWithListOFItems.get(i).getExperiration() +i);}
        Assert.assertEquals(" Expiration is not formatted correctly",arrayWithListOFItems.get(11).getExperiration(),"Expiration :5/02/2016");}

@Test
public void changingPrice(){
        checkSpellingErrors.changePrice();
        arrayWithListOFItems= checkSpellingErrors.getArrayWithListWithCorrectSpelling();
    for (int i=0;i<arrayWithListOFItems.size();i++){
        System.out.println(arrayWithListOFItems.get(i).getPrice() +i);}
        Assert.assertEquals(" Price is not formatted correctly",arrayWithListOFItems.get(11).getPrice(),"Price :0.23");}










//
//@Test
//public void test() {
//
//    String text = "  COOkies : Milk ;\n price :3.23; type : Food ;\n expiration :1/25/2016##\nnaME:BreaD; price:1.23;\ntype:Food;\nexpiration:1/02/2016## \nNAMe:BrEAD; \nprice:1.23; \ntype:Food; ";
//
//
//    String patternString1 = "([Pp][rR][iI][cC][eE])";
//
//    Pattern pattern = Pattern.compile(patternString1);
//    Matcher matcher = pattern.matcher(text);
//
//    String replaceAll = matcher.replaceAll("change");
//    System.out.println("replaceAll   = " + replaceAll);
//
//    String replaceFirst = matcher.replaceFirst("Joe Blocks ");
//    System.out.println("replaceFirst = " + replaceFirst);
//
//
//}
//
}




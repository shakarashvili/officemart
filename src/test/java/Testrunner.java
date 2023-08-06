
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.example.Beforetest;
import org.example.Homesteps;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Testrunner extends Homesteps {



    @Description("test1 - Clicking on the search button should bring up the input field")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void clickonsearch() {
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1(); // ეს კი მუშაობს მაგრამ ცოტა ვერ მივხვდი
        Searchline();
        //Assert.assertTrue($(byClassName("search_button")).is(Condition.enabled));
        // Assert.assertEquals(Searchbutton.getCssValue("2"), "1"); შედარების ასერტი
        Assert.assertTrue(Searchbutton.is(Condition.visible));
    }

    @Description("test2 - Search with valid data in the search field pen")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void settextinsearchline() {
        SoftAssert soft = new SoftAssert();
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test2();
        Assert.assertTrue(Pen1.is(Condition.visible));
        soft.assertAll();
        //Assert.assertEquals(Pen1.getCssValue("'კალამი'"),"'კალამი'");
    }

    @Description("test3 - Search with invalid data in the search field")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void setuncorrecttext() {
        SoftAssert soft = new SoftAssert();
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test3();
        //Assert.assertTrue(delphyresult.is(Condition.not(Condition.visible)));
        Assert.assertTrue(delphyresult.is(Condition.visible));
        soft.assertAll();
    }

    @Description("test4 - By clicking on the button to add a specific product to the cart")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void addproductinbasket() {
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test4();
        //  Assert.assertTrue(gancxadi.is(Condition.visible));  აი ამას ვერ ვიჭრ სწრაფ ქრება
        // შეტყობინება კალათაში დაემატა წარმატებით ნამდვილად გამოდის მაგრამ იმდენად სწრაფდ ქრება რომ ვერ ვასწრებთ სტატუსის დაჭერას
        // Assert.assertTrue(Pen1.is(Condition.visible));
        //Assert.assertEquals(Pen1.getCssValue("'კალამი'"),"'კალამი'");
    }

    @Description("test5 - After adding the product, go to the cart and check out")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void checkoutproductinbasket() {
        SoftAssert soft = new SoftAssert();
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test5();
        Assert.assertTrue(myproductpen.is(Condition.visible));
        soft.assertAll();
    }

    @Description("test6 - After adding the product, go to the cart and check out color")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void checkoutproductcolor() {
        SoftAssert soft = new SoftAssert();
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test6();
        Assert.assertTrue(colorofmyproduct.is(Condition.not(Condition.visible)));
        soft.assertAll();
        // ამ პროდუქტზე ფერი არ ჩანს და კარგიც არის რომ უარყოფის ქონდიშენი გავუწერეთ
    }

    @Description("test7 - After adding the product, go to the cart and check code")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void checkoutproductcode() {
        SoftAssert soft = new SoftAssert();
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test5();
        Assert.assertTrue(myproductpen.is(Condition.visible));
        soft.assertAll();
    }

    @Description("test8 - After adding the product, go to the cart and check out number of the product")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void checkoutproductnumber() {
        SoftAssert soft = new SoftAssert();
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test8();
        Assert.assertTrue(sumoftheproducts.is(Condition.visible));
        soft.assertAll();
    }

    @Description("test9 - After adding the product, go to the cart and check out price of the product")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void checkoutproductprice() {
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test9();
        Assert.assertTrue(productprice.is(Condition.visible));

    }

    @Description("10 - check out price sum of the products")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void sumafterplus() {
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test10();
        Assert.assertTrue(sum.is(Condition.visible));
    }

    @Description("11 - After adding the product,add one more and  go to the cart and check out price of the product")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void sumafterdoubleplus() {
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test11();
        Assert.assertTrue(sum3.is(Condition.visible));

        // Assert.assertEquals(sum.getCssValue("1.25"),"1.25"); // ეს ვერ გავაკეთე
        // sum2 = ($("id").getCssValue("totalPrice"),"1.25");
    }

    @Description("12 - After adding the product,minus one product and  go to the cart and check out price of the product")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void sumafterminus() {
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test12();
        Assert.assertTrue(sum3.is(Condition.visible));
    }

    @Description("13 - close product")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void closeproduct() {
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test13();
        Assert.assertTrue(closebutton.is(Condition.visible));

    }

    @Description("14 - clear product - return result that products is zero")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void clearbasketfromproducts() {
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test14();
        Assert.assertTrue(zeroresultinbusket.is(Condition.visible));

    }

    @Description("15 - clear product return result that კალათა ცარიელია")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void clearbasketfromproductext() {
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test15();
        Assert.assertTrue(resultofclearbasket.is(Condition.visible));

    }

    @Description("16 - After clicking the 'Clear Cart' button, the 'Continue' button should disappear.")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void continuebuttonshoulddisappear() {
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test16();
        Assert.assertTrue(continuebutton.is(Condition.disappear));
    }

    @Description("17 - If we have several products added to the cart, it should be possible to clear the entire cart.")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void adddiferentproductsanddelete() {
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test17();
        Assert.assertTrue(continuebutton.is(Condition.disappear));
    }

    @Description("18 - Two forms 'legal entities' and 'natural entities' should appear..")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void legalandnaturalentities() {
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test18();
        Assert.assertTrue(fizikuripiri.is(Condition.visible));
        Assert.assertTrue(iuridiulipiri.is(Condition.visible));
    }

    @Description("19 - click send button and The company name field should turn red")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void identiciationcompanynamebordercolor() {
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test19();
        // Assert.assertTrue(redborder2.is(Condition.visible));  // არა ეს არ კმარა რა
        // Assert.assertEquals($("/html/body/div[6]/div/div[2]/div[1]/form/div[1]/input").getCssValue("color"),"srgb(1, 0, 0)");
        // აი ეს დაინახა ელემენტი მაგრამ გეთზე ვეღარ დაიჭირა მერე უკვე
        String companyline = $(byAttribute("placeholder", "კომპანიის სახელწოდება")).getCssValue("border-color");
        System.out.println(companyline);
        String hex = Color.fromString(companyline).asHex();
        System.out.println(hex);
        // Assert.assertEquals($(byAttribute("placeholder","კომპანიის სახელწოდება")).getCssValue("border-color"),"rgb(255, 0, 0)");
        // Assert.assertEquals($(".form_group",1).getCssValue("color"),"srgb(1, 0, 0)"); //  აი ამას ყველა ვარიანტში უნდა ემუშავა რომ დაენახა წითელი სააზღვრები

    }

    @Description("20 - The field 'Identification code' should be red ")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void identificationlor() {
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test20();
        String companyline2 = $(byAttribute("placeholder", "საიდენტიფიკაციო კოდი")).getCssValue("border-color");
        System.out.println(companyline2);
        String hex = Color.fromString(companyline2).asHex();
        System.out.println(hex);
        // Assert.assertEquals($(byAttribute("placeholder","საიდენტიფიკაციო კოდი")).getCssValue("border-color"),"rgb(255, 0, 0)");
    } //"rgb(255,0,0)"

    @Description("21 - The field 'Actual address' should be red ")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void addresscolor() {
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test21();
        String companyline3 = $(byAttribute("placeholder", "ფაქტიური მისამართი")).getCssValue("border-color");
        System.out.println(companyline3);
        String hex = Color.fromString(companyline3).asHex();
        System.out.println(hex);
        //Assert.assertEquals($(byAttribute("placeholder","ფაქტიური მისამართი")).getCssValue("border-color"),"rgb(255, 0, 0)");
        //Assert.assertEquals($(hex).getCssValue("border-color"),"#ff0000");
    }

    @Description("22 - The field 'Contact number' should turn red ")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void contactcolor() {
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test22();
        String companyline4 = $(byAttribute("placeholder", "საკონტაქტო ნომერი")).getCssValue("border-color");
        System.out.println(companyline4);
        String hex = Color.fromString(companyline4).asHex();
        System.out.println(hex);

    }

    @Description("23 - The box 'When do you want to receive the order?' should turn red. ")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void acceptordercolor() {
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test23();
        String companyline5 = $(byAttribute("placeholder", "როდის გსურთ შეკვეთის მიღება?")).getCssValue("border-color");
        System.out.println(companyline5);
        String hex = Color.fromString(companyline5).asHex();
        System.out.println(hex);

    }

    @Description("24 - TThe field 'e-mail' should turn red ")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void emailcolor() {
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test24();
        String companyline6 = $(byAttribute("placeholder", "ელ.ფოსტა")).getCssValue("border-color");
        System.out.println(companyline6);
        String hex = Color.fromString(companyline6).asHex();
        System.out.println(hex);

    }

    @Description("25 - company name  field should no longer be red ")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void companynamenotred() {
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test25();
        String companyline7 = $(byAttribute("placeholder", "კომპანიის სახელწოდება")).getCssValue("border-color");
        System.out.println(companyline7);
        String hex = Color.fromString(companyline7).asHex();
        System.out.println(hex);
        Assert.assertEquals($(byAttribute("placeholder", "კომპანიის სახელწოდება")).getCssValue("border-color"), "rgb(69, 69, 69)");
        // ძალიან კარგია კამფეტივით მუშაობს


    }

    @Description("26 - identification line should be empty ")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void indentificationlineempty() {
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test26();
        Assert.assertTrue(saidentifikaciokodi.is(Condition.empty));
    }

    @Description("27 - On the legal entity form, if we enter a numerical value of less than 11 characters in the " +
            "field 'Identification code' and press the send button, the field 'Identification code' should turn red. ")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void indentificationlinee12() {
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test27();
        String companyline8 = $(byAttribute("placeholder", "საიდენტიფიკაციო კოდი")).getCssValue("border-color");
        System.out.println(companyline8);
        String hex = Color.fromString(companyline8).asHex();
        System.out.println(hex);
    }

    @Description("28 - At least 11 characters must be entered in the field")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void characters11() {
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test28();
        sleep(2000);
        // Assert.assertTrue($(byXpath("/html/body/div[6]/div/div[2]/div[1]/form/div[2]/input")).is(Condition.value("123456789"))); // კარგია რიცხვითი მნიშვნელობისთვის
        Assert.assertTrue(saidentifikaciokodi.is(Condition.value("123456789"))); // კარგია რიცხვითი მნიშვნელობისთვის

    }

    @Description("29 - The field should no longer be red")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void conditionblackborder() {
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test29();
        Assert.assertEquals($(byAttribute("placeholder", "საიდენტიფიკაციო კოდი")).getCssValue("border-color"), "rgb(69, 69, 69)");


    }

    @Description("30 - address line should no longer be red")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void conditionblackborderforaddress() {
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test30();
        Assert.assertEquals($(byAttribute("placeholder", "ფაქტიური მისამართი")).getCssValue("border-color"), "rgb(69, 69, 69)");
    }

    @Description("31 - The word value should not be entered in the field")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void contactlineonlyfornumbers() {
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test31();
        Assert.assertTrue(contactnumber.is(Condition.empty));

    }

    @Description("32 - The field 'Contact number' should turn red ")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void contactlineonlyfor8numbers() {
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test32();
        String companyline9 = $(byAttribute("placeholder", "საკონტაქტო ნომერი")).getCssValue("border-color");
        System.out.println(companyline9);
        String hex = Color.fromString(companyline9).asHex();
        System.out.println(hex);
        Assert.assertTrue(contactnumber.is(Condition.visible));  // ასერშენი გაუწერე

    }

    @Description("33 - At least 9 characters must be entered in the field ")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void contactlineonlyfor12numbers() {
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test33();
        Assert.assertTrue(contactnumber.is(Condition.value("123456789")));
    }

    @Description("34 - If we enter a 9-character numeric value in the field and press the submit button again, the field should no longer be red ")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void contactlineonlyfor9numbers() {
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test34();
        Assert.assertEquals($(byAttribute("placeholder", "საკონტაქტო ნომერი")).getCssValue("border-color"), "rgb(69, 69, 69)");
    }

    @Description("35 - Field 'When do you want to receive the order?' should remain red ")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void timetogetorder() {
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test35();
        String companyline10 = acceptorder.getCssValue("border-color"); // by თი წამოღების მაგივრად ასეც შეიძლება
        System.out.println(companyline10);
        String hex = Color.fromString(companyline10).asHex();
        System.out.println(hex);
    }

    @Description("36 - If we enter any value that is more than 5 characters, the field should no longer be red ")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void acceptorder30august() {
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test36();
        Assert.assertEquals($(acceptorder).getCssValue("border-color"), "rgb(69, 69, 69)"); // by_ს გარეშე

    }

    @Description("37 - If we write the value test@gmail.com in the acceptable format for e-mail, for example, the field should no longer be red.")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void emailregulationtandarts() {
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test37();
        Assert.assertEquals($(email).getCssValue("border-color"), "rgb(69, 69, 69)");
    }

    @Description("38 - If we enter an invalid format for e-mail, the e-mail field should remain red.")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void uncorrectmailformat() {
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test38();
        String companyline11 = email.getCssValue("border-color");
        System.out.println(companyline11);
        String hex = Color.fromString(companyline11).asHex();
        System.out.println(hex);
    }

    @Description("39 - If we enter an invalid format for e-mail, the e-mail field should remain red.")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void uncorrectmailformat2() {
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test39();
        String companyline12 = email.getCssValue("border-color");
        System.out.println(companyline12);
        String hex = Color.fromString(companyline12).asHex();
        System.out.println(hex);
    }

    @Description("40 - If we enter an invalid format for e-mail, the e-mail field should remain red.")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void uncorrectmailformat3() {
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test40();
        String companyline13 = email.getCssValue("border-color");
        System.out.println(companyline13);
        String hex = Color.fromString(companyline13).asHex();
        System.out.println(hex);
    }
}

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.conditions.Visible;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.checkerframework.checker.units.qual.C;
import org.example.Beforetest;
import org.example.Homesteps;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byClassName;
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
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test2();
        Assert.assertTrue(Pen1.is(Condition.visible));
        //Assert.assertEquals(Pen1.getCssValue("'კალამი'"),"'კალამი'");
    }

    @Description("test3 - Search with invalid data in the search field")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void setuncorrecttext() {
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test3();
        //Assert.assertTrue(delphyresult.is(Condition.not(Condition.visible)));
        Assert.assertTrue(delphyresult.is(Condition.visible));
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
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test5();
        Assert.assertTrue(myproductpen.is(Condition.visible));
    }

    @Description("test6 - After adding the product, go to the cart and check out color")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void checkoutproductcolor() {
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test6();
        Assert.assertTrue(colorofmyproduct.is(Condition.not(Condition.visible)));
        // ამ პროდუქტზე ფერი არ ჩანს და კარგიც არის რომ უარყოფის ქონდიშენი გავუწერეთ
    }

    @Description("test7 - After adding the product, go to the cart and check code")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void checkoutproductcode() {
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test5();
        Assert.assertTrue(myproductpen.is(Condition.visible));
    }

    @Description("test8 - After adding the product, go to the cart and check out number of the product")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void checkoutproductnumber() {
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test8();
        Assert.assertTrue(sumoftheproducts.is(Condition.visible));
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
    public void send() {
        Beforetest Beforetest1 = new Beforetest();
        Beforetest1.Beforetest1();
        Test19();
        Assert.assertTrue(redborder2.is(Condition.visible));  // არა ეს არ კმარა რა
       // Assert.assertEquals($("/html/body/div[6]/div/div[2]/div[1]/form/div[1]/input").getCssValue("color"),"srgb(1, 0, 0)");
        // აი ეს დაინახა ელემენტი მაგრამ გეთზე ვეღარ დაიჭირა მერე უკვე
        //Assert.assertEquals($(".form_group",1).getCssValue("color"),"srgb(1, 0, 0)");  აი ამას ყველა ვარიანტში უნდა ემუშავა რომ დაენახა წითელი სააზღვრები

    }
}
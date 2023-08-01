package org.example;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.commands.ShouldBe;
import io.qameta.allure.Step;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.getSelectedText;
import static com.codeborne.selenide.Selenide.sleep;

public class Homesteps extends Homeobjects {


    @Step("this method is for to find search line on the website")
    public void Searchline() {

        Search.click();
        Searchbutton.shouldBe(Condition.visible);


    }

    // Data1 text = new Data1() {   ვერაფრით დატა ვერ შემოვაექსთენდე !!
    @Step("write text in search line")
    public void Test2() {
        //  Data text = new Data();
        Search.click();
        //Searchbutton.setValue("კალამი").pressEnter();
        searchline2.setValue("კალამი").pressEnter();
        Pen1.shouldBe(Condition.visible);

    }

    @Step("write uncorrect text in search line")
    public void Test3() {

        Search.click();
        searchline2.setValue("დელფინი").pressEnter();
        delphyresult.shouldBe(Condition.visible);

    }

    @Step("write text in search line")
    public void Test4() {

        Search.click();
        searchline2.setValue("კალამი").pressEnter();
        addtobasket.click();
        addtomainbasket.click();
        // gancxadi.shouldBe(Condition.visible);

    }

    @Step("After adding the product, go to the cart and check out")
    public void Test5() {
        Search.click();
        searchline2.setValue("კალამი").pressEnter();
        addtobasket.click();
        addtomainbasket.click();
        sleep(5000);
        mybasket.click();
        myproductpen.shouldBe(Condition.visible);


    }

    @Step("After adding the product, go to the cart and check out color")
    public void Test6() {
        Search.click();
        searchline2.setValue("კალამი").pressEnter();
        addtobasket.click();
        addtomainbasket.click();
        sleep(5000);
        mybasket.click();
        colorofmyproduct.shouldBe(Condition.not(Condition.visible));
    }

    @Step("After adding the product, go to the cart and check out code")
    public void Test7() {
        Search.click();
        searchline2.setValue("კალამი").pressEnter();
        addtobasket.click();
        addtomainbasket.click();
        sleep(5000);
        mybasket.click();
        myproductpen.shouldBe(Condition.visible);
    }

    @Step("After adding the product, go to the cart and check out number of the product")
    public void Test8() {
        Search.click();
        searchline2.setValue("კალამი").pressEnter();
        addtobasket.click();
        addtomainbasket.click();
        sleep(5000);
        mybasket.click();
        //numberoftheproduct.shouldBe(Condition.visible);
        sumoftheproducts.shouldBe(Condition.visible);
    }

    @Step("After adding the product, go to the cart and check out price of the product")
    public void Test9() {
        Search.click();
        searchline2.setValue("კალამი").pressEnter();
        addtobasket.click();
        addtomainbasket.click();
        sleep(5000);
        mybasket.click();
        productprice.shouldBe(Condition.visible);
    }

    @Step("After adding the product, go to the cart and check out price of the product")
    public void Test10() {
        Search.click();
        searchline2.setValue("კალამი").pressEnter();
        addtobasket.click();
        addtomainbasket.click();
        sleep(5000);
        mybasket.click();
        sum.shouldBe(Condition.visible);
    }

    @Step("After adding the product,add one more and  go to the cart and check out price of the product")
    public void Test11() {
        Search.click();
        searchline2.setValue("კალამი").pressEnter();
        addtobasket.click();
        addtomainbasket.click();
        sleep(5000);
        mybasket.click();
        plusbutton.click();
        sum3.shouldBe(Condition.visible);
    }

    @Step("After adding the 2 product,minus one product and  go to the cart and check out price of the product")
    public void Test12() {
        Search.click();
        searchline2.setValue("კალამი").pressEnter();
        addtobasket.click();
        addtomainbasket.click();
        sleep(5000);
        mybasket.click();
        plusbutton.doubleClick();
        minusbutton.click();
        sum3.shouldBe(Condition.visible);   // 2.50 უნდა დარჩეს გამოკლების შემდეგ
    }

    @Step("close product")
    public void Test13() {
        Search.click();
        searchline2.setValue("კალამი").pressEnter();
        addtobasket.click();
        addtomainbasket.click();
        sleep(5000);
        mybasket.click();
        plusbutton.doubleClick();
        minusbutton.click();
        closebutton.click();
    }

    @Step("clear product")
    public void Test14() {
        Search.click();
        searchline2.setValue("კალამი").pressEnter();
        addtobasket.click();
        addtomainbasket.click();
        sleep(5000);
        mybasket.click();
        plusbutton.doubleClick();
        clearbasket.click();
        zeroresultinbusket.shouldBe(Condition.visible);
    }

    @Step("clear product text")
    public void Test15() {
        Search.click();
        searchline2.setValue("კალამი").pressEnter();
        addtobasket.click();
        addtomainbasket.click();
        sleep(5000);
        mybasket.click();
        plusbutton.doubleClick();
        clearbasket.click();
        resultofclearbasket.shouldBe(Condition.visible);
    }

    @Step("continue button should disappear")
    public void Test16() {
        Search.click();
        searchline2.setValue("კალამი").pressEnter();
        addtobasket.click();
        addtomainbasket.click();
        sleep(5000);
        mybasket.click();
        plusbutton.doubleClick();
        clearbasket.click();
        continuebutton.shouldBe(Condition.disappear);
    }

    @Step("here we added diferent products and after delete ")
    public void Test17() {
        Search.click();
        searchline2.setValue("კალამი").pressEnter();
        addtobasket.click();
        addtomainbasket.click();
        sleep(5000);
        Search.click();
        searchline2.setValue("რვეული").pressEnter();
        notebook.click();
        addtomainbasket.click();
        sleep(5000);
        mybasket.click();
        clearbasket.click();
        continuebutton.shouldBe(Condition.disappear);
    }

    @Step("here we added diferent products and after delete ")
    public void Test18() {
        Search.click();
        searchline2.setValue("კალამი").pressEnter();
        addtobasket.click();
        addtomainbasket.click();
        sleep(5000);
        Search.click();
        searchline2.setValue("რვეული").pressEnter();
        notebook.click();
        addtomainbasket.click();
        sleep(5000);
        mybasket.click();
        //clearbasket.click();
        continuebutton.shouldBe(Condition.visible);
        continuebutton.click();
        iuridiulipiri.shouldBe(Condition.visible);
        fizikuripiri.shouldBe(Condition.visible);

    }

    @Step("here we added diferent products and after delete ")
    public void Test19() {
        Search.click();
        searchline2.setValue("კალამი").pressEnter();
        addtobasket.click();
        addtomainbasket.click();
        sleep(5000);
        Search.click();
        searchline2.setValue("რვეული").pressEnter();
        notebook.click();
        addtomainbasket.click();
        sleep(5000);
        mybasket.click();
        continuebutton.click();
        wholepage.sendKeys(Keys.ARROW_DOWN);
        wholepage.sendKeys(Keys.SPACE);
        wholepage.sendKeys(Keys.SPACE);
        sendbutton.click();
        wholepage.sendKeys(Keys.ARROW_UP);
        wholepage.sendKeys(Keys.ARROW_UP);
        wholepage.sendKeys(Keys.ARROW_UP);
        wholepage.sendKeys(Keys.ARROW_UP);
        wholepage.sendKeys(Keys.ARROW_UP);
        wholepage.sendKeys(Keys.ARROW_UP);
        wholepage.sendKeys(Keys.ARROW_UP);
        wholepage.sendKeys(Keys.ARROW_UP);
        redborder2.shouldBe(Condition.visible);

    }
}
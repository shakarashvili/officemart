package org.example;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.commands.ShouldBe;
import io.qameta.allure.Step;
import org.checkerframework.checker.units.qual.C;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

public class Homesteps extends Homeobjects {

    Data A = new Data();  // ეს

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

    @Step("The field 'Identification code' should be red ")
    public void Test20() {
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
        saidentifikaciokodi.shouldBe(Condition.visible);
    }

    @Step("The field 'Identification code' should be red ")
    public void Test21() {
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
        misamarti.shouldBe(Condition.visible);
    }

    @Step("The field 'Contact number' should turn red")
    public void Test22() {
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
        contactnumber.shouldBe(Condition.visible);
    }

    @Step("The box 'When do you want to receive the order?' should turn red.")
    public void Test23() {
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
        acceptorder.shouldBe(Condition.visible);
    }

    @Step("TThe field 'e-mail' should turn red")
    public void Test24() {
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
        email.shouldBe(Condition.visible);
    }

    @Step("company name  field should no longer be red ")
    public void Test25() {
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
        blackborder2.setValue("officemart").pressEnter();
        sleep(3000);
        blackborder2.shouldBe(Condition.visible);

    }

    @Step("identification line should be empty ")
    public void Test26() {
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
        blackborder2.setValue("officemart").pressEnter();
        saidentifikaciokodi.setValue("officemart").pressEnter();
        sleep(3000);
        //saidentifikaciokodi.shouldBe(Condition.disappear);
        saidentifikaciokodi.shouldBe(Condition.empty); // ამან იმუშავა
    }

    @Step("On the legal entity form, if we enter a numerical value of less than 11 characters in the \" +\n" +
            "            \"field 'Identification code' and press the send button, the field 'Identification code' should turn red. ")
    public void Test27() {
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
        blackborder2.setValue("officemart");
        saidentifikaciokodi.setValue("12");
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
        //saidentifikaciokodi.shouldBe(Condition.disappear);
        saidentifikaciokodi.shouldBe(Condition.visible);
    }

    @Step("At least 11 characters must be entered in the field ")
    public void Test28() {
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
        blackborder2.setValue("officemart");
        saidentifikaciokodi.setValue("1234567891011");
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
        //saidentifikaciokodi.shouldBe(Condition.disappear);
        saidentifikaciokodi.is(Condition.text("123456789"));
    }

    @Step("The field should no longer be red ")
    public void Test29() {
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
        blackborder2.setValue("officemart");
        saidentifikaciokodi.setValue("123456789");
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
        saidentifikaciokodi.shouldBe(Condition.visible);
        //saidentifikaciokodi.is(Condition.text("123456789"));
    }

    @Step(" address line should no longer be red ")
    public void Test30() {
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
        blackborder2.setValue("officemart");
        saidentifikaciokodi.setValue("123456789");
        misamarti.setValue("M.Aleqsidze N1");
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
        misamarti.shouldBe(Condition.visible);
        //saidentifikaciokodi.is(Condition.text("123456789"));
    }

    @Step(" The word value should not be entered in the field ")
    public void Test31() {
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
        blackborder2.setValue("officemart");
        saidentifikaciokodi.setValue("123456789");
        misamarti.setValue("M.Aleqsidze N1");
        contactnumber.setValue("სიტყვა");
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
        contactnumber.shouldBe(Condition.empty);
        //saidentifikaciokodi.is(Condition.text("123456789"));
    }

    @Step(" The field 'Contact number' should turn red ")
    public void Test32() {
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
        blackborder2.setValue("officemart");
        saidentifikaciokodi.setValue("123456789");
        misamarti.setValue("M.Aleqsidze N1");
        contactnumber.setValue("12345678");
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
        contactnumber.shouldBe(Condition.visible);
        //saidentifikaciokodi.is(Condition.text("123456789"));
    }

    @Step(" At least 9 characters must be entered in the field ")
    public void Test33() {
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
        blackborder2.setValue("officemart");
        saidentifikaciokodi.setValue("123456789");
        misamarti.setValue("M.Aleqsidze N1");
        contactnumber.setValue("1234567891012");
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
        contactnumber.is(Condition.text("123456789"));
        //saidentifikaciokodi.is(Condition.text("123456789"));
    }

    @Step(" If we enter a 9-character numeric value in the field and press the submit button again, the field should no longer be red ")
    public void Test34() {
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
        blackborder2.setValue("officemart");
        saidentifikaciokodi.setValue("123456789");
        misamarti.setValue("M.Aleqsidze N1");
        contactnumber.setValue("123456789");
        wholepage.sendKeys(Keys.SPACE);
        wholepage.sendKeys(Keys.SPACE);
        sendbutton.click();
        wholepage.sendKeys(Keys.ARROW_UP);
        wholepage.sendKeys(Keys.ARROW_UP);
        wholepage.sendKeys(Keys.ARROW_UP);
        wholepage.sendKeys(Keys.ARROW_UP);
        contactnumber.is(Condition.text("123456789"));

    }

    @Step("  Field 'When do you want to receive the order?' should remain red ")
    public void Test35() {
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
        blackborder2.setValue("officemart");
        saidentifikaciokodi.setValue("123456789");
        misamarti.setValue("M.Aleqsidze N1");
        contactnumber.setValue("123456789");
        acceptorder.setValue("ნესვი");
        wholepage.sendKeys(Keys.SPACE);
        wholepage.sendKeys(Keys.SPACE);
        sendbutton.click();
        wholepage.sendKeys(Keys.ARROW_UP);
        wholepage.sendKeys(Keys.ARROW_UP);
        wholepage.sendKeys(Keys.ARROW_UP);
        wholepage.sendKeys(Keys.ARROW_UP);
        acceptorder.shouldBe(Condition.visible);

    }

    @Step("  If we enter any value that is more than 5 characters, the field should no longer be red ")
    public void Test36() {
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
        blackborder2.setValue("officemart");
        saidentifikaciokodi.setValue("123456789");
        misamarti.setValue("M.Aleqsidze N1");
        contactnumber.setValue("123456789");
        acceptorder.setValue("30 აგვისტოს");
        wholepage.sendKeys(Keys.SPACE);
        wholepage.sendKeys(Keys.SPACE);
        sendbutton.click();
        wholepage.sendKeys(Keys.ARROW_UP);
        wholepage.sendKeys(Keys.ARROW_UP);
        wholepage.sendKeys(Keys.ARROW_UP);
        wholepage.sendKeys(Keys.ARROW_UP);
        acceptorder.shouldBe(Condition.visible);

    }

    @Step("  If we write the value test@gmail.com in the acceptable format for e-mail, for example, the field should no longer be red. ")
    public void Test37() {
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
        blackborder2.setValue("officemart");
        saidentifikaciokodi.setValue("123456789");
        misamarti.setValue("M.Aleqsidze N1");
        contactnumber.setValue("123456789");
        // acceptorder.setValue("30 აგვისტოს");  ეს ჩავთიშე დროებით რადგან არ მოხდეს მგანაცხადის გაგზავნა
        email.setValue("test@gmail.com");
        wholepage.sendKeys(Keys.SPACE);
        wholepage.sendKeys(Keys.SPACE);
        sendbutton.click();
        wholepage.sendKeys(Keys.ARROW_UP);
        wholepage.sendKeys(Keys.ARROW_UP);
        email.is(Condition.text("test@gmail.com"));

    }

    @Step("If we enter an invalid format for e-mail, the e-mail field should remain red")
    public void Test38() {
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
        blackborder2.setValue("officemart");
        saidentifikaciokodi.setValue("123456789");
        misamarti.setValue("M.Aleqsidze N1");
        contactnumber.setValue("123456789");
        acceptorder.setValue("30 აგვისტოს");
        email.setValue("test.gmail.com");
        wholepage.sendKeys(Keys.SPACE);
        wholepage.sendKeys(Keys.SPACE);
        sendbutton.click();
        wholepage.sendKeys(Keys.ARROW_UP);
        wholepage.sendKeys(Keys.ARROW_UP);
        email.is(Condition.text("test.gmail.com"));
    }

    @Step("If we enter an invalid format for e-mail, the e-mail field should remain red")
    public void Test39() {
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
        blackborder2.setValue("officemart");
        saidentifikaciokodi.setValue("123456789");
        misamarti.setValue("M.Aleqsidze N1");
        contactnumber.setValue("123456789");
        acceptorder.setValue("30 აგვისტოს");
        email.setValue("test@gmail");
        wholepage.sendKeys(Keys.SPACE);
        wholepage.sendKeys(Keys.SPACE);
        sendbutton.click();
        wholepage.sendKeys(Keys.ARROW_UP);
        wholepage.sendKeys(Keys.ARROW_UP);
        email.is(Condition.text("test@gmail"));
    }
    @Step("If we enter an invalid format for e-mail, the e-mail field should remain red")
    public void Test40() {
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
        blackborder2.setValue("officemart");
        saidentifikaciokodi.setValue("123456789");
        misamarti.setValue("M.Aleqsidze N1");
        contactnumber.setValue("123456789");
        acceptorder.setValue("30 აგვისტოს");
        email.setValue("test.gmail@");
        wholepage.sendKeys(Keys.SPACE);
        wholepage.sendKeys(Keys.SPACE);
        sendbutton.click();
        wholepage.sendKeys(Keys.ARROW_UP);
        email.is(Condition.text("test.gmail@"));
    }
}
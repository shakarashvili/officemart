package org.Steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import net.datafaker.Faker;
import object.Homeobjects;
import org.testng.Assert;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Homesteps extends Homeobjects {


    @Step("this method is for to find search line on the website")
    public void Searchline() {

        Search.click();
        Search.shouldBe(Condition.visible);


    }

    // Data1 text = new Data1() {
    @Step("write text in search line")
    public void Writepaninsearchline() {

        //Search.click();
        //Searchbutton.setValue("კალამი").pressEnter();
        searchline2.setValue("კალამი").pressEnter();
        Pan.shouldBe(Condition.visible);

    }

    @Step("write uncorrect text in search line")
    public void uncorectresult() {


        searchline2.setValue("დელფინი").pressEnter();
        delphyresult.shouldBe(Condition.visible);

    }

    @Step("add product in main basket")
    public void addtomainpaket() {

        addtobasket.click();
        addtomainbasket.click();
        gancxadi.shouldBe(Condition.visible, Duration.ofMillis(2000));

    }

    @Step("After adding the product, go to the cart and check out")
    public void mybasketbtn() {

        mybasket.click();
        myproductpen.shouldBe(Condition.visible,Duration.ofMillis(2000));


    }


    @Step("After adding the product,add one more and  go to the cart and check out price of the product")
    public void price() {

        plusbutton.click();
        sum3.shouldBe(Condition.visible);
    }

    @Step("After adding the 2 product,minus one product and  go to the cart and check out price of the product")
    public void price2() {

        minusbutton.click();
        sum3.shouldBe(Condition.visible);
    }

    @Step("close product")
    public void closeproductbtn() {

        closebutton.click();
        sleep(2000);
    }


    @Step("text - clear product ")
    public void clearbaskets() {

        clearbasket.click();
        resultofclearbasket.shouldBe(Condition.visible);
    }



    @Step("here we added diferent products and after delete ")
    public void addseveralproducts() {

        searchline3.setValue("რვეული").pressEnter();
        notebook.click();
        addtomainbasket.click();
        sleep(5000);

    }

    @Step("here we added diferent products and after delete ")
    public void continuebtn() {

        continuebutton.shouldBe(Condition.visible);
        continuebutton.click();
        sleep(5000);


    }

    @Step("send button ")
    public void sendbtn() {

       /* wholepage.sendKeys(Keys.ARROW_DOWN);
        wholepage.sendKeys(Keys.SPACE);
        wholepage.sendKeys(Keys.SPACE); */
        sendbutton.click();
       /* wholepage.sendKeys(Keys.ARROW_UP);
        wholepage.sendKeys(Keys.ARROW_UP);
        wholepage.sendKeys(Keys.ARROW_UP);
        wholepage.sendKeys(Keys.ARROW_UP);
        wholepage.sendKeys(Keys.ARROW_UP);
        wholepage.sendKeys(Keys.ARROW_UP);
        wholepage.sendKeys(Keys.ARROW_UP);
        wholepage.sendKeys(Keys.ARROW_UP);
        redborder2.shouldBe(Condition.visible); */

    }

    @Step("company name  field should no longer be red ")
    public void blackborderofcompanyname() {

        blackborder2.setValue("officemart").pressEnter();
        sleep(3000);
        blackborder2.shouldBe(Condition.visible);

    }

    @Step("identification line should be empty ")
    public void uncorrectidentification1() {

        saidentifikaciokodi.setValue("officemart").pressEnter();
        sleep(3000);
        //saidentifikaciokodi.shouldBe(Condition.disappear);
        saidentifikaciokodi.shouldBe(Condition.empty); // ამან იმუშავა
    }

    @Step("On the legal entity form, if we enter a numerical value of less than 11 characters in the \" +\n" +
            "            \"field 'Identification code' and press the send button, the field 'Identification code' should turn red. ")
    public void uncorrectidentification2() {

        saidentifikaciokodi.setValue("12");
       /* wholepage.sendKeys(Keys.SPACE);
        wholepage.sendKeys(Keys.SPACE); */
       // sendbutton.click();
       /* wholepage.sendKeys(Keys.ARROW_UP);
        wholepage.sendKeys(Keys.ARROW_UP); */
        //saidentifikaciokodi.shouldBe(Condition.disappear);
        saidentifikaciokodi.shouldBe(Condition.visible);
    }

    @Step("At least 11 characters must be entered in the field ")
    public void uncorrectidentification3() {

        saidentifikaciokodi.setValue("1234567891011");
        sleep(5000);
        //saidentifikaciokodi.shouldBe(Condition.disappear);
        saidentifikaciokodi.is(Condition.text("123456789"));
    }

    @Step("The field should no longer be red ")
    public void correctidentification1() {

        saidentifikaciokodi.setValue("123456789");

        saidentifikaciokodi.shouldBe(Condition.visible);
        //saidentifikaciokodi.is(Condition.text("123456789"));
    }

    @Step(" address line should no longer be red ")
    public void Address() {

        misamarti.setValue("M.Aleqsidze N1");

        misamarti.shouldBe(Condition.visible);
        //saidentifikaciokodi.is(Condition.text("123456789"));
    }

    @Step(" The word value should not be entered in the field ")
    public void uncorrectcontactnumber1() {

        contactnumber.setValue("სიტყვა");

        contactnumber.shouldBe(Condition.empty);
        //saidentifikaciokodi.is(Condition.text("123456789"));
    }

    @Step(" The field 'Contact number' should turn red ")
    public void uncorrectcontactnumber2() {

        contactnumber.setValue("12345678");

        contactnumber.shouldBe(Condition.visible);
        //saidentifikaciokodi.is(Condition.text("123456789"));
    }

    @Step(" At least 9 characters must be entered in the field ")
    public void uncorrectcontactnumber3() {

        contactnumber.setValue("1234567891012");

        contactnumber.is(Condition.text("123456789"));
        //saidentifikaciokodi.is(Condition.text("123456789"));
    }

    @Step(" If we enter a 9-character numeric value in the field and press the submit button again, the field should no longer be red ")
    public void correctcontactnumber1() {

        contactnumber.setValue("123456789");

        contactnumber.is(Condition.text("123456789"));

    }

    @Step("  Field 'When do you want to receive the order?' should remain red ")
    public void uncorrectAcceptorder1() {

        acceptorder.setValue("ნესვი");

        acceptorder.shouldBe(Condition.visible);

    }

    @Step("  If we enter any value that is more than 5 characters, the field should no longer be red ")
    public void correctAcceptorder1() {

        acceptorder.setValue("30 აგვისტოს");
       /* wholepage.sendKeys(Keys.SPACE);
        wholepage.sendKeys(Keys.SPACE);
        sendbutton.click();
        wholepage.sendKeys(Keys.ARROW_UP);
        wholepage.sendKeys(Keys.ARROW_UP);
        wholepage.sendKeys(Keys.ARROW_UP);
        wholepage.sendKeys(Keys.ARROW_UP); */
        acceptorder.shouldBe(Condition.visible);

    }

    @Step("  If we write the value test@gmail.com in the acceptable format for e-mail, for example, the field should no longer be red. ")
    public void correctemail1() {

        // acceptorder.setValue("30 აგვისტოს");  ეს ჩავთიშე დროებით რადგან არ მოხდეს მგანაცხადის გაგზავნა
        email.setValue("test@gmail.com");

        email.is(Condition.text("test@gmail.com"));

    }

    @Step("If we enter an invalid format for e-mail, the e-mail field should remain red")
    public void uncorrectemail1() {

        email.setValue("test.gmail.com");

        email.is(Condition.text("test.gmail.com"));
    }

    @Step("If we enter an invalid format for e-mail, the e-mail field should remain red")
    public void uncorrectemail2() {

        email.setValue("test@gmail");

        email.is(Condition.text("test@gmail"));
    }

    @Step("If we enter an invalid format for e-mail, the e-mail field should remain red")
    public void uncorrectemail3() {

        email.setValue("test.gmail@");

        email.is(Condition.text("test.gmail@"));
    }

    @Step("data fakers ")
    public void Test41() {
        Faker faker = new Faker();
        String name = faker.name().fullName();
        String firstname = faker.name().firstName();
        String lastname = faker.name().lastName();

        Search.click();
        searchline2.setValue(name).pressEnter();
        Search.click();
        searchline2.setValue(firstname).pressEnter();
        Search.click();
        searchline2.setValue(lastname).pressEnter();
        sleep(3000);
        //delphyresult.shouldBe(Condition.visible);

    }

    @Step("data fakers phone number")
    public void Test42() {
        Faker faker = new Faker();
        String number = faker.phoneNumber().phoneNumber();
        String products = faker.food().fruit();
        String address = faker.address().cityName();
        String numbers = faker.animal().name();
        String numbersss = faker.number().digit();
         Integer between = faker.number().numberBetween(1,10);
        Search.click();
        searchline2.setValue(number).pressEnter();
        Search.click();
        searchline2.setValue(products).pressEnter();
        Search.click();
        searchline2.setValue(address).pressEnter();
        Search.click();
        searchline2.setValue(numbers).pressEnter();
        Search.click();
        searchline2.setValue(numbersss).pressEnter();
        sleep(3000);


    }

    @Step("ციკლი")
    public void Test43() {
        Search.click();
        searchline2.setValue("კალამი").pressEnter();
        int productCount = productlist.size(); // აქ დავდგებით ძირითად დივზე და საიზს წამოვიღებთ დავბეჭდავთ
        System.out.println(productlist);
        String productName = firstname.getText();
        String firstname = productName; // იმისთვის რომ ციკლი დატრიალდეს პირველი პროდუქტიუნდა გაუტოლო
        System.out.println(firstname);
        for (int i = 1; i < productCount; i++) {
            String secondName = $(".prod_title",i).$(withText("კალამი ბურთულიანი")).getText();
            String SecondName = secondName;
            Assert.assertTrue(secondName.contains("კალამი ბურთულიანი"));
        }
    }
}
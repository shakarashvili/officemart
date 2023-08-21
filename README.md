# officemart
პროექტის გასახსნელად საჭიროა გიტ ფაილი დავკლონოთ 


# beforetest  
კლასში წარმოდგენილია, საიტის წინასწარი გამშვები , რომელიც დაკავშირებულია testrunner_თან
და ყოველი ტესტის დასაწყისში ეშვება. 
public class Beforetest {

    @BeforeTest
     public void Beforetest1(){

      open("https://officemart.ge/ge/category");

     }
}


# Homeobject_ში 
გაწერილია ელემენტები რომლებსაც ვწვდებით, ატრიბუტების xpath_ების , კლასების და სახელების 
საშუალებით . მაგალითისთვის:
  public SelenideElement // პროდუქტის ძიების კნოპკა
      Search =(SelenideElement) $(byText("პროდუქტის ძიება"));

 public SelenideElement
      Searchbutton =(SelenideElement) $(byClassName("search_button"));

  public SelenideElement
   searchline2 = $(byXpath("/html/body/div[7]/div/form/div/input"));

 public SelenideElement // პროდუქტის ფერის გარკვევა
   colorofmyproduct = ($(".color",2)); // ინდექსით გადაცემა

public SelenideElement // პროდუქტის კოდის გარკვევა
   numberoftheproduct = $(by("value","1"));

public ElementsCollection // აქედან მოგაქვს ლისტი პროდუქტების
   productlist = $$(".prod_title");



# Homesteps დაკავშირებულია Homeobject _თან .
აქ გაწერილია მეთოდები 43 ტესტისთვის. 

 
Homesteps _ში ვიყენებთ შეჩერების სისტემას ნაცვლად SLEEP მეთოდისა

    @Step("add product in main basket")
    public void addtomainpaket() {

        addtobasket.click();
        addtomainbasket.click();
        gancxadi.shouldBe(Condition.visible, Duration.ofMillis(2000));

    }

არ გამოგვიყეენებია , თუმცა საჭიროებისამებრ შესაძლებელია სქროლის გამოყენება კლავიატურის მეშვეობით:
  @Step("send button ")
    public void sendbtn() {

       /* wholepage.sendKeys(Keys.ARROW_DOWN);
        wholepage.sendKeys(Keys.SPACE); */
        sendbutton.click();
       /* wholepage.sendKeys(Keys.ARROW_UP);
        wholepage.sendKeys(Keys.ARROW_UP);
        redborder2.shouldBe(Condition.visible); */

    }

ტესტში ასევე გამოვიყენეთ დატაფეიკერები :

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

ტესტში ასევე გამოვიყენეთ ციკლები , რის მეშვებოითაც ვახდენთ პროდუქტის საიტზე არსებული პროდუქტების გადათვლებს
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




# Testrunner_ში 
მოცემულია 43 ტესტი , თავისი ასერტებით. 
Testrunner დაკავშირებულია Homesteps _ თან . 

ყოველი ტესტი იწყება Beforetest_ის დაკავშირებით , რათა მოხდეს საიტის გაშვება :
Beforetest Beforetest1 = new Beforetest();
            Beforetest1.Beforetest1();


ტესტში გამოყენებული გვაქვს სოფთასერტის იმპორტი  : 
SoftAssert soft = new SoftAssert();
 soft.assertAll();

ასევე ვიყენებთ სხვადასხვა ასერტების ტიპებს როგორებიც არის : 
Assert.assertTrue(myproductpen.is(Condition.visible));
Assert.assertTrue(colorofmyproduct.is(Condition.not(Condition.visible)));
Assert.assertTrue(saidentifikaciokodi.is(Condition.empty));
 Assert.assertTrue(saidentifikaciokodi.is(Condition.value("123456789")));
 Assert.assertEquals($(byAttribute("placeholder", "ფაქტიური მისამართი")).getCssValue("border-color"), "rgb(69, 69, 69)");
Assert.assertTrue(contactnumber.is(Condition.value("123456789")));
 Assert.assertEquals($(acceptorder).getCssValue("border-color"), "rgb(69, 69, 69)");

CSS ასერტის გაწერის დროს , მოგვიწია ფერის კოდის hex_ებში გადაყვანა , რათა პროგრამას აღექვა . 
 String companyline = $(byAttribute("placeholder", "კომპანიის სახელწოდება")).getCssValue("border-color");
            System.out.println(companyline);
            String hex = Color.fromString(companyline).asHex();
            System.out.println(hex);


 String companyline10 = acceptorder.getCssValue("border-color"); // by თი წამოღების მაგივრად ასეც შეიძლება
            System.out.println(companyline10);
            String hex = Color.fromString(companyline10).asHex();
            System.out.println(hex);


# პროექტს
აგრეთვე გააჩნია testng.xml რისი მეშვებოითად ერთდროუალდ და რამდენჯერმე არის შესაძლებელი ტესტების გაშვება. 


<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd" >

<suite name="Automation Suite" thread-count="5" parallel="tests">
    <test name="LogIn" parallel="tests" >
        <classes>
            <class name="Testrunner"/>


        </classes>
    </test>

</suite>



# გიტიგნორში 
გადავცემთ არასაჭირო ფაილებს, როგორებიც არის :
target
build
.idea



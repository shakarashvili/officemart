package org.example;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class Homeobjects {

   public SelenideElement // პროდუქტის ძიების კნოპკა
      Search =(SelenideElement) $(byText("პროდუქტის ძიება"));


   public SelenideElement
      Searchbutton =(SelenideElement) $(byClassName("search_button"));

   public SelenideElement
   searchline2 = $(byXpath("/html/body/div[7]/div/form/div/input"));

   public SelenideElement // შესამოწმებელი საძიებო სიტყვა
    Pen1 = $(byText("'კალამი'"));

   public SelenideElement // ეს ის ტექსტია რაც სერჩით უნდა მოძებნო
   delphy = $(byText("დელფინი"));

   public SelenideElement // საძიებო სიტყვა'დელფინი'ვერაფერი მოიძებნა - ეს ის ტექსტია რაც უნდა გამოიტანოს მესამე ტესტში
   delphyresult = $(byXpath("/html/body/div[5]/div/h4"));

   public SelenideElement // ეს პირველი პასტა არის რომელიც უნდა დაამატო კალათაში , კალათაშ დამატების კნოპკა
           addtobasket = $(byXpath("/html/body/div[5]/div[2]/div/div[1]/div[2]"));

   public SelenideElement //ეს საბოლოოდ ამატებს კალათაში
    addtomainbasket = $(byText("კალათაში დამატება"));

   public SelenideElement
   gancxadi = $(byXpath("/html/body/div[12]/div[13]"));
   public SelenideElement   // ჩემი კალათა გადასასვლელი კნოპკა
   mybasket = $(byXpath("/html/body/div[3]/div/div[2]/div[4]/a/img"));

   public SelenideElement // კალათაში გადასვლის შემდეგ შესამოწმებელი პროდუქტი
   myproductpen = $(byText("#E7287"));

   public SelenideElement // პროდუქტის ფერის გარკვევა
   colorofmyproduct = ($(".color",2)); // ინდექსით გადაცემა

public SelenideElement // პროდუქტის კოდის გარკვევა
   numberoftheproduct = $(by("value","1"));

public SelenideElement
   sumoftheproducts = $(byXpath("/html/body/div[5]/div/div[3]/div[5]/div/input"));

public SelenideElement // პროდუქტის ფასისი გარკვევა
   productprice =  //$(by("prodPrice181521","1.25"));
        $(byXpath("/html/body/div[5]/div/div[3]/div[6]/div[2]/span[1]"));



public SelenideElement // პროდუქტის ჯამი
   sum = $(byXpath("/html/body/div[5]/div/div[4]/div/div[1]/div"));

public SelenideElement // პროდუქტის დამატების პლიუს ღილაკი
   plusbutton =  $(byXpath("/html/body/div[5]/div/div[3]/div[5]/div/button[1]/i"));

public SelenideElement // ჯამის ტექსტი მომაქვს ამით
  // sum2 = $(by("fullPriceFor","2.50"));
// აი ეს ყველანაირად სწორად მიწერია ტექსტი მინდა წამოვიღო და არ მოდის ცოცხალი თავით 11 ტესტში
  sum3 = $(byXpath("/html/body/div[5]/div/div[3]/div[7]/div[2]/span[1]"));

public SelenideElement // ინუს ღილაკზე აკლიკებს ეს
   minusbutton = $(byXpath("/html/body/div[5]/div/div[3]/div[5]/div/button[2]/i"));

   public SelenideElement // ეს არის გასათიშ ღილაკი იქსი
   // closebutton = $(byClassName("fas"),0); აქაც მცდელობა მქონდა კლასით წამოღების
   closebutton = $(byXpath("/html/body/div[5]/div/div[3]/div[1]/button/i"));

   public SelenideElement // ეს აჩვენებს რომ 0 დარჩა თანხაში
    nullprice = $(byXpath("/html/body/div[5]/div/div[3]/div/div[1]/div/span"));

   public SelenideElement // კალათის გასუთავების ღილაკი
   clearbasket = $(byLinkText("კალათის გასუფთავება"));

   public SelenideElement // უნდა გამოიტანს რეზულტატი კალათა ცარიელია
   resultofclearbasket = $(byXpath("/html/body/div[5]/div/div[2]/p"));

   public SelenideElement // პროდუქტებისგან გავასუფთავე და ამან უნდა მიჩვენოს რომ პროდუქტი აღარ დარჩა კალათაში და 0 ია
   zeroresultinbusket = $(byXpath("/html/body/div[3]/div/div[2]/div[4]/a/div/div/span"));

   public SelenideElement // ღილაკი გარძელება
   continuebutton = $(byAttribute("onclick","cntn()")); // cursor:pointer გაგრძელება

   public SelenideElement
  // notebook = $(byLinkText(" რვეული ზედა ზამბარით A5 40ფ უჯრა ")); ვცადე ამით მარა არ წამოიღო
   notebook = $(byXpath("/html/body/div[5]/div[2]/div/div[3]/div[3]/div[1]/a/h4"));

   public SelenideElement
   iuridiulipiri = $(".active",3);
        //$(byLinkText("იურიდიული პირი"));
        //$(by("pis","იურიდიული პირი"));

   public SelenideElement
   fizikuripiri = $(byXpath("/html/body/div[6]/div/ul/li[2]/a"));
        //$(".tab",3);
        //$(byLinkText("ფიზიკური პირი"));
           //$(by("iur","ფიზიკური პირი"));

public SelenideElement // ბრალოდ ზოგადი გვერდის ელემენტია რომ შემდეგ ამაზე დავდგე და სქროლი გავაკეთო
   wholepage = $(byXpath("/html/body"));

public SelenideElement // გაგზავნის ღილაკი
   sendbutton = $("#btn2");

public SelenideElement
   //redborder = $(".form_group");
   redborder2 = $(byXpath("/html/body/div[6]/div/div[2]/div[1]/form/div[1]/input"));

}

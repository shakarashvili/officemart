package org.example;


import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;

public class Beforetest {

    @BeforeTest
     public void Beforetest1(){

      open("https://officemart.ge/ge");

     }

}

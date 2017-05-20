package com.practicaivan.app;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Created by lleir on 20/5/17.
 */
public class SeleniumTestCases1 {

//    public static void main(String[] args) {
//
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("http://www.google.es");
//
//        System.out.println("Google abierto con exito. Selenium Test Case!");
//
//        try {
//            Thread.sleep(5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        driver.quit();
//    }

    @Test
    public void a() throws Exception {
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.es");

        System.out.println("Google abierto con exito. Selenium Test Case!");

        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}

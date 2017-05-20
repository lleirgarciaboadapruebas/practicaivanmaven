package com.practicaivan.app;


import junit.framework.TestCase;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.TestNG;
import org.testng.annotations.Test;


@RunWith(JUnit4.class)
public class SeleniumTestCases1 extends TestCase{

    @Test
    public void a() throws Exception {

        System.setProperty("webdriver.chrome.driver","/var/jenkins_home/workspace/build");

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

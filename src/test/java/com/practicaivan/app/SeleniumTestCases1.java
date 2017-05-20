package com.practicaivan.app;


import junit.framework.TestCase;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.TestNG;
import org.testng.annotations.Test;

import java.net.URL;


@RunWith(JUnit4.class)
public class SeleniumTestCases1 extends TestCase{

    @Test
    public void a() throws Exception {

//        ChromeOptions o = new ChromeOptions();
//        o.setBinary("/var/jenkins_home/workspace/build/chromedriver");
System.out.println("init 1");
        DesiredCapabilities capability = DesiredCapabilities.chrome();
        capability.setCapability("chrome.binary", "/var/jenkins_home/workspace/build/chromedriver");
        capability.setVersion("52");
        System.out.println("set capabilities 2");
        WebDriver driver1 = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
        WebDriver driver = new ChromeDriver(capability);

        System.out.println("ini driver 3");
        driver.get("http://www.google.es");

        System.out.println("webpage ok 4");
        System.out.println("Google abierto con exito. Selenium Test Case!");

        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}

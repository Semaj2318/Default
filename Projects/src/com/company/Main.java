package com.company;

import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Programming\\Selenium\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("http:\\\\www.facebook.com");
        Thread.sleep(5000);
        driver.close();

    }
}

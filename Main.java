package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main {
    public static void main(String[] args){
        System.setProperty( " webdriver.crome.Driver "," src/main/resources/chromedriver.exe ");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get( "https://www.saucedemo.com/");
        String title = driver.getTitle();
        System.out.println(title);


        WebElement user = driver.findElement(By.xpath("//input[@id='user-name']"));
        user.sendKeys("standard_user");

        WebElement pwd = driver.findElement(By.xpath("//input[@data-test=\"password\"]"));
        pwd.sendKeys("secret_sauce");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement loginBtn = driver.findElement(By.xpath("//input[@class=\"submit-button btn_action\"]"));
        loginBtn.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement menu = driver.findElement(By.xpath("//button[contains(@id,'react-burger-menu-btn')]"));
        menu.click();
        System.out.println("Open Menu");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement prod1 = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        prod1.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement addToCart = driver.findElement(By.xpath("//button[text()='Add to cart']"));
        addToCart.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement addBtn = driver.findElement(By.xpath("//a[contains(@class,'shopping_cart_link')]"));
        addBtn.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement checkoutBtn = driver.findElement(By.xpath("//button[@data-test=\"checkout\" and @id=\"checkout\"]"));
        checkoutBtn.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement name = driver.findElement(By.xpath("//input[@id=\"first-name\"]"));
        name.sendKeys("Jiad");

        WebElement last = driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
        last.sendKeys("Khandaker");

        WebElement postalCode = driver.findElement(By.xpath("//input[@id=\"postal-code\"]"));
        postalCode.sendKeys("1360");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement continueBtn = driver.findElement(By.xpath("//input[@id=\"continue\" and @type=\"submit\"]"));
        continueBtn.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement finishBtn = driver.findElement(By.xpath("//button[@class=\"btn btn_action btn_medium cart_button\"]"));
        finishBtn.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement twitterBtn = driver.findElement(By.xpath("//a[text()=\"Twitter\"]"));
        twitterBtn.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        WebElement fbBtn = driver.findElement(By.xpath("//a[text()=\"Facebook\"]"));
        fbBtn.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement linkedinBtn = driver.findElement(By.xpath("//a[text()=\"LinkedIn\"]"));
        linkedinBtn.click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();


    }
}
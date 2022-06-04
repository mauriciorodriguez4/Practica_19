package com.mycompany.seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Catolica
 */
public class SeleniumDemo {

    public static void main(String[] args) {
        //Primer test
        testTitle();
        //Segundo test
        testLogin();
        //Tercer test
        testSuma();
        //Cuarto test
        testResta();
        //Quinto test
        testMultiplicacion();
        //Sexto test    
        testDivision();

    }

    public static void testTitle() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MRJ\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://demo.guru99.com/test/newtours/";
        String expectResult = "Welcome: Mercury Tours";
        String result = "";

        driver.get(url);
        result = driver.getTitle();
        if (result.equals(expectResult)) {
            System.out.println("Aprobado");

        } else {
            System.out.println("Fallido");
        }

        driver.close();

    }

    public static void testLogin() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MRJ\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://demo.guru99.com/test/newtours/";
        String expectResult = "Login Successfully";
        String result = "";

        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,400)", "");
        driver.get(url);
        driver.findElement(By.name("userName")).sendKeys("ejemplo");
        driver.findElement(By.name("password")).sendKeys("ejemplo");
        driver.findElement(By.name("submit")).click();

        result = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3")).getText();
        if (result.equals(expectResult)) {
            System.out.println("Aprobado");

        } else {
            System.out.println("Fallido");
        }

        driver.close();

    }

    public static void testSuma() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MRJ\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://testsheepnz.github.io/BasicCalculator.html";
        String expectResult = "49";
        String result = "";

        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,400)", "");
        driver.get(url);

        driver.findElement(By.name("number1")).sendKeys("35");
        driver.findElement(By.name("number2")).sendKeys("14");
        WebElement element = driver.findElement(By.name("selectOperation"));
        Select select = new Select(element);
        select.selectByValue("0");
        driver.findElement(By.id("calculateButton")).click();

        result = driver.findElement(By.name("numberAnswer")).getAttribute("value");
        if (result.equals(expectResult)) {
            System.out.println("Aprobado");

        } else {
            System.out.println("Fallido");
        }

        driver.close();

    }

    public static void testResta() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MRJ\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://testsheepnz.github.io/BasicCalculator.html";
        String expectResult = "25";
        String result = "";

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)", "");
        driver.get(url);

        driver.findElement(By.name("number1")).sendKeys("35");
        driver.findElement(By.name("number2")).sendKeys("10");
        WebElement element = driver.findElement(By.name("selectOperation"));
        Select select = new Select(element);
        select.selectByValue("1");
        driver.findElement(By.id("calculateButton")).click();

        result = driver.findElement(By.name("numberAnswer")).getAttribute("value");
        if (result.equals(expectResult)) {
            System.out.println("Aprobado");

        } else {
            System.out.println("Fallido");
        }

        driver.close();

    }

    public static void testMultiplicacion() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MRJ\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://testsheepnz.github.io/BasicCalculator.html";
        String expectResult = "64";
        String result = "";

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)", "");
        driver.get(url);

        driver.findElement(By.name("number1")).sendKeys("8");
        driver.findElement(By.name("number2")).sendKeys("8");
        WebElement element = driver.findElement(By.name("selectOperation"));
        Select select = new Select(element);
        select.selectByValue("2");
        driver.findElement(By.id("calculateButton")).click();

        result = driver.findElement(By.name("numberAnswer")).getAttribute("value");
        if (result.equals(expectResult)) {
            System.out.println("Aprobado");

        } else {
            System.out.println("Fallido");
        }

        driver.close();

    }

    public static void testDivision() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MRJ\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://testsheepnz.github.io/BasicCalculator.html";
        String expectResult = "1";
        String result = "";

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)", "");
        driver.get(url);

        driver.findElement(By.name("number1")).sendKeys("8");
        driver.findElement(By.name("number2")).sendKeys("8");
        WebElement element = driver.findElement(By.name("selectOperation"));
        Select select = new Select(element);
        select.selectByValue("3");
        driver.findElement(By.id("calculateButton")).click();

        result = driver.findElement(By.name("numberAnswer")).getAttribute("value");
        if (result.equals(expectResult)) {
            System.out.println("Aprobado");

        } else {
            System.out.println("Fallido");
        }

        driver.close();
    }
}

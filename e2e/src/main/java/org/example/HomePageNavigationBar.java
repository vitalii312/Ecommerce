package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomePageNavigationBar {

@Test
    public void validate_LogoButton() throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://salinaka-ecommerce.web.app/");

    WebElement headerLogoButton = driver.findElement(By.cssSelector(".navigation .logo"));
    headerLogoButton.click();
}

@Test
    public void validate_HomeButton(){

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://salinaka-ecommerce.web.app/");

    WebElement homeButton = driver.findElement(By.cssSelector(".navigation-menu-active"));
    homeButton.click();

}

@Test
    public void validate_ShopButton(){
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.navigate().to("https://salinaka-ecommerce.web.app/");

    WebElement shopButton = driver.findElement(By.xpath("//li/a[@href='/shop']"));
    shopButton.click();
}

@Test
    public void validate_FeaturedButton(){

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.navigate().to("https://salinaka-ecommerce.web.app/");

    WebElement featuredButton = driver.findElement(By.xpath("//li/a[@href='/featured']"));
    featuredButton.click();

}

@Test
    public void validate_RecommendedButton(){
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.navigate().to("https://salinaka-ecommerce.web.app/");

    WebElement recommendedButton = driver.findElement(By.xpath("//li/a[@href='/recommended']"));
    recommendedButton.click();


}

//app.launch(apkPath).login()
//        appInst.enterText("cssSelect","password1234")
//                appInst.tap(".login-button");
    // IDEAL STRUCTURE



}
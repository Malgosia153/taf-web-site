package by.itacademy.rybalko;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebSiteTestVek {
    @Test
    public void testFieldsEmpty() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.21vek.by/");
        Vek vek = new Vek();
        Thread.sleep(3000);
        WebElement buttonAcceptCoocie = driver.findElement(By.xpath(vek.buttonAcceptCoocie));
        buttonAcceptCoocie.click();
        Thread.sleep(3000);
        WebElement buttonAccount = driver.findElement(By.xpath(vek.buttonAccount));
        buttonAccount.click();
        Thread.sleep(3000);
        WebElement buttonEnter = driver.findElement(By.xpath(vek.buttonEnter));
        buttonEnter.click();
        Thread.sleep(3000);
        WebElement buttonTwoEnter = driver.findElement(By.xpath(vek.buttonTwoEnter));
        buttonTwoEnter.click();
        Thread.sleep(3000);
        WebElement textErrorMail = driver.findElement(By.xpath(vek.textErrorMail));
        String actualTextErrorMail = textErrorMail.getText();
        Assertions.assertEquals("Электронная почта не указана", actualTextErrorMail);
        WebElement textErrorPassword = driver.findElement(By.xpath(vek.textErrorPassword));
        String actualtextErrorPassword = textErrorPassword.getText();
        Assertions.assertEquals("Пароль не указан", actualtextErrorPassword);
        driver.quit();
    }
    @Test
    public void testFieldMailEmpty() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.21vek.by/");
        Vek vek = new Vek();
        WebElement buttonAcceptCoocie = driver.findElement(By.xpath(vek.buttonAcceptCoocie));
        buttonAcceptCoocie.click();
        WebElement buttonAccount = driver.findElement(By.xpath(vek.buttonAccount));
        buttonAccount.click();
        Thread.sleep(2000);
        WebElement buttonEnter = driver.findElement(By.xpath(vek.buttonEnter));
        buttonEnter.click();
        Thread.sleep(2000);
        WebElement inputTextPassword = driver.findElement(By.xpath(vek.inputTextPassword));
        inputTextPassword.sendKeys("25863");
        Thread.sleep(2000);
        WebElement buttonTwoEnter = driver.findElement(By.xpath(vek.buttonTwoEnter));
        buttonTwoEnter.click();
        Thread.sleep(2000);
        WebElement textErrorMail = driver.findElement(By.xpath(vek.textErrorMail));
        String actualTextErrorMail = textErrorMail.getText();
        Assertions.assertEquals("Электронная почта не указана", actualTextErrorMail);
        driver.quit();
    }

    @Test
    public void testNotUser() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.21vek.by/");
        Vek vek = new Vek();
        WebElement buttonAcceptCoocie = driver.findElement(By.xpath(vek.buttonAcceptCoocie));
        buttonAcceptCoocie.click();
        WebElement buttonAccount = driver.findElement(By.xpath(vek.buttonAccount));
        buttonAccount.click();
        Thread.sleep(2000);
        WebElement buttonEnter = driver.findElement(By.xpath(vek.buttonEnter));
        buttonEnter.click();
        Thread.sleep(2000);
        WebElement inputTextMail = driver.findElement(By.xpath(vek.inputTextMail));
        inputTextMail.sendKeys("mail");
        WebElement inputTextPassword = driver.findElement(By.xpath(vek.inputTextPassword));
        inputTextPassword.sendKeys("693");
        Thread.sleep(2000);
        WebElement buttonButtonTwoEnter = driver.findElement(By.xpath(vek.buttonTwoEnter));
        buttonButtonTwoEnter.click();
        Thread.sleep(2000);
        WebElement textErrorMessage = driver.findElement(By.xpath(vek.textErrorMessage));
        String actualtextErrorMessage = textErrorMessage.getText();
        Assertions.assertEquals("Неправильный формат электронной почты", actualtextErrorMessage);
        driver.quit();
    }
}







package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShareLaneTest {

    @Test
    public void fillInZipCodeFieldTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("10721");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        driver.quit();
    }

    @Test
    public void fillInZipCodeAndAllRegisterFieldsTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("10721");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        driver.findElement(By.name("first_name")).sendKeys("Anastasiya");
        driver.findElement(By.name("last_name")).sendKeys("Staravoitava");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("blablabla@gmail.com");
        driver.findElement(By.name("password1")).sendKeys("1111");
        driver.findElement(By.name("password2")).sendKeys("1111");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        driver.findElement(By.className("confirmation_message")).isDisplayed();
        driver.quit();
    }

    @Test
    public void fillInZipCodeAndAllObligatoryRegisterFieldsTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("10721");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        driver.findElement(By.name("first_name")).sendKeys("Anastasiya");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("blablabla@gmail.com");
        driver.findElement(By.name("password1")).sendKeys("1111");
        driver.findElement(By.name("password2")).sendKeys("1111");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        driver.findElement(By.className("confirmation_message")).isDisplayed();
        driver.quit();
    }

    @Test
    public void fillInZipCodeAndCompulsoryRegisterFieldsTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("10721");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        driver.findElement(By.name("last_name")).sendKeys("Staravoitava");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        driver.findElement(By.className("error_message")).isDisplayed();
        driver.quit();
    }

    @Test
    public void fillInZipCodeAllRegisterFieldsWithInvalidEmailTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("10721");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        driver.findElement(By.name("first_name")).sendKeys("Anastasiya");
        driver.findElement(By.name("last_name")).sendKeys("Staravoitava");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("blablabla");
        driver.findElement(By.name("password1")).sendKeys("1111");
        driver.findElement(By.name("password2")).sendKeys("1111");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        driver.findElement(By.className("error_message")).isDisplayed();
        driver.quit();
    }

    @Test
    public void fillInZipCodeAllRegisterFieldsWithDifferentPasswordsTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("10721");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        driver.findElement(By.name("first_name")).sendKeys("Anastasiya");
        driver.findElement(By.name("last_name")).sendKeys("Staravoitava");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("blablabla");
        driver.findElement(By.name("password1")).sendKeys("1111");
        driver.findElement(By.name("password2")).sendKeys("1212");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        driver.findElement(By.className("error_message")).isDisplayed();
        driver.quit();
    }

    @Test
    public void fillInZipCodeAllRegisterFieldsWithNumbersForNameAndSurnameTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("10721");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        driver.findElement(By.name("first_name")).sendKeys("1111");
        driver.findElement(By.name("last_name")).sendKeys("1111");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("blablabla@gmail.com");
        driver.findElement(By.name("password1")).sendKeys("1111");
        driver.findElement(By.name("password2")).sendKeys("1111");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        driver.findElement(By.className("error_message")).isDisplayed();
        driver.quit();
    }

    @Test
    public void fillInZipCodeAllRegisterFieldsWithCyrillicEmailTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("10721");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        driver.findElement(By.name("first_name")).sendKeys("Anastasiya");
        driver.findElement(By.name("last_name")).sendKeys("Staravoitava");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("премьер-министр@правительство.рф");
        driver.findElement(By.name("password1")).sendKeys("1111");
        driver.findElement(By.name("password2")).sendKeys("1111");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        driver.findElement(By.className("confirmation_message")).isDisplayed();
        driver.quit();
    }
}
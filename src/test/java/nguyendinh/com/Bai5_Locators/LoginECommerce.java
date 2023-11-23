package nguyendinh.com.Bai5_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginECommerce {
    public static void main(String[] args) throws InterruptedException {

        //Khởi tạo browser với Chrome
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        Thread.sleep(1000);  // làm chạy chậm lại

        //Mở trang eCommerce
        driver.get("https://demo.activeitzone.com/ecommerce/login");
        Thread.sleep(1000);

        //Điền Email - Tìm locator theo ID vs By.id()
        driver.findElement(By.name("email")).sendKeys("admin@example.com");


        //Điền password - Tìm locator theo Name vs By.name()
        driver.findElement(By.name("password")).sendKeys("123456");


        //Click link Forgot Password ? - By linkText()
        driver.findElement(By.linkText("Forgot Password")).click();

        Thread.sleep(2000);

        //Tắt browser
        driver.quit();
    }
}


//1:22
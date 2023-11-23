package nguyendinh.com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestSelenium {
    public static void main(String[] args) throws InterruptedException {

        //Khởi tạo browser với Chrome
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        Thread.sleep(1000);  // làm chạy chậm lại

        //Mở trang anhtester.com
        driver.get("https://anhtester.com/");

        Thread.sleep(100);

        //Click nút Login
        driver.findElement(By.xpath("//a[@id='btn-login']")).click();

        Thread.sleep(1000);

        //Tắt browser
        driver.quit();
    }

}


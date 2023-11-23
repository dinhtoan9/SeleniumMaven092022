package nguyendinh.com.Bai5_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginUCX {

    public static void main(String[] args) throws InterruptedException {

        //Khởi tạo browser với Chrome
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        Thread.sleep(1000);  // làm chạy chậm lại

        //Mở trang eCommerce
        driver.get("http://10.1.6.19/SSO/Account/Login?ReturnUrl{}/VCB_CS/Accounts/ccPopUp?Phone=0903336275&UCID=000003453453445&CDN=5287&Digibank=App");
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div/form/div[2]/div/input")).sendKeys("admin") ;

        driver.findElement(By.xpath("/html/body/div/form/div[3]/div/input")).sendKeys("admin");

        driver.findElement(By.xpath("/html/body/div/form/div[4]/div/button")).click() ;

        Thread.sleep(30000);

        //Tắt browser
        driver.quit();
    }

}
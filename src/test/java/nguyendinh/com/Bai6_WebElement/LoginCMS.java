package nguyendinh.com.Bai6_WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginCMS {
    public static void main(String[] args) throws InterruptedException {

        //Khởi tạo browser với Chrome
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Thread.sleep(1000);  // làm chạy chậm lại

        //Login CMS

        driver.get("https://demo.activeitzone.com/ecommerce/login");

        //Bắt WebElements Email (object--đối tượng)
        WebElement inputEmail = driver.findElement(By.id("email"));
        inputEmail.sendKeys("admin@example.com");

        System.out.println("Lấy text của ô Email: " + inputEmail.getText());
        System.out.println("Name ô Email: " + inputEmail.getAttribute("name"));
        System.out.println("Class ô Email: " + inputEmail.getAttribute("class"));

        driver.findElement(By.id("password")).sendKeys("123456");

        Thread.sleep(2000) ;

        //inputEmail.clear(); //xóa các giá trị trông ô vừa nhập


        WebElement checkBoxRemember1 = driver.findElement(By.id("remember"));
        System.out.println("Đã chọn: " + checkBoxRemember1.isSelected());

        driver.findElement(By.xpath("(//span[normalize-space()='Remember Me']")).click();

        WebElement checkBoxRemember2 = driver.findElement(By.id("remember"));
        System.out.println("Đã chọn: " + checkBoxRemember1.isSelected());


        //Get Text của tiêu đề H1
        WebElement tieude = driver.findElement(By.xpath("//div[@class='card-body']//h1"));
        System.out.println(tieude.getText());


        WebElement buttonCopy = driver.findElement(By.xpath("//button[normalize-space()='Copy'] "));
        System.out.println("Trạng thái nút Copy:" + buttonCopy.isDisplayed());

        WebElement buttonLogin = driver.findElement(By.xpath("//button[normalize-space()='Login'] "));

        Dimension dimension = buttonLogin.getSize();
        System.out.println("Height: " + dimension.height + "Width" +
                dimension.width);
        Point  point = tieude.getLocation();    //xem laij chỗ này gần cuối buổi 18
        System.out.println("X c");
        System.out.println(buttonLogin.getCssValue("background-color"));    //trả về mã màu RGBA

        if (buttonCopy.isDisplayed() == true) {


           // driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

           // driver.findElement(By.xpath("//button[normalize-space()='Login']")).submit();
            buttonLogin.submit();
        }


        Thread.sleep(1000);

        //Tắt Browser
        driver.quit();



    }
}


//1:30
package nguyendinh.com.Common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class BaseTest {

  public static WebDriver driver;

    //khởi tạo browser
    public static void createDriver(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(90));


    }



    //đóng browser
    public static void closeDriver(){
        driver.quit();   //quit đóng luôn trình duyệt , close chỉ đóng cửa sổ


    }

    public static void sleep(double seconds){
        try {
            Thread.sleep((long) (1000 * seconds));
        } catch (InterruptedException e ){
            throw new RuntimeException(e);

        }

    }

}
//52
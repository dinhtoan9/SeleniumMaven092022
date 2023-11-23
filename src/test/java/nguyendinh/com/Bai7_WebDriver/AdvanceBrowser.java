package nguyendinh.com.Bai7_WebDriver;

import nguyendinh.com.Common.BaseTest;
import org.openqa.selenium.WindowType;

import static nguyendinh.com.Common.BaseTest.createDriver;

public class AdvanceBrowser extends BaseTest {

    public static void main(String[] args) {
        createDriver();
        driver.get("https://anhtester.com");

        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("http://google.com");

        sleep(2);

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://anhtester.com/blog");

        closeDriver();




    }
}

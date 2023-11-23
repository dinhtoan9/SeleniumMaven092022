package nguyendinh.com.Bai7_WebDriver;

import nguyendinh.com.Common.BaseTest;
import org.openqa.selenium.By;

public class BasicBrowser extends BaseTest {
    public static void main(String[] args) {
        createDriver();

        driver.navigate().to("https://anhtester.com/" );
        sleep(2);

        driver.findElement(By.id("btn-login")).click();
        sleep(1);

        //điều hướng về lịch sử trang trước đó
     //   driver.navigate().back();
     //   sleep(1);

        //làm mới trang hiện tại
//        driver.navigate().refresh();
     //   sleep(1);

        //điều huownsg đến trang tiếp sau
     //   driver.navigate().forward();

        // Get the title of the page
        System.out.println(driver.getTitle());
// Get the current URL
        System.out.println(driver.getCurrentUrl());
// Get the current page HTML source
        System.out.println(driver.getPageSource());



        closeDriver();






    }
}

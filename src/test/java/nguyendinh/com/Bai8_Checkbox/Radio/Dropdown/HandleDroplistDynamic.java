package nguyendinh.com.Bai8_Checkbox.Radio.Dropdown;

import nguyendinh.com.Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandleDroplistDynamic extends BaseTest {
    public static void main(String[] args) {
        createDriver();
        driver.get("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");

        //click vào dropdown Category
        sleep(2);
        driver.findElement(By.xpath("//span[normalize-space()='Select a Category']")).click();

        //search vào giá trị cần chọn
        sleep(1);
        driver.findElement(By.xpath("//span[normalize-space()='Select a Category']/parent::a/following-sibling::div//input")).sendKeys("Hotels");

        //click chọn text đã search cần chojn (đã chọn)
        sleep(2);
       // driver.findElement(By.xpath("//li[@class='active-result result-selected'] ")).click();

        Actions action = new Actions(driver);
        action.sendKeys(Keys.ENTER).perform();   //cách Enter dùng cho trường hợp chỉ hiển thị 1 giá trị để chọn

        closeDriver();


    }
}


//1:30
package nguyendinh.com.Bai8_Checkbox.Radio.Dropdown;

import nguyendinh.com.Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.image.WritableRaster;

public class HandleCheckbox extends BaseTest {
    public static void main(String[] args) {
        createDriver();

        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

        //kieerm tra checkbox mặc định
        WebElement checkboxOne = driver.findElement(By.xpath("//input[@id='isAgeSelected'] "));
        boolean checkboxStatusBefore = checkboxOne.isSelected();
        System.out.println(checkboxStatusBefore);


        //nếu checkbox chưa chọn (false) thì click  chọn
        if(checkboxStatusBefore  == false){
            checkboxOne.click();
        }


        //kiểm tra lại kết quả sau khi click chọn
        sleep(1);
        boolean checkboxStatusAfter = checkboxOne.isSelected();
        System.out.println("Trạng thái checkbox sau khi chọn: " + checkboxStatusAfter);




        //kiểm tra thông báo liên quan với kết quả khi đã chọn
        sleep(1);
        WebElement message = driver.findElement(By.xpath("//div[@id='txtAge'] "));
        System.out.println("Trạng thái message: " + message.isDisplayed());
        System.out.println(message.getText());


        closeDriver();
    }

}

package nguyendinh.com.Bai8_Checkbox.Radio.Dropdown;

import nguyendinh.com.Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HandleMultipleCheckbox extends BaseTest {
    public static void main(String[] args) {
        createDriver();

        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
        sleep(1);

        List<WebElement> listCheckbox  = driver.findElements(By.xpath("//div[normalize-space()='Multiple Checkbox Demo']/following-sibling::div//input[@class='cb1-element']"));
        System.out.println(listCheckbox.size());

        for (int i = 1; i <= listCheckbox.size(); i++) {
            sleep(1);
            driver.findElement(By.xpath("//label[normalize-space()='Option " + i + "']")).click();

        }

        for (int i = 1; i <= listCheckbox.size(); i++) {
            sleep(1);
            boolean isSelected = driver.findElement(By.xpath("//label[normalize-space()='Option " + i + "']//input")).isSelected();
            System.out.println(isSelected);

        }

    }
}

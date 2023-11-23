package nguyendinh.com.Bai8_Checkbox.Radio.Dropdown;

import nguyendinh.com.Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleRadioButton extends BaseTest {
    public static void main(String[] args) {
        createDriver();
        driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");

        WebElement radioButton = driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div"));
        System.out.println(radioButton.isSelected());

        sleep(1);
        if(radioButton.isSelected() == false) {
            radioButton.click();

        }

        System.out.println(radioButton.isSelected());


        sleep(2);
        WebElement radioGroup = driver.findElement(By.xpath("(//h4[normalize-space()='Age Group :'])/following-sibling::label[normalize-space()='5 to 15']//input"));
        radioGroup.click();

        System.out.println("Trạng thái radio group:" + radioGroup.isSelected());

        WebElement radio0to5 = driver.findElement(By.xpath("(//h4[normalize-space()='Age Group :'])/following-sibling::label[normalize-space()='0 to 5']//input"));
        WebElement radio15to50 = driver.findElement(By.xpath("(//h4[normalize-space()='Age Group :'])/following-sibling::label[normalize-space()='15 to 50']//input"));

        System.out.println(radio0to5.isSelected());
        System.out.println(radio15to50.isSelected());


        closeDriver();
    }
}

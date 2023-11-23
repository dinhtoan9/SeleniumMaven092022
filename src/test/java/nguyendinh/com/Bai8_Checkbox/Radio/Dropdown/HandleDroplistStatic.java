package nguyendinh.com.Bai8_Checkbox.Radio.Dropdown;

import nguyendinh.com.Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleDroplistStatic extends BaseTest {
    public static void main(String[] args) {
        createDriver();

        driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");


        WebElement selectElement = driver.findElement(By.xpath("//select[@id='select-demo']"));

        //khởi tạo đối tượng và giá trị là một WebElement của thẻ select trong HTML

        Select select = new Select(selectElement);
        System.out.println(select.getFirstSelectedOption().getText());

        //Get option với các hàm hoox trợ của class select
        select.selectByVisibleText("Wednesday");
        sleep(2);

        System.out.println(select.getFirstSelectedOption().getText());
        System.out.println("kiểm tra có phải multiselect không:" + select.isMultiple());
        System.out.println("kiểm tra có mấy giá trị " + select.getOptions().size());


        select.selectByValue("Monday") ;
        sleep(2);
        System.out.println(select.getFirstSelectedOption().getText());

        select.selectByIndex(6);
        sleep(2);
        System.out.println(select.getFirstSelectedOption().getText());



        closeDriver();

    }


}

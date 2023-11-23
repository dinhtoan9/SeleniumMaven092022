package nguyendinh.com.Thuchanh;

import com.github.dockerjava.core.dockerfile.DockerfileStatement;
import nguyendinh.com.Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class ClientCRM extends BaseTest {
    public static void signinCRM() {

        driver.get("https://rise.fairsketch.com/signin ");


        //xóa giá trị mặc định vì trong web đã nhập sẵn giá trị mặc định

        driver.findElement(By.xpath("//input[@id='email']")).clear();
        driver.findElement(By.xpath("//input[@id='password']")).clear();

        //login sau khi xóa
        sleep(2);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@demo.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("riseDemo");
        driver.findElement(By.xpath("//button[@class='w-100 btn btn-lg btn-primary']")).click();
        sleep(2);

    }

    //Open client page
    public static void OpenClientPage() {
        driver.findElement(By.xpath("//span[normalize-space()='Clients']")).click();
        driver.findElement(By.xpath("//div[@id='page-content']//a[normalize-space()='Clients']")).click();

    }

    //Add client
    public static void AddClent(String ClientName) {
        driver.findElement(By.xpath("//a[normalize-space()='Add client']")).click();
        sleep(2);
        driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys(ClientName );
        driver.findElement(By.xpath("//div[@id='s2id_created_by']//a")).click();
        driver.findElement(By.xpath("//div[@id='select2-drop']//input")).sendKeys("Sara Ann", Keys.ENTER);
        driver.findElement(By.id("address")).sendKeys("Hà nội");
        driver.findElement(By.id("city")).sendKeys("Nam Định");
        driver.findElement(By.id("state")).sendKeys("chiến dịch");
        driver.findElement(By.id("zip")).sendKeys("not zip");
        driver.findElement(By.id("country")).sendKeys("zê zê");
        driver.findElement(By.id("phone")).sendKeys("0981002736");
        driver.findElement(By.id("website")).sendKeys("http");

        //cuộn chuột (do trường này auto k kéo đến đc)
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//label[normalize-space()='Disable online payment']")));
        driver.findElement(By.id("vat_number")).sendKeys("0");

        sleep(2);

        driver.findElement(By.xpath("//div[@id='s2id_group_ids']")).click();
        driver.findElement(By.xpath("//div[@id='s2id_group_ids']//input")).sendKeys("VIP",Keys.ENTER );
        sleep(2);

        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }

    //check sau khi add
    public static void checkClientAfterAdded(String ClientName){

        driver.findElement(By.xpath("//input[@type='search']")).sendKeys(ClientName);

        sleep(2);

        String clientnameintable = driver.findElement(By.xpath("//table[@id='client-table']//tbody//tr//td[2]")).getText();
        System.out.println(clientnameintable);
        sleep(2);
    }

    public static void main(String[] args) {
        createDriver();

        signinCRM();

        OpenClientPage();

        AddClent("Sunivy");

        checkClientAfterAdded("Sunivy");







        closeDriver();


    }
}


//37
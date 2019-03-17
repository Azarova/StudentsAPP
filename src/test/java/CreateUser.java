import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateUser {

    @Test
    public void createUser() {

        WebDriver driver = new ChromeDriver();
        driver.get("http://37.59.228.229:3000");
        driver.findElement(By.cssSelector("body > div.row > div.col.s3.blue.lighten-5.list-container > a > i")).click();
        driver.findElement(By.cssSelector("#icon_prefix")).clear();
        driver.findElement(By.cssSelector("#icon_prefix")).sendKeys("Olga");
        driver.findElement(By.cssSelector("#icon_telephone")).clear();
        driver.findElement(By.cssSelector("#icon_telephone")).sendKeys("775562");
        driver.findElement(By.cssSelector("body > div.row > div.col.s9.main-content > form > div.row.type-field > div > input")).click();
        driver.findElement(By.cssSelector("body > div.row > div.col.s9.main-content > form > div.row.type-field > div > input")).sendKeys(Keys.ARROW_UP);
        driver.findElement(By.cssSelector("body > div.row > div.col.s9.main-content > form > div.row.type-field > div > input")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("body > div.row > div.col.s9.main-content > a")).click();

    }

}

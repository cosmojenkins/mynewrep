import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;


public class Avito {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\WebDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        driver.get("https://yandex.ru");

        driver.navigate().to("https://www.avito.ru/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        WebElement setCategory = driver.findElement(By.xpath("//*[@id=\"category\"]"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        setCategory.click();

        driver.findElement(By.xpath("//*[@id=\"category\"]/option[56]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        WebElement findPlaceforProduct = driver.findElement(By.xpath("//input[@data-marker='search-form/suggest']"));
        findPlaceforProduct.sendKeys("Принтер");

        WebElement findCityPlace = driver.findElement(By.className("main-text-_Thor"));
        findCityPlace.click();

        WebElement findAndPrintRegion = driver.findElement(By.className("suggest-input-rORJM"));
        findAndPrintRegion.sendKeys("Владивосток");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement findAndClickForRegion = driver.findElement(By.className("suggest-suggest-content-raQZy"));
        findAndClickForRegion.click();

        WebElement clickTooFindRes = driver.findElement(new By.ByCssSelector("div div div div div.popup-buttons-WICnh"));
        clickTooFindRes.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        WebElement checkBoxDelivery = driver.findElement(new By.ByCssSelector("[data-marker = delivery-filter]"));
        if (!checkBoxDelivery.isSelected()) {
            checkBoxDelivery.click();
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement findAndCheckRes = driver.findElement(new By.ByCssSelector("[data-marker = \"search-filters/submit-button\"]"));
        findAndCheckRes.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement setPriceFilter = driver.findElement(new By.ByCssSelector("div[class = \"index-content-_KxNP\"] [class = \"select-select-IdfiC\"]"));
        setPriceFilter.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement setPrice = driver.findElement(new By.ByCssSelector("div[class = \"index-content-_KxNP\"] [data-marker = \"option(2)\"]"));
        setPrice.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        System.out.println(driver.findElement(new By.ByCssSelector("div[data-marker = \"item\"]:nth-child(1) h3")).getText()); //название первого принтера
        System.out.println(driver.findElement(new By.ByCssSelector("div[data-marker = item]:nth-child(1) meta:nth-child(2)")).getAttribute("content"));
        System.out.println();
        System.out.println(driver.findElement(new By.ByCssSelector("div[data-marker = \"item\"]:nth-child(2) h3")).getText()); //название первого принтера
        System.out.println(driver.findElement(new By.ByCssSelector("div[data-marker = item]:nth-child(2) meta:nth-child(2)")).getAttribute("content"));
        System.out.println();
        System.out.println(driver.findElement(new By.ByCssSelector("div[data-marker = \"item\"]:nth-child(3) h3")).getText()); //название первого принтера
        System.out.println(driver.findElement(new By.ByCssSelector("div[data-marker = item]:nth-child(3) meta:nth-child(2)")).getAttribute("content"));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        driver.close();
    }
}
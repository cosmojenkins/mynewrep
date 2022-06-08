import io.qameta.allure.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AvitoTest {
    WebDriver driver;

    @Epic("Testing for site avito.ru")
    @Feature(value = "Tests for at-school")
    @Description("В этом тесте мы протестируем сайт авито на его функционал")
    @Test
    public void testAvito(){
        firstStep();
        setCategory();
        selectCategory();
        findPlaceforProduct();
        findCityPlace();
        findAndPrintRegion();
        clickOnRegion();
        clickToSearchRes();
        checkBoxDelivery();
        findAndCheckRes();
        setPriceFilter();
        writeInConsole();
        exit();
    }
    @Attachment(value = "Attachment Screenshot", type = "image/png")
    public byte[] screenShot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    @Severity(SeverityLevel.CRITICAL)
    @Step(value = "Открытие браузера, переход на сайт avito.ru")
    public void firstStep() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\WebDriver\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.get("https://www.avito.ru/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        screenShot();
    }

    @Severity(SeverityLevel.MINOR)
    @Step(value = "Выпадающий список категорий")
    public void setCategory() {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"category\"]"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        element.click();
        screenShot();
    }

    @Severity(SeverityLevel.TRIVIAL)
    @Step(value = "Выбор нужной категории")
    public void selectCategory() {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"category\"]/option[56]"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        element.click();
        screenShot();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Step(value = "Ввод в поиск название нужного продукт ")
    public void findPlaceforProduct() {
        WebElement element = driver.findElement(By.xpath("//input[@data-marker='search-form/suggest']"));
        element.sendKeys("Принтер");
        screenShot();
    }

    @Severity(SeverityLevel.MINOR)
    @Step(value = "Поиск и нахождение строки для ввода региона")
    public void findCityPlace() {
        WebElement element = driver.findElement(By.className("main-text-_Thor"));
        element.click();
        screenShot();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    @Severity(SeverityLevel.CRITICAL)
    @Step(value = "Ввод названия нужного региона")
    public void findAndPrintRegion() {
        WebElement element = driver.findElement(By.className("suggest-input-rORJM"));
        element.sendKeys("Владивосток");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@data-marker='suggest(0)']")));
        screenShot();
    }

    @Severity(SeverityLevel.MINOR)
    @Step(value = "Нажатие на нужный регион из выпадающего списка")
    public void clickOnRegion() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement element = driver.findElement(By.className("suggest-suggest-content-raQZy"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        if(element.isDisplayed()) {
            element.click();
        }
        screenShot();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Step(value = "Нажатие на кнопку 'Показать объявления ' №1 ")
    public void clickToSearchRes() {
        WebElement element = driver.findElement(new By.ByCssSelector("div div div div div.popup-buttons-WICnh"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        element.click();
        screenShot();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @Severity(SeverityLevel.TRIVIAL)
    @Step(value = "Проверка чек-бокса 'С доставкой Авито' ")
    public void checkBoxDelivery() {
        WebElement element = driver.findElement(new By.ByCssSelector("[data-marker = delivery-filter]"));
        if (!element.isSelected()) {
            element.click();
        }
        screenShot();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    @Severity(SeverityLevel.MINOR)
    @Step(value = "Нажатие на кнопку 'Показать объявления' №2 ")
    public void findAndCheckRes() {
        WebElement element = driver.findElement(new By.ByCssSelector("[data-marker = \"search-filters/submit-button\"]"));
        element.click();
        screenShot();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    @Severity(SeverityLevel.NORMAL)
    @Step(value = "Нажатие на фильтр цены")
    public void setPriceFilter() {
        WebElement element = driver.findElement(new By.ByCssSelector("div[class = \"index-content-_KxNP\"] [class = \"select-select-IdfiC\"]"));
        element.click();
        screenShot();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        element = driver.findElement(new By.ByCssSelector("div[class = \"index-content-_KxNP\"] [data-marker = \"option(2)\"]"));
        element.click();
        screenShot();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    @Severity(SeverityLevel.NORMAL)
    @Step(value = "Вывод в консоль трех самых дорогих принтеров с ценой и названием")
    public void writeInConsole() {
        System.out.println(driver.findElement(new By.ByCssSelector("div[data-marker = \"item\"]:nth-child(1) h3")).getText()); //название первого принтера
        System.out.println(driver.findElement(new By.ByCssSelector("div[data-marker = item]:nth-child(1) meta:nth-child(2)")).getAttribute("content"));
        System.out.println();
        System.out.println(driver.findElement(new By.ByCssSelector("div[data-marker = \"item\"]:nth-child(2) h3")).getText()); //название первого принтера
        System.out.println(driver.findElement(new By.ByCssSelector("div[data-marker = item]:nth-child(2) meta:nth-child(2)")).getAttribute("content"));
        System.out.println();
        System.out.println(driver.findElement(new By.ByCssSelector("div[data-marker = \"item\"]:nth-child(3) h3")).getText()); //название первого принтера
        System.out.println(driver.findElement(new By.ByCssSelector("div[data-marker = item]:nth-child(3) meta:nth-child(2)")).getAttribute("content"));
        screenShot();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }

    @AfterClass
    @Step(value = "Закрытие браузера")
    public void exit() {
        driver.quit();
    }
}

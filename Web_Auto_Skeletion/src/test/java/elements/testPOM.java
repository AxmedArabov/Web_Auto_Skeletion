package elements;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class testPOM {

    public testPOM(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[contains(text(),'MORTGAGE LOANS')]")
    WebElement ClickMortagageBtn;


    public void ClickMortagageBtn() throws InterruptedException {
        ClickMortagageBtn.click();
    }

    @FindBy(xpath = "//button[@type='button']//span[@class='GSQ5Afcn1ZmUuzac9nGBwQ=='][contains(text(),'Müraciət et')]")
    WebElement MuracietEt;
    public void Muraciet() throws InterruptedException {
        Thread.sleep(5000);
        MuracietEt.click();
    }

    @FindBy(xpath = "//div[@class='customer-form__personal']/div[1]//div[@class='LP4DocCpqukKwr23OZWFUw==']")
    WebElement IpotekaNovu;
    public void IpotekaNovu() throws InterruptedException {
        Thread.sleep(5000);
        IpotekaNovu.click();
    }

    @FindBy(xpath = "//div[@class='bckETa1ylJt3wQgqXhrhAA==']/div[@class='uJamIEhwO3ybZrwL1w3Njg== U4DjsFaEl0IqyoLCnevVaQ==']/div[.='Çıxarışlı evlər üçün ipoteka']")
    WebElement Types_of_mortgagess;
    public void Types_of_mortgages() throws InterruptedException {
        Thread.sleep(3000);
        Types_of_mortgagess.click();
    }

    @FindBy(xpath = "//input[@name='pinCode']")
    WebElement FinKod;
    public void Fin() throws InterruptedException {
        Thread.sleep(3000);
        FinKod.sendKeys("6GYD9W8");
    }

    @FindBy(xpath = "//input[@id=':r3:']")
    WebElement MobNUmber;
    public void Number() throws InterruptedException {
        Thread.sleep(3000);
        MobNUmber.sendKeys("994553457007");
    }

    @FindBy(xpath = "//div[@class='customer-form__personal']/div[4]//div[@class='LP4DocCpqukKwr23OZWFUw==']")
    WebElement AileVeziyyeti;
    public void AileVeziyyeti() throws InterruptedException {
        Thread.sleep(3000);
        AileVeziyyeti.click();
    }

    @FindBy(xpath = "//div[@class='bckETa1ylJt3wQgqXhrhAA==']//div[@class='lHRlgPvVR-Hf11tKb4gKfg==']/div[.='Evli']")
    WebElement AileVeziyyetiniSec;
    public void AileVeziyyetisec() throws InterruptedException {
        Thread.sleep(3000);
        AileVeziyyetiniSec.click();
    }

    @FindBy(xpath = "//input[@id=':r6:']")
    WebElement AileUzvlerininSayi;
    public void AileUzvlerininSayi() throws InterruptedException {
        Thread.sleep(2000);
        AileUzvlerininSayi.sendKeys("3");
    }

    @FindBy(xpath = "(//div[@class='index-module_control__3QpvA'])[1]")
    WebElement ResmiEmekhaqqi;
    public void ResmiEmekhaqqi() throws InterruptedException {
        Thread.sleep(2000);
        ResmiEmekhaqqi.click();
    }
    @FindBy(xpath = "//div[@class='customer-form__income-and-work-checkbox__group']/div[2]//div[@class='index-module_control__3QpvA']")
    WebElement TeqaudMuavinet;
    public void TeqaudMuavinet() throws InterruptedException {
        Thread.sleep(2000);
        TeqaudMuavinet.click();
    }
    @FindBy(xpath = "//div[@class='customer-form__income-and-work-checkbox__group']/div[4]//div[@class='index-module_control__3QpvA']")
    WebElement DigerGelirMenbeyi;
    public void DigerGelirMenbeyi() throws InterruptedException {
        Thread.sleep(2000);
        DigerGelirMenbeyi.click();
    }
    @FindBy(id = ":ra:")
    WebElement AyliqMenfeet;
    public void AyliqMenfeet() throws InterruptedException {
        Thread.sleep(2000);
        AyliqMenfeet.sendKeys("3627.40");
    }
    @FindBy(id = ":rc:")
    WebElement FealiyyetMuddeti;
    public void FealiyyetMuddeti() throws InterruptedException {
        Thread.sleep(2000);
        FealiyyetMuddeti.sendKeys("12");
    }
    @FindBy(xpath = "//div[@class='customer-form__bonus-radio__group']/label[1]/div[@class='index-module_control__Z7fLW']")
    WebElement BonusBeli;
    public void BonusBeli() throws InterruptedException {
        Thread.sleep(2000);
        BonusBeli.click();
    }
    @FindBy(name = "bonusIncome")
    WebElement BonusMebleqi;
    public void BonusMebleqi() throws InterruptedException {
        Thread.sleep(2000);
        BonusMebleqi.sendKeys("2000");
    }
    @FindBy(xpath = "//div[@class='customer-form__section']/button[@class='ZJeD2gn9glw28HgrG6KsWg== nnqCC2CyuIDK1XXtzGMXLA== AozMA2GZtSpElFwIQ--USg==']")
    WebElement MuracietETIpoteka;
    public void MuracietETIpoteka() throws InterruptedException {
        Thread.sleep(3000);
        MuracietETIpoteka.click();
    }
    @FindBy(xpath = "//div[@class='otp-title']")
    WebElement Result;
    public void Results() throws InterruptedException {
        Thread.sleep(3000);
        Result.isDisplayed();
    }
}



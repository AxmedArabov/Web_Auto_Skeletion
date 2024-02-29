package steps;

import elements.testPOM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.Set;


public class testSteps {


    protected WebDriver driver = utils.driver.getDriver();
    testPOM xq = new testPOM(driver);


    @Given("go to kapitalbank az")
    public void go_to_kapitalbank_az() {
        driver.get("https://www.kapitalbank.az/en/");
    }

    @When("Click Mortagage loans")
    public void Click_Mortagage_Loans() throws InterruptedException {
        xq.ClickMortagageBtn();

        String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();

        for (String handle : allWindowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
    }

    @And("Click to Muraciet Et")
    public void ClickMuracietETBtn() throws InterruptedException {
        xq.Muraciet();
    }

    @And("Click Ipoteka novu Label")
    public void ClickToIpotekaNovuLabel() throws InterruptedException {
        xq.IpotekaNovu();
    }

    @And("Choose ipotekanin novu")
    public void Chooseipotekaninnovu() throws InterruptedException {
        xq.Types_of_mortgages();
    }

    @And("Fill Fin kod")
    public void ClickFinkod() throws InterruptedException {
        xq.Fin();
    }

    @And("Fill  Number")
    public void Fillnumber() throws InterruptedException {
        xq.Number();
    }
    @And("Click Aile Veziyyeti")
    public void ClickAileVeziyyeti() throws InterruptedException {
        xq.AileVeziyyeti();
    }
    @And("Click Evli")
    public void ClickEvli() throws InterruptedException {
        xq.AileVeziyyetisec();
    }
    @And("Add Aile Uzvlerinin sayi")
    public void AileUzvlerininSayi() throws InterruptedException {
        xq.AileUzvlerininSayi();
    }
    @And("Click Resmi Emekhaqqi")
    public void ClickResmiEmekhaqqi() throws InterruptedException {
        xq.ResmiEmekhaqqi();
    }
    @And("Click Teqaud Muavinet")
    public void ClickTeqaudMuavinet() throws InterruptedException {
        xq.TeqaudMuavinet();
    }
    @And("Click Diger Gelir Menbeyi")
    public void ClickDigerGelirMenbeyi() throws InterruptedException {
        xq.DigerGelirMenbeyi();
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0, 500)");
    }
    @And("Fill Orta Ayliq Xalis Menfeet")
    public void FillOratAyliqXalisMenfeet() throws InterruptedException {
        xq.AyliqMenfeet();
    }
    @And("Fill Fealiyyet Muddeti")
    public void FillFealiyyetMuddeti() throws InterruptedException {
        xq.FealiyyetMuddeti();
    }
    @And("Click Beli")
    public void ClickBeli() throws InterruptedException {
        xq.BonusBeli();
    }
    @And("Fill Bonus Meblegi")
    public void FillBonusMeblegi() throws InterruptedException {
        xq.BonusMebleqi();
    }
    @And("Click Muraciet Et Ipoteka")
    public void ClickMuracietEtIpoteka() throws InterruptedException {
        xq.MuracietETIpoteka();
        Thread.sleep(5000);
    }
    @Then("See the result")
    public void seeTheResult() throws InterruptedException {
        xq.Results();
    }
}

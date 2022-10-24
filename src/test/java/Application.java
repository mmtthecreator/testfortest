import com.codeborne.selenide.Condition;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Application {

    @Test
    public void shouldOpenSite() {
        //open site
        WebDriverManager.chromedriver().setup();
        open("https://next.privat24.ua/money-transfer/card");

        //do some action
        $("[data-qa-node=\"numberdebitSource\"]").sendKeys("4552331448138217");
        $("[data-qa-node=\"expiredebitSource\"]").sendKeys("05/24");
        $("[data-qa-node=\"cvvdebitSource\"]").sendKeys("926");
        $("[data-qa-node=\"lastNamedebitSource\"]").sendKeys("Mikolovic");
        $("[data-qa-node=\"firstNamedebitSource\"]").sendKeys("Mike");
        $("[data-qa-node=\"numberreceiver\"]").sendKeys("4004159115449003");
        $("[data-qa-node=\"firstNamereceiver\"]").sendKeys("Mikola");
        $("[data-qa-node=\"lastNamereceiver\"]").sendKeys("Mikolovic");
        $("[data-qa-node=\"currency\"]").click();
        $("[data-qa-value=\"USD\"]").click();
        $("[data-qa-node=\"amount\"]").sendKeys("123");
        $("[type=\"submit\"]").click();

        // check values
        $("[data-qa-node=\"payer-card\"]").shouldHave(Condition.text("4552 3314 4813 8217"));
        $("[data-qa-node=\"receiver-name\"]").shouldHave(Condition.text("MIKOLA MIKOLOVIC"));
        $("[data-qa-node=\"receiver-card\"]").shouldHave(Condition.text("4004 1591 1544 9003"));
        $("[data-qa-node=\"payer-amount\"]").shouldHave(Condition.text("123 USD"));
        $("[data-qa-node=\"receiver-amount\"]").shouldHave(Condition.text("123 USD"));
        $("[data-qa-node=\"payer-currency\"]").shouldHave(Condition.text("5.41 USD"));
        $("[data-qa-node=\"total\"]").shouldHave(Condition.text("Разом до списання 128.41 USD"));


    }}
//
//    public void shouldAddProductToCart() {
//
//        //open site
//
//        //do some action
//
//        // check values
//    }
//}

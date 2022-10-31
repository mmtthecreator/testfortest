package pages;

import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class Sidemenu {
    WebElement iconLogout = $(".icon-logout");

    public void logoutSideMenu(){
        iconLogout.click();
    }
}

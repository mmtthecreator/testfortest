package pages;

import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class Header {

    WebElement signIn = $(".header_signin");
    WebElement guestLogin = $(".-guest");
    WebElement dropDown = $("#userNavDropdown");
    WebElement logoutDropdown = $x("//button[text()='Logout']");
    public void openLoginModal() {

        signIn.click();
    }
    public void logoutHeader() {

        dropDown.click();
        logoutDropdown.click();
    }

}

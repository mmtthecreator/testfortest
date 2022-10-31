package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginModal {
    public void login(String email, String password) {
        $("#signinEmail").sendKeys(email);
        $("#signinPassword").sendKeys(password);
        $("[for=\"remember\"]").click();
        $x("//button[text()='Login']").click();

    }
}

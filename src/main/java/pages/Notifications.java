package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class Notifications {
    public void checkMessage(String message ) {
        $(".alert-success").should(Condition.text(message));
    }
}

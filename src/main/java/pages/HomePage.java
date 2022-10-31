package pages;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.open;

public class HomePage extends BasePage{
    public HomePage open (){
        Selenide.open("https://qauto.forstudy.space/", "", "guest", "welcome2qauto");
        return new HomePage();
    }
}

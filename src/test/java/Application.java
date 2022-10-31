import com.codeborne.selenide.Condition;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import pages.*;

import static com.codeborne.selenide.Selenide.*;

public class Application {
    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();

    }

    @Test
    public void canAddCar() {
        HomePage homepage = new HomePage().open();
        homepage.header.openLoginModal();
        LoginModal loginModal = new LoginModal();
        loginModal.login("vladmomottomom@gmail.com","Qwerty1234");
        GaragePage garagePage = new GaragePage();
        garagePage.notifications.checkMessage("You have been successfully logged in");
        garagePage.openAddCarPopup();
        garagePage.enterDataCar();
        garagePage.notifications.checkMessage("Car added");

    }
    @Test
    public void canLogoutViaHeader() {
        HomePage homepage = new HomePage().open();
        homepage.header.openLoginModal();
        LoginModal loginModal = new LoginModal();
        loginModal.login("vladmomottomom@gmail.com","Qwerty1234");
        GaragePage garagePage = new GaragePage();
        garagePage.notifications.checkMessage("You have been successfully logged in");
        Header header = new Header();
        header.logoutHeader();

    }

    @Test
    public void canLogoutViaSideMenu(){
        HomePage homepage = new HomePage().open();
        homepage.header.openLoginModal();
        LoginModal loginModal = new LoginModal();
        loginModal.login("vladmomottomom@gmail.com","Qwerty1234");
        GaragePage garagePage = new GaragePage();
        garagePage.notifications.checkMessage("You have been successfully logged in");
        Sidemenu sidemenu = new Sidemenu();
        sidemenu.logoutSideMenu();

    }
}


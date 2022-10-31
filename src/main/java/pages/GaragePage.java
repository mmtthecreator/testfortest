package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class GaragePage extends BasePage{

    WebElement addCar = $x("//button[text()='Add car']");

    public void openAddCarPopup(){
        addCar.click();
    }
    public void enterDataCar(){
        $("#addCarBrand").selectOptionContainingText("BMW");
        $("#addCarModel").selectOptionContainingText("X5");
        $("#addCarMileage").sendKeys("250");
        $x("//button[text()='Add']").click();
        $(".alert-success").should(Condition.text("Car added"));
    }
}

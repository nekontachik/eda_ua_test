package ua.eda.test_example.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Main {
    public static void visit() {
        open("https://eda.ua/");
        $(".banner-find-restaurant_simple").waitUntil(appear, 20000);
    }

    public static ElementsCollection districts = $$(".user-location-district+#districtName option");

    public static void selectDistrict(String district) {
        $(".user-location-district").click();
        $(byText(district)).click();
    }

    public static SelenideElement search = $("#restaurant_models_Restaurant_name");

    public static void searchRestaurant(String restaurantName) {
        search.setValue(restaurantName).pressEnter();
    }

}


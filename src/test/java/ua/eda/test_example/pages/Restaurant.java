package ua.eda.test_example.pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Restaurant {

    public static void chooseFood(String sushi, String soup) {
        $$(".dotted").findBy(Condition.textCaseSensitive("Роллы")).click();
        $$(".item-holder").findBy(Condition.textCaseSensitive(sushi)).click();
        $$(".dotted").findBy(Condition.textCaseSensitive("Супы")).click();
        $$(".item-holder").findBy(Condition.textCaseSensitive(soup)).click();
        $(".badyl .cart__submit").click();
    }

    public static void assertRestaurantPage() {
        $(".widget").waitUntil(appear, 20000);
    }
}

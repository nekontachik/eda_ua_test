package ua.eda.test_example.pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Search {

    public static void chooseRestaurant(String restaurantName) {
        $("#ajax-short-restaurants-view-li").click();
        $$(".card__main").findBy(Condition.textCaseSensitive(restaurantName)).click();
    }

    public static void assertSearchPage() {
        $(".search-panel.box").waitUntil(appear, 20000);
    }

}


package ua.eda.test_example;

import org.junit.Test;
import ua.eda.test_example.pages.Main;
import ua.eda.test_example.pages.Order;
import ua.eda.test_example.pages.Restaurant;
import ua.eda.test_example.pages.Search;

import static com.codeborne.selenide.Selenide.open;

public class EndToEndTest {
    @Test
    public void buyFoodWorkFlow() {
        open("https://eda.ua/");
        Main.selectDistrict("Печерский");
        Main.searchRestaurant("Сушия");

        Search.assertSearchPage();
        Search.chooseRestaurant("Сушия");

        Restaurant.assertRestaurantPage();
        Restaurant.chooseFood("Набор «Филадельфия»", "Суп «Удон»");

        Order.assertOrderPage();
        Order.makeOrder("Anton", "0972222222", "user@mail.com", "Borcshagovka", "Karmazina", "23");
    }
}

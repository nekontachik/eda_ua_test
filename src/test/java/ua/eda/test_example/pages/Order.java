package ua.eda.test_example.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.$;

public class Order {

    public static SelenideElement name = $("#order_models_Order_customer_name");
    public static SelenideElement phone = $("#order_models_Order_customer_phone");
    public static SelenideElement email = $("#email-field");
    public static SelenideElement street = $("#order_models_Order_customer_street");
    public static SelenideElement house = $("#customer_building");
    public static SelenideElement apartment = $("#order_models_Order_customer_apartment");
    public static SelenideElement changeFromMoney = $("#order_models_Order_customer_apartment");
    public static SelenideElement submitOrderButton = $("#.btn-checkout");


    public static void makeOrder(String userName, String userPhone, String userMail, String userStreet,
                                 String userHouse, String userApartment) {
        name.val(userName);
        phone.val(userPhone);
        email.val(userMail);
        street.val(userStreet);
        house.val(userHouse);
        apartment.val(userApartment);
    }

    public static void assertOrderPage() {
        $("#order_models_Order_customer_name").waitUntil(appear, 20000);
    }

}

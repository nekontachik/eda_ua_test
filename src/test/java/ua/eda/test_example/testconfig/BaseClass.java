package ua.eda.test_example.testconfig;


import com.codeborne.selenide.Configuration;

public class BaseClass {
    {
        Configuration.browser = System.getProperty("driver.browser");
    }
}

package tests;

import org.testng.annotations.Test;
import pages.adminPages;
import utilities.ConfigReader;
import utilities.Driver;

public class US01 {

    adminPages adminPages = new adminPages();
    @Test
    public void US01(){

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        adminPages.signInButton.click();
        Driver.quitDriver();
        System.out.println("Projemiz başlıyor");
        System.out.println("merhaba 168");
        System.out.println("projeye devam");
    }
}

package TEST;

import PagesMethods.Methods;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class Tests extends Methods {

    @Test
    public void UrunAlma() throws InterruptedException {
        //Belirlenen Adrese Gider
        Navigate("https://www.trendyol.com/");
        //Cinsiyet seçme Pop-up'ını kapatır
        ClickElementByXpath("//*[@id='gender-popup-modal']/div/div/div[1]");
        //Arama yerin Çorap kelimesini yazdırıl
        SendKeysElementsByXpath("//*[@id=\"sfx-discovery-search-suggestions\"]/div/div/input","Çorap");
        //Arama Butonuna tıklama işlemi yapar
        ClickElementByXpath("//*[@id=\"sfx-discovery-search-suggestions\"]/div/div/i");
        //Mevcut Xpath ile 1.Satır 4.Sutündaki çorap'a tıklatır
        ClickElementByXpathWithActions("//*[@id=\"search-app\"]/div/div[1]/div[2]/div[3]/div[1]/div/div[5]/div[1]/a/div[1]/div[2]/div[2]");
        //1.Sekmeden 2.Sekmeye sağlar
        driverSwitchNewTab(1);
        //Ürünü sepete ekler.
        ClickElementByXpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[1]/div[2]/div[2]/div[5]/button/div[1]");
        //Sekmeyi kapama işlemi
        webdriver.close();
        //Sekmeyi değiştirme işlemi
        driverSwitchNewTab(0);
        //Arama yerin Hırka kelimesini yazdırıl
        SendKeysElementsByXpath("//*[@id=\"sfx-discovery-search-suggestions\"]/div/div/input","Hırka");
        //Arama Butonuna tıklama işlemi yapar
        ClickElementByXpath("//*[@id=\"sfx-discovery-search-suggestions\"]/div/div/i");
        //Mevcut Xpath ile 1.Satır 4.Sutündaki Hırka'ya tıklatır(Renk Seçimi yapabileceği seçeneği çıktığı için iki kere tıklama yapılmıştır)
        ClickElementByXpathWithActions("//*[@id=\"search-app\"]/div/div[1]/div[2]/div[3]/div[1]/div/div[5]/div[1]/a/div[1]/div[2]/div[2]");
        ClickElementByXpathWithActions("//*[@id=\"search-app\"]/div/div[1]/div[2]/div[3]/div[1]/div/div[5]/div[1]/a/div[1]/div[2]/div[2]");
        //1.Sekmeden 2.Sekmeye sağlar
        driverSwitchNewTab(1);
        //Ürünü sepete ekler.
        ClickElementByXpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[1]/div[2]/div[2]/div[5]/button/div[1]");
        //Sepetim'e tıklama yapar
        ClickElementByXpath("//*[@id=\"account-navigation-container\"]/div/div[2]/a/p");
        //Sepetimi Onayla Butonuna tıklar
        ClickElementByXpath("//*[@id=\"pb-container\"]/aside/div/div[4]/a/span");
        Thread.sleep(3000);
    }
}

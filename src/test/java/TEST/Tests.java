package TEST;

import PagesMethods.Methods;
import org.junit.jupiter.api.Test;

public class Tests extends Methods {

    @Test
    public void UrunAlma()
    {
        Navigate("https://www.trendyol.com/");
        ClickElementByXpath("//*[@id='gender-popup-modal']/div/div/div[1]");
        SendKeysElementsByXpath("//*[@id=\"sfx-discovery-search-suggestions\"]/div/div/input","Çorap");
        ClickElementByXpath("//*[@id=\"sfx-discovery-search-suggestions\"]/div/div/i");
        ClickElementByXpathWithActions("//*[@id=\"search-app\"]/div/div[1]/div[2]/div[3]/div[1]/div/div[5]/div[1]/a/div[1]/div[2]/div[2]");

    }
}

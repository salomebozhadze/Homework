import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import  org.junit.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.sleep;


public class homework4 {
    @Test

    public void homework_4(){

        WebDriverManager.chromedriver().setup();
        Configuration.startMaximized = true;
        Selenide.open("https://www.google.com/");
        $(byClassName("gLFyf")).setValue("Test Automaion");
        $(byName("btnK")).click();
        sleep(5000);

    }


}



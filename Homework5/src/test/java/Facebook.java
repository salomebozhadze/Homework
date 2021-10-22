import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import  org.junit.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class Facebook {
@Test
    public void Homework5(){
    WebDriverManager.chromedriver().setup();
    Configuration.startMaximized = true;
    Selenide.open("https://www.facebook.com/");
    $("._42ft._4jy0._6lti._4jy6._4jy2.selected._51sy").click();
    $(byName("firstname")).setValue("Salome");
    $(byName("lastname")).setValue("Bozhadze");
    $(byName("reg_email__")).setValue("593277778");
    $(byName("reg_passwd__")).setValue("Salome1989");
    $(byName("birthday_day")).selectOption("6");
    $(byName("birthday_month")).selectOption("Aug");
    $(byName("birthday_year")).selectOption("1989");
    $("._58mt", 2).click();
    $(byText("Select your pronoun")).shouldBe(Condition.visible);
    $(byText("Gender (optional)")).shouldBe(Condition.visible);
    sleep(3000);
    $("._7-16._9hk6._5dba").selectOption("She: \"Wish her a happy birthday!\"");
    $("._58mt", 0).click();
    $(byText("Select your pronoun")).shouldBe(Condition.visible);
    $(byText("Gender (optional)")).shouldBe(Condition.visible);
    //$(byName("websubmit")).click();
    sleep(5000);




    }
}

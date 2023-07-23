package guru.qa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class OpenPageTest {

    @Test
    public void testExample() {

        open("https://www.gismeteo.ru/");

        $(".subnav-menu").$(byText("2 недели")).click();

    }
}

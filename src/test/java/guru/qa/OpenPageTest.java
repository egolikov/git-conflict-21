package guru.qa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class OpenPageTest {

    @Test
    public void testExample() {

        open("https://www.gismeteo.ru/");

    }
}

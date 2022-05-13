package ua.lviv.iot.manager;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class RegExpressionTest {
    private RegExpression regex;


    @BeforeEach
    void setUp() {
        RegExpression reg = new RegExpression();
        reg.replaceGrade("");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void replaceGrade() {
        String actual = "Petriv SATISFACTORY, Antonov EXCELLENT, Vasylenko COMISSION";
        String expected = "Petriv SATISFACTORY, Antonov EXCELLENT, Vasylenko COMISSION";
        Assertions.assertEquals(expected, actual);

    }
}
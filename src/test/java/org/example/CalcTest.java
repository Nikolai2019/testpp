package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @BeforeAll
    public static void setUp() {
        System.out.println("before all");
    }

    @BeforeEach
    public void setUpEach() {
        System.out.println("before each");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("after all");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("after each");
    }

    @Test
    @DisplayName("01 Проверка суммирования")
    @Timeout(10)
    @Tag("summ")
    void summ1() {
        Calc calc = new Calc();
        int calcResult = calc.summ(1, 6);
        Assertions.assertEquals(7, calcResult, "Не тот ответ");
    }

    @Test
    @DisplayName("02 Проверка суммирования")
    @Timeout(10)
    void summ2() {
        Calc calc = new Calc();
        int calcResult = calc.summ(1, 6);
        Assertions.assertEquals(7, calcResult, "Не тот ответ");
    }

    @ParameterizedTest(name="#{index} - сложение{0} и {1}, ожидаем {2}")
    @DisplayName("03 Параметризованный тест суммы")
    @Tag("param")
    @CsvSource({"1, 2, 3", "-1, 2, 1", "0,0,0"})
    void summ3(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int calcResult = calc.summ(a, b);
        Assertions.assertEquals(expectedResult, calcResult, "Не тот ответ");
    }
}
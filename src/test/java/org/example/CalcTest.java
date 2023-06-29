package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


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
    @Tag("summ")
    void summ1() {
        Calc calc = new Calc();
        int calcResult = calc.summ(1, 6);
        Assertions.assertEquals(7, calcResult, "Не тот ответ");
    }

    @ParameterizedTest(name = "#{index} - сложение{0} и {1}, ожидаем {2}")
    @DisplayName("02 Параметризованный тест суммы")
    @Tag("summ")
    @CsvSource({"1, 2, 3", "-1, 2, 1", "0,0,0"})
    void summ3(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int calcResult = calc.summ(a, b);
        Assertions.assertEquals(expectedResult, calcResult, "Не тот ответ");
    }

    @Test
    @DisplayName("03 Проверка вычитания")
    @Tag("remove")
    void remove1() {
        Calc calc = new Calc();
        int calcResult = calc.remove(7, 2);
        Assertions.assertEquals(5, calcResult, "Не тот ответ");
    }

    @ParameterizedTest(name = "#{index} - разница {0} и {1}, ожидаем {2}")
    @DisplayName("04 Параметризованный тест вычитания")
    @Tag("remove")
    @CsvSource({"2, 1, 1", "-1, -1, 0", "0,0,0"})
    void remove2(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int calcResult = calc.remove(a, b);
        Assertions.assertEquals(expectedResult, calcResult, "Не тот ответ");
    }
}
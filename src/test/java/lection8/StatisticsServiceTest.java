package lection8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class StatisticsServiceTest {

    // Поиск максимального значения, когда максимальное значение в начале
    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    // Поиск максимального значения, когда максимальное значение не в начале.
    @Test
    void sameValues() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 33, 11, 11, 12};
        long expected = 33;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

}

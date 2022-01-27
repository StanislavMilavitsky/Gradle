package by.milavitsky.module1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class StringUtilsTest {

    @ParameterizedTest
    @ValueSource(strings = {"18", "20", "1", "12312"})
    public void testIsPositiveNumberPositive(String string) {
        boolean condition = StringUtils.isPositiveNumber(string);
        assertTrue(condition);
    }

    @ParameterizedTest
    @ValueSource(strings = {"0", "", "-10", "-1123"})
    public void testIsPositiveNumberNegative(String string) {
        boolean condition = StringUtils.isPositiveNumber(string);
        assertFalse(condition);
    }
}
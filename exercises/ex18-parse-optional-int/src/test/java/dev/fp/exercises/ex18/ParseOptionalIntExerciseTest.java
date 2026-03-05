package dev.fp.exercises.ex18;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParseOptionalIntExerciseTest {
    @ParameterizedTest
    @ValueSource(strings = {"42", "1", "999"})
    void parsesPositiveIntegers(String value) {
        assertThat(ParseOptionalIntExercise.parsePositive(value)).isPresent();
    }

    @ParameterizedTest
    @ValueSource(strings = {"0", "-2", "abc", "", "  3"})
    void returnsEmptyForInvalidValues(String value) {
        assertThat(ParseOptionalIntExercise.parsePositive(value)).isEmpty();
    }
}

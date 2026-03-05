package dev.fp.exercises.ex01;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class EvenSumExerciseTest {
    static List<TestCase> sumCases() {
        return List.of(
                new TestCase(List.of(1, 2, 3, 4, 5, 6), 12),
                new TestCase(List.of(1, 3, 5), 0),
                new TestCase(List.of(-4, -3, 2, 7), -2),
                new TestCase(List.of(), 0));
    }

    @ParameterizedTest
    @MethodSource("sumCases")
    void sumsOnlyEvenNumbers(TestCase testCase) {
        assertThat(EvenSumExercise.sumEven(testCase.input())).isEqualTo(testCase.expected());
    }

    record TestCase(List<Integer> input, int expected) {}
}

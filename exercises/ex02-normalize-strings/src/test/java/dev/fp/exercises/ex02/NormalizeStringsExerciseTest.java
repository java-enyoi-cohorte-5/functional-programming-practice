package dev.fp.exercises.ex02;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class NormalizeStringsExerciseTest {
    static List<TestCase> normalizeCases() {
        return List.of(
                new TestCase(List.of("  Hola ", "", " MUNDO "), List.of("hola", "mundo")),
                new TestCase(List.of(" B ", " a "), List.of("b", "a")),
                new TestCase(List.of("   ", "\t", "x"), List.of("x")));
    }

    @ParameterizedTest
    @MethodSource("normalizeCases")
    void normalizesAndRemovesBlankItems(TestCase testCase) {
        assertThat(NormalizeStringsExercise.normalize(testCase.input())).containsExactlyElementsOf(testCase.expected());
    }

    record TestCase(List<String> input, List<String> expected) {}
}

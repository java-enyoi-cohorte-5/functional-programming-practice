package dev.fp.exercises.ex06;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class StableDeduplicateExerciseTest {
    static List<TestCase> dedupeCases() {
        return List.of(
                new TestCase(List.of("a", "b", "a", "c", "b"), List.of("a", "b", "c")),
                new TestCase(List.of(), List.of()),
                new TestCase(List.of("x", "x", "x"), List.of("x")));
    }

    @ParameterizedTest
    @MethodSource("dedupeCases")
    void removesDuplicatesKeepingFirstOccurrence(TestCase testCase) {
        assertThat(StableDeduplicateExercise.deduplicate(testCase.input())).containsExactlyElementsOf(testCase.expected());
    }

    record TestCase(List<String> input, List<String> expected) {}
}

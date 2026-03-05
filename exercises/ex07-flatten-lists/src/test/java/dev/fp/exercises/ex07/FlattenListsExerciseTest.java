package dev.fp.exercises.ex07;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class FlattenListsExerciseTest {
    static List<TestCase> flattenCases() {
        return List.of(
                new TestCase(List.of(List.of(1, 2), List.of(), List.of(3)), List.of(1, 2, 3)),
                new TestCase(List.of(), List.of()),
                new TestCase(List.of(List.of(9), List.of(8, 7)), List.of(9, 8, 7)));
    }

    @ParameterizedTest
    @MethodSource("flattenCases")
    void flattensNestedLists(TestCase testCase) {
        assertThat(FlattenListsExercise.flatten(testCase.input())).containsExactlyElementsOf(testCase.expected());
    }

    record TestCase(List<List<Integer>> input, List<Integer> expected) {}
}

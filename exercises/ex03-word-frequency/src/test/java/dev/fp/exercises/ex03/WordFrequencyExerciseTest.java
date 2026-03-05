package dev.fp.exercises.ex03;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Map;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class WordFrequencyExerciseTest {
    static List<TestCase> frequencyCases() {
        return List.of(
                new TestCase("Java java FP fp fp", Map.of("java", 2L, "fp", 3L)),
                new TestCase("uno uno dos", Map.of("uno", 2L, "dos", 1L)),
                new TestCase("", Map.of()));
    }

    @ParameterizedTest
    @MethodSource("frequencyCases")
    void countsWordsIgnoringCase(TestCase testCase) {
        assertThat(WordFrequencyExercise.countWords(testCase.input())).isEqualTo(testCase.expected());
    }

    record TestCase(String input, Map<String, Long> expected) {}
}

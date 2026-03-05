package dev.fp.exercises.ex27;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class ImperativeToFunctionalExerciseTest {
    @Test
    void sumsLengthsAfterUppercaseTransformation() {
        assertThat(ImperativeToFunctionalExercise.totalLengthOfUppercase(List.of("a", "", "bc"))).isEqualTo(3);
    }

    @Test
    void ignoresWhitespaceOnlyItemsAfterTrim() {
        assertThat(ImperativeToFunctionalExercise.totalLengthOfUppercase(List.of(" ", "x"))).isEqualTo(1);
    }
}

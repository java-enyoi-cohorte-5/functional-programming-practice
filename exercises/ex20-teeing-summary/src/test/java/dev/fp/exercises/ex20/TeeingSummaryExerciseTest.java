package dev.fp.exercises.ex20;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class TeeingSummaryExerciseTest {
    @Test
    void calculatesMinAndMax() {
        assertThat(TeeingSummaryExercise.minMax(List.of(5, 2, 9))).isEqualTo(new TeeingSummaryExercise.MinMax(2, 9));
    }

    @Test
    void supportsNegativeNumbers() {
        assertThat(TeeingSummaryExercise.minMax(List.of(-7, -1, -9))).isEqualTo(new TeeingSummaryExercise.MinMax(-9, -1));
    }
}

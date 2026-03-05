package dev.fp.exercises.ex09;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class NumberStatsExerciseTest {
    @Test
    void computesSummaryStatistics() {
        var stats = NumberStatsExercise.statistics(List.of(2, 4, 6));
        assertThat(stats.getCount()).isEqualTo(3);
        assertThat(stats.getSum()).isEqualTo(12);
        assertThat(stats.getMin()).isEqualTo(2);
        assertThat(stats.getMax()).isEqualTo(6);
        assertThat(stats.getAverage()).isEqualTo(4.0);
    }

    @Test
    void handlesNegativeNumbers() {
        var stats = NumberStatsExercise.statistics(List.of(-10, -5));
        assertThat(stats.getMin()).isEqualTo(-10);
        assertThat(stats.getMax()).isEqualTo(-5);
    }
}

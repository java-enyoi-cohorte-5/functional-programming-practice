package dev.fp.exercises.ex15;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class TopNScoresExerciseTest {
    @Test
    void returnsTopNScores() {
        assertThat(TopNScoresExercise.topN(List.of(5, 20, 1, 9, 20), 3)).containsExactly(20, 20, 9);
    }

    @Test
    void returnsAllSortedWhenNExceedsSize() {
        assertThat(TopNScoresExercise.topN(List.of(3, 1), 10)).containsExactly(3, 1);
    }
}

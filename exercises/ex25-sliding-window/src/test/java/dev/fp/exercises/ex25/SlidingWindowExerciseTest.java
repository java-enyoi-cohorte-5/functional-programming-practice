package dev.fp.exercises.ex25;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class SlidingWindowExerciseTest {
    @Test
    void buildsSlidingWindows() {
        assertThat(SlidingWindowExercise.windows(List.of(1, 2, 3, 4), 2))
                .containsExactly(List.of(1, 2), List.of(2, 3), List.of(3, 4));
    }

    @Test
    void returnsEmptyWhenWindowLargerThanInput() {
        assertThat(SlidingWindowExercise.windows(List.of(1, 2), 3)).isEmpty();
    }
}

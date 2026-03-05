package dev.fp.exercises.ex23;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

class ParallelSafeSumExerciseTest {
    @Test
    void sumsLargeRangeCorrectly() {
        var numbers = IntStream.rangeClosed(1, 10_000).boxed().toList();
        assertThat(ParallelSafeSumExercise.parallelSum(numbers)).isEqualTo(50_005_000L);
    }

    @Test
    void emptyInputReturnsZero() {
        assertThat(ParallelSafeSumExercise.parallelSum(IntStream.range(0, 0).boxed().toList())).isZero();
    }
}

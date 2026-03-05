package dev.fp.exercises.ex08;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class PartitionNumbersExerciseTest {
    @Test
    void partitionsIntoEvenAndOdd() {
        var result = PartitionNumbersExercise.partitionByEven(List.of(1, 2, 3, 4));
        assertThat(result.get(true)).containsExactly(2, 4);
        assertThat(result.get(false)).containsExactly(1, 3);
    }

    @Test
    void returnsBothKeysForEmptyInput() {
        var result = PartitionNumbersExercise.partitionByEven(List.of());
        assertThat(result.get(true)).isEmpty();
        assertThat(result.get(false)).isEmpty();
    }
}

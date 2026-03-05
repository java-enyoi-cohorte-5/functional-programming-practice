package dev.fp.exercises.ex22;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class AssociativeReduceExerciseTest {
    @Test
    void multipliesAllElements() {
        assertThat(AssociativeReduceExercise.product(List.of(2, 3, 4))).isEqualTo(24);
    }

    @Test
    void emptyListReturnsIdentity() {
        assertThat(AssociativeReduceExercise.product(List.of())).isEqualTo(1);
    }

    @Test
    void handlesZero() {
        assertThat(AssociativeReduceExercise.product(List.of(5, 0, 3))).isZero();
    }
}

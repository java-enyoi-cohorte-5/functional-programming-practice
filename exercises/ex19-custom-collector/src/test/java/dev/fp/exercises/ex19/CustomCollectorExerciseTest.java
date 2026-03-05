package dev.fp.exercises.ex19;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class CustomCollectorExerciseTest {
    @Test
    void joinsUppercasedValues() {
        assertThat(CustomCollectorExercise.joinUppercase(List.of("a", "b", "c"))).isEqualTo("A|B|C");
    }

    @Test
    void returnsEmptyStringForEmptyInput() {
        assertThat(CustomCollectorExercise.joinUppercase(List.of())).isEmpty();
    }
}

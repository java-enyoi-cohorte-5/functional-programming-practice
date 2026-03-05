package dev.fp.exercises.ex11;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.List;
import org.junit.jupiter.api.Test;

class ImmutableTransformExerciseTest {
    @Test
    void transformsValuesWithoutChangingInput() {
        var input = List.of("a", "b");
        assertThat(ImmutableTransformExercise.addPrefix(input, "pre-")).containsExactly("pre-a", "pre-b");
        assertThat(input).containsExactly("a", "b");
    }

    @Test
    void returnsUnmodifiableResult() {
        var result = ImmutableTransformExercise.addPrefix(List.of("x"), "p-");
        assertThatThrownBy(() -> result.add("boom")).isInstanceOf(UnsupportedOperationException.class);
    }
}

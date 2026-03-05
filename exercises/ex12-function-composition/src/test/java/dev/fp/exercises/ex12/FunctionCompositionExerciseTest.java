package dev.fp.exercises.ex12;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.function.Function;
import org.junit.jupiter.api.Test;

class FunctionCompositionExerciseTest {
    @Test
    void composesFunctionsInCorrectOrder() {
        assertThat(FunctionCompositionExercise.compose(x -> x + 10, x -> x * 2, 5)).isEqualTo(20);
    }

    @Test
    void worksWithIdentityFunction() {
        Function<Integer, Integer> identity = Function.identity();
        assertThat(FunctionCompositionExercise.compose(identity, x -> x + 3, 7)).isEqualTo(10);
    }
}

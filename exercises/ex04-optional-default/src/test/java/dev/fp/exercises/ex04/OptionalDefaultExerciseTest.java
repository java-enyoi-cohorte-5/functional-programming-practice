package dev.fp.exercises.ex04;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import org.junit.jupiter.api.Test;

class OptionalDefaultExerciseTest {
    @Test
    void returnsContainedValueWithoutInvokingFallback() {
        var counter = new AtomicInteger(0);

        var result = OptionalDefaultExercise.getOrDefault(Optional.of("ok"), () -> {
            counter.incrementAndGet();
            return "fallback";
        });

        assertThat(result).isEqualTo("ok");
        assertThat(counter.get()).isZero();
    }

    @Test
    void usesFallbackWhenEmpty() {
        assertThat(OptionalDefaultExercise.getOrDefault(Optional.empty(), () -> "fallback")).isEqualTo("fallback");
    }
}

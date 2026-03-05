package dev.fp.exercises.ex17;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class LinesPipelineExerciseTest {
    @Test
    void cleansTextLines() {
        assertThat(LinesPipelineExercise.cleanLines(List.of("  Hola ", "", " Mundo  ")))
                .containsExactly("hola", "mundo");
    }

    @Test
    void removesWhitespaceOnlyLines() {
        assertThat(LinesPipelineExercise.cleanLines(List.of("   ", "\t", "X"))).containsExactly("x");
    }
}

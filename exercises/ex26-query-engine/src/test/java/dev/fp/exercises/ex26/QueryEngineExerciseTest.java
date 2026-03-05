package dev.fp.exercises.ex26;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class QueryEngineExerciseTest {
    @Test
    void filtersAndMapsInOrder() {
        var result = QueryEngineExercise.query(List.of("java", "fp", "stream"), s -> s.length() > 3, String::toUpperCase);
        assertThat(result).containsExactly("JAVA", "STREAM");
    }

    @Test
    void canReturnEmptyResult() {
        var result = QueryEngineExercise.query(List.of("a", "b"), s -> s.length() > 3, String::toUpperCase);
        assertThat(result).isEmpty();
    }
}

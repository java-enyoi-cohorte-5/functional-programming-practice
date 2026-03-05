package dev.fp.exercises.ex24;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class GroupingConcurrentExerciseTest {
    @Test
    void countsByFirstLetter() {
        var result = GroupingConcurrentExercise.countByFirstLetter(List.of("apple", "ant", "banana"));
        assertThat(result.get('a')).isEqualTo(2L);
        assertThat(result.get('b')).isEqualTo(1L);
    }

    @Test
    void normalizesUppercaseInitials() {
        var result = GroupingConcurrentExercise.countByFirstLetter(List.of("Apple", "Ant"));
        assertThat(result.get('a')).isEqualTo(2L);
    }
}

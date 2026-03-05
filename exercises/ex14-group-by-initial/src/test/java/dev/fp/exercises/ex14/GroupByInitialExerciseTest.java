package dev.fp.exercises.ex14;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class GroupByInitialExerciseTest {
    @Test
    void groupsByFirstCharacterLowercase() {
        var grouped = GroupByInitialExercise.group(List.of("Apple", "apricot", "Banana"));
        assertThat(grouped.get('a')).containsExactly("Apple", "apricot");
        assertThat(grouped.get('b')).containsExactly("Banana");
    }

    @Test
    void handlesSingleElement() {
        var grouped = GroupByInitialExercise.group(List.of("Zoo"));
        assertThat(grouped.get('z')).containsExactly("Zoo");
    }
}

package dev.fp.exercises.ex10;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class FindFirstMatchExerciseTest {
    @Test
    void findsFirstMatchingElement() {
        assertThat(FindFirstMatchExercise.findFirstLongerThan(List.of("a", "abcd", "abcdef"), 3)).contains("abcd");
    }

    @Test
    void returnsEmptyWhenNoMatch() {
        assertThat(FindFirstMatchExercise.findFirstLongerThan(List.of("a", "bb"), 3)).isEmpty();
    }

    @Test
    void preservesEncounterOrderForFirstMatch() {
        assertThat(FindFirstMatchExercise.findFirstLongerThan(List.of("aaaa", "bbbbbb"), 3)).contains("aaaa");
    }
}

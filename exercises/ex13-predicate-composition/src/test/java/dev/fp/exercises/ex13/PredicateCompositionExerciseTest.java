package dev.fp.exercises.ex13;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.function.Predicate;
import org.junit.jupiter.api.Test;

class PredicateCompositionExerciseTest {
    @Test
    void filtersUsingComposedPredicate() {
        Predicate<Integer> rule = ((Predicate<Integer>) n -> n > 2).and(n -> n % 2 == 0);
        assertThat(PredicateCompositionExercise.filter(List.of(1, 2, 3, 4, 5, 6), rule)).containsExactly(4, 6);
    }

    @Test
    void supportsNegateComposition() {
        Predicate<Integer> odd = ((Predicate<Integer>) n -> n % 2 == 0).negate();
        assertThat(PredicateCompositionExercise.filter(List.of(1, 2, 3, 4), odd)).containsExactly(1, 3);
    }
}

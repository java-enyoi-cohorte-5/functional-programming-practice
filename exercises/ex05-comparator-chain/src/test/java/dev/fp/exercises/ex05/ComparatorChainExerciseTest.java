package dev.fp.exercises.ex05;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class ComparatorChainExerciseTest {
    @Test
    void sortsByAgeThenName() {
        var input = List.of(
                new ComparatorChainExercise.Person("Zoe", 30),
                new ComparatorChainExercise.Person("Ana", 20),
                new ComparatorChainExercise.Person("Bob", 20));

        assertThat(ComparatorChainExercise.sortPeople(input)).containsExactly(
                new ComparatorChainExercise.Person("Ana", 20),
                new ComparatorChainExercise.Person("Bob", 20),
                new ComparatorChainExercise.Person("Zoe", 30));
    }

    @Test
    void doesNotMutateInputOrder() {
        var input = List.of(
                new ComparatorChainExercise.Person("Zoe", 30),
                new ComparatorChainExercise.Person("Ana", 20));

        ComparatorChainExercise.sortPeople(input);

        assertThat(input).containsExactly(
                new ComparatorChainExercise.Person("Zoe", 30),
                new ComparatorChainExercise.Person("Ana", 20));
    }
}

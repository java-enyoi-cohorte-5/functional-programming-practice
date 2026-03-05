package dev.fp.exercises.ex05;

import java.util.Comparator;
import java.util.List;

public final class ComparatorChainExercise {
    private ComparatorChainExercise() {}

    public record Person(String name, int age) {}

    /**
     * Enunciado: ordenar por edad y luego por nombre, sin mutar la lista de entrada.
     */
    public static List<Person> sortPeople(List<Person> people) {
        throw new UnsupportedOperationException("Implement me");
    }
}

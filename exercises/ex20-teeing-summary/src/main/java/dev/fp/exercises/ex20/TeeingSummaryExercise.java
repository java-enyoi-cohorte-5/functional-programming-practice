package dev.fp.exercises.ex20;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public final class TeeingSummaryExercise {
    private TeeingSummaryExercise() {}

    public record MinMax(int min, int max) {}

    /**
     * Enunciado: retornar min y max de la colección en un único recorrido lógico.
     */
    public static MinMax minMax(List<Integer> numbers) {
        throw new UnsupportedOperationException("Implement me");
    }
}

package dev.fp.exercises.ex16;

import java.util.List;
import java.util.Locale;

public final class RecordMappingExercise {
    private RecordMappingExercise() {}

    public record User(String name, String email) {}

    /**
     * Enunciado: extraer emails normalizados a minúscula desde lista de usuarios.
     */
    public static List<String> toEmails(List<User> users) {
        throw new UnsupportedOperationException("Implement me");
    }
}

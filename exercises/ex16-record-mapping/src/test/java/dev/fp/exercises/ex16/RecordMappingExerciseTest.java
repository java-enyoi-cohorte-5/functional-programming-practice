package dev.fp.exercises.ex16;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class RecordMappingExerciseTest {
    @Test
    void mapsUsersToLowercaseEmails() {
        var users = List.of(new RecordMappingExercise.User("Ana", "ANA@MAIL.COM"));
        assertThat(RecordMappingExercise.toEmails(users)).containsExactly("ana@mail.com");
    }

    @Test
    void preservesOrder() {
        var users = List.of(
                new RecordMappingExercise.User("B", "B@X.COM"),
                new RecordMappingExercise.User("A", "A@X.COM"));
        assertThat(RecordMappingExercise.toEmails(users)).containsExactly("b@x.com", "a@x.com");
    }
}

package dev.fp.exercises.ex21;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class MapMultiTagsExerciseTest {
    @Test
    void extractsTagsFromPosts() {
        assertThat(MapMultiTagsExercise.extractTags(List.of("hola #java #fp", "sin tags", "#clean")))
                .containsExactly("java", "fp", "clean");
    }

    @Test
    void ignoresHashWithoutContent() {
        assertThat(MapMultiTagsExercise.extractTags(List.of("#", "##", "#ok"))).containsExactly("ok");
    }
}

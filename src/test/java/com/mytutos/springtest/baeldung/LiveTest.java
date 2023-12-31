package com.mytutos.springtest.baeldung;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LiveTest {

    private final List<String> in = new ArrayList<>(Arrays.asList("Hello", "Yes", "No"));
    private final List<String> out = new ArrayList<>(Arrays.asList("Cześć", "Tak", "Nie"));

    @TestFactory
    Stream<DynamicTest> translateDynamicTestFromStream() {
        return in.stream()
                .map(word ->
                        DynamicTest.dynamicTest("Test Translate " + word, () -> {
                            int id = in.indexOf(word);
                            assertEquals(out.get(id), translate(word));
                        }));
    }

    private String translate(String word) {
        if ("Hello".equalsIgnoreCase(word)) {
            return "Cześć";
        } else if ("Yes".equalsIgnoreCase(word)) {
            return "Tak";
        } else if ("No".equalsIgnoreCase(word)) {
            return "Nie";
        }
        return "Error";
    }
}

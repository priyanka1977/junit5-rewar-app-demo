package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.*;
public class MoreLambdaTests {
    Function<List<String>, List<String>> allToUpperCase = null;
    @BeforeEach
    void init(){
        allToUpperCase =
                words -> words.stream()
                        .map(String::toUpperCase)
                        .collect(Collectors.toList());
    }

    @Test
    void testAllToUpperCase() {
        List<String> expected = Arrays.asList("JAVA8", "STREAMS");
        List<String> result = allToUpperCase.apply(Arrays.asList("java8", "streams"));
        assertEquals(expected, result);
    }
}

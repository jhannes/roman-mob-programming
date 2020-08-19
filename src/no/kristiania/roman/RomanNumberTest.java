package no.kristiania.roman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumberTest {
    @Test
    void shouldConvert1ToI() {
        assertEquals("I", toRoman(1));
    }

    private String toRoman(int i) {
        return null;
    }
}

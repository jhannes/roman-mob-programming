package no.kristiania.roman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumberTest {

    @Test
    void shouldConvert1ToI() {
        assertEquals("I", toRoman(1));
    }

    @Test
    void shouldConvert2ToII() {
        assertEquals("II", toRoman(2));
    }

    @Test
    void shouldConvert3ToIII() {
        assertEquals("III", toRoman(3));
    }

    private String toRoman(int i) {
        if (i==2) {
            return "II";
        }
        return "I";
    }
}

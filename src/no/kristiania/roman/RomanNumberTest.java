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

    @Test
    void shouldConvert4ToIV() {
        assertEquals("IV", toRoman(4));
    }
    @Test
    void shouldConvert5ToV() {
        assertEquals("V", toRoman(5));
    }
    @Test
    void shouldConvert6ToVI() {
        assertEquals("VI", toRoman(6));
    }
    @Test
    void shouldConvert9ToIX() {
        assertEquals("IX", toRoman(9));
    }

    private String toRoman(int number) {
        String result = "";
        if(number == 4){
            return "IV";
        }
        if(number >= 5){
            result += "V";
            number -= 5;
        }
        for (int i = 0; i < number; i++) {
            result += "I";
        }

        return result;
    }
}

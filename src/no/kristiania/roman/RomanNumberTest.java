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
    @Test
    void shouldConvert10ToX() {
        assertEquals("X", toRoman(10));
    }
    @Test
    void shouldConvert14ToXIV() {
        assertEquals("XIV", toRoman(14));
    }
    @Test
    void shouldConvert20ToXX() {
        assertEquals("XX", toRoman(20));
    }

    @Test
    void shouldConvert39ToXXXIX() {
        assertEquals("XXXIX", toRoman(39));
    }

    private String toRoman(int number) {
        String result = "";
        while(number >= 10){
            result += "X";
            number -= 10;
        }
        if(number >= 9){
            result += "IX";
            number -= 9;
        }
        if(number >= 5){
            result += "V";
            number -= 5;
        }
        if(number >= 4){
            result += "IV";
            number -= 4;
        }
        for (int i = 0; i < number; i++) {
            result += "I";
        }

        return result;
    }
}

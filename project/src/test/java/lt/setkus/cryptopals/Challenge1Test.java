package lt.setkus.cryptopals;

import org.junit.Test;

import static org.junit.Assert.*;

public class Challenge1Test {

    @Test
    public void shouldEncodeProvidedStringToBase64() throws Exception {
        assertEquals("AQ", Challenge1.encodeBase64("01"));
    }
}
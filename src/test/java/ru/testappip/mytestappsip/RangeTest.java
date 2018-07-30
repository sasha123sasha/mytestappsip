package ru.testappip.mytestappsip;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class RangeTest {

    @Test
    public void testRange() {

        Range range = new Range();
        String strOne = "192.168.0.1";
        String strTwo = "192.168.0.5";
        ArrayList<String> result = new ArrayList<>();
        result.add("192.168.0.2");
        result.add("192.168.0.3");
        result.add("192.168.0.4");
        assertEquals(result, range.Range(strOne, strTwo));
    }
}
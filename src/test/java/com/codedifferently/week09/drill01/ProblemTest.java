package com.codedifferently.week09.drill01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemTest {

    @Test
    public void numberToStringTest01(){
        Problem problem = new Problem();
        Integer[] input = new Integer[]{6};
        String[] expected = new String[]{"six"};
        String[] actual = problem.numberToString(input);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void numberToStringTest02(){
        Problem problem = new Problem();
        Integer[] input = new Integer[]{1,2,3,4};
        String[] expected = new String[]{"one", "two", "three", "four"};
        String[] actual = problem.numberToString(input);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void numberToStringTest03(){
        Problem problem = new Problem();
        Integer[] input = new Integer[]{0,9,8,2};
        String[] expected = new String[]{"zero", "nine", "eight", "two"};
        String[] actual = problem.numberToString(input);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void numberToStringTest04(){
        Problem problem = new Problem();
        Integer[] input = new Integer[]{1,1,9,9,8,4,3};
        String[] expected = new String[]{"one", "one", "nine", "nine", "eight", "four", "three"};
        String[] actual = problem.numberToString(input);
        Assertions.assertArrayEquals(expected, actual);
    }
}

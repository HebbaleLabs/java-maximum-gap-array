package com.talfinder.assessment;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MaximumGapTest {

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][] {
                {new int[] {1}, 0},
                {new int[] {3, 5}, 2},
                {new int[] {0, 3, 7}, 4},
                {new int[] {0, 3, 7, 9, 0}, 4},
                {new int[] {0, -1, 3, -2, 0}, 3},
                {new int[] {0, -1, -4, -2, -3}, 1},
                {new int[] {0, 3, -4, 5, -3, 10, 21}, 11},
                {new int[] {0, 0, 0, 0, 0, 0, 0}, 0},
                {new int[] {123, 536, 625, -234}, 413},
                {new int[] {4325, 234546, 345435234, 523534535, 23434243}, 322000991},
                {new int[] {-543, -3243423, -98878, -767676, -6555}, 2475747}
        });
    }

    int[] input;
    int expectedValue;

    public MaximumGapTest(int[] input, int expectedValue) {
        this.input = input;
        this.expectedValue = expectedValue;
    }

    @Test
    public void checkMaximumGap() {
        Assert.assertEquals("input:" + Arrays.toString(input) , expectedValue, MaximumGap.getMaximumGap(input));
    }
}

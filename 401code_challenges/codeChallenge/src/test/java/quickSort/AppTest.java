package quickSort;

import org.junit.Test;

import static org.junit.Assert.*;
import static quickSort.App.quicksort;

public class AppTest {

    @Test
    public void quicksortRegularArr() {

        int[] input = {45,2,13,24,8,17};
        quicksort(input,0,input.length-1);
        int[] expected={2,8,13,17,24,45};
        assertArrayEquals("should be sorted arr",expected,input);

    }

    @Test
    public void quicksortSameNumArr() {

        int[] input = {2,2,2};
        quicksort(input,0,input.length-1);
        int[] expected={2,2,2};
        assertArrayEquals("should be sorted arr",expected,input);

    }

    @Test
    public void quicksortEmptyArr() {

        int[] input = {};
        quicksort(input,0,input.length-1);
        int[] expected={};
        assertArrayEquals("should be empty arr",expected,input);

    }
}
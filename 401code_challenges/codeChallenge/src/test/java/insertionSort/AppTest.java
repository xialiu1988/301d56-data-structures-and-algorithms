package insertionSort;

import org.junit.Test;

import static insertionSort.App.insertionSort;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void emptyArr() {
        int[] arr = new int[]{};
        insertionSort(arr);
        assertEquals("empty arr",0,arr.length);
    }

    @Test
    public void regularArr() {
        int[] arr = {2,8,18,4};
        int[] expected={2,4,8,18};
        assertArrayEquals("sorted arr",expected,insertionSort(arr));
    }

    @Test
    public void sameValueArr() {
        int[] arr = {2,2,2};
        int[] expected={2,2,2};
        assertArrayEquals("sorted arr",expected,insertionSort(arr));
    }


}
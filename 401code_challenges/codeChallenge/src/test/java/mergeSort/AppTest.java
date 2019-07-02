package mergeSort;

import org.junit.Test;

import static mergeSort.App.mergeSort;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void mergeSortRegularArr() {
        int[] input={3,20,13};
        int[] res=mergeSort(input);
        int[] expected={3,13,20};
        assertArrayEquals("should be sorted array",expected,res);
    }


    @Test
    public void mergeSortSameNumArr() {
        int[] input={3,3,3};
        int[] res=mergeSort(input);
        int[] expected={3,3,3};
        assertArrayEquals("should be sorted array",expected,res);
    }
    @Test
    public void mergeSortNullArr() {
        int[] input={};
        int[] res=mergeSort(input);
        assertTrue("should be empty array",res.length==0);
    }
}
/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package binarySearch;

public class BinarySearch {
    public int binarySearch(int[] arr,int key)
    {
        //declare two indexes which are left and right
        int leftIndex=0;
        int rightIndedx =arr.length - 1;

        //keep leftindex on the left or the same position to the rightindex
        while (leftIndex <= rightIndedx)
        {
            //declare the middle point
            int middle = (leftIndex+ rightIndedx) / 2;
            //if the key is the same with the value at the middle point return middle index
            if (key == arr[middle])
            {
                return middle;
            }
            //if key is larger than the value of the middle point ,move the leftindex to the right one more index  to the middle point
            else if (key > arr[middle])
            {
                leftIndex = middle + 1;
            }
            //if key is smaller than the value of the middle point, move the rightindex to the left one more index to the middle point
            else
            {
                rightIndedx = middle - 1;
            }
        }

        //after while loop not found ,return -1
        return -1;
    }

}

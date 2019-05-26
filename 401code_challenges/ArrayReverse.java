import java.util.Arrays;

public class ArrayReverse {
  public static void main (String[] args) {
    // create the array to test your code on later
    int[] startArr = new int[] {1,2,3,4,5};
    //  int[] startArr = new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199};
    System.out .println("====Here is first solution====");
    // print it out, nicely
    System.out.println(Arrays.toString(startArr));
    // call your reverseArray method and save the result in a variable
    int[] endArr = reverseArray(startArr);
    // print out the result, nicely
    System.out.println(Arrays.toString(endArr));
    System.out .println("====Here is second solution====");
    //test for other solution here
    int[] startArr2 = new int[]{89, 2354, 3546, 23, 10, -923, 823, -12};
    System.out.println(Arrays.toString(startArr2));
    System.out.println(Arrays.toString(reverseArrayRecursion(startArr2)));
  }

  // the method you should write, to reverse an array
  public static int[] reverseArray(int[] inputArray) { 
//   your code goes here!
    int start = 0;
    int end = inputArray.length-1;
    int mid=(start+end)/2;

    while(start<=mid){
    //swap the start point value and end point value
    int temp ;
    temp = inputArray[start];
    inputArray[start] = inputArray[end];
    inputArray[end] = temp;
    start ++;
    end --;
    }
    return inputArray;
  }


 /* =========================== stretch goal -- recursion ================================*/

 public static int[] reverseArrayRecursion(int[] inputArray) { 
    int[] newarr =  helpler(inputArray, 0, inputArray.length-1);
     // for now, to make sure that it compiles, here is a answer
     return newarr;
   }


  public static int[] helpler(int[] inputArray,int start, int end){
      if(start<=((inputArray.length-1)/2)){
    int temp ;
    temp = inputArray[start];
    inputArray[start] = inputArray[end];
    inputArray[end] = temp;
    return helpler(inputArray, (start+1),(end-1));
      }
      return inputArray;
  }
    
}

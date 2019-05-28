import java.util.*;
public class arrayShift{

    public static void main(String[] args){

        int[] array = { 2, 4, 6, 8 };
        //int[] array = { 4, 8, 15, 28,42 };
        System.out.print("[");
        for (int i = 0; i < array.length-1; i++)
        {
            System.out.print(array[i]+",");
        }
        System.out.print(array[array.length-1]);
        System.out.println("]");

        int val = 45;
        //call Arrayshift function and return a new array
        int[] newarray = ArrayShift(array, val);

        //go through the new array and print every item on the screen
        System.out.print("[");
        for(int i = 0; i < newarray.length-1; i++)
        {
            System.out.print(newarray[i]+",");
        }
        System.out.print(newarray[newarray.length - 1]);
        System.out.print("]");

    }

    public  static int[] ArrayShift(int[] array, int val){


        int[] newArray = new int[array.length + 1];
        int middlePointindex = 0;

        if(array.length % 2 == 0)
        {
             middlePointindex = array.length/ 2;

        }
        else
        {
           middlePointindex = (array.length+1)/ 2;

        }

        for(int i = 0; i < newArray.length; i++)
        {
            if (i < middlePointindex)
            {
                newArray[i] = array[i];
            }
            else if(i == middlePointindex)
            {
                newArray[i] = val;
            }
            else
            {
                newArray[i] = array[i - 1];
            }


        }
        return newArray;

}


}
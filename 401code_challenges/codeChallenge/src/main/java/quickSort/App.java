package quickSort;

public class App {
    public static void main(String[] args){
//        todo quicksort will resubmit later
        int[] input = {45,2,13,24,8,17};
        for(int a:input){
            System.out.println(a);
        }
        System.out.println("=====================");
     quicksort(input,0,input.length-1);
        for(int a :input){
            System.out.println(a);
        }
    }



    public static void quicksort(int[] arr,int left,int right){
        if(left>right) return ;
        else {
            int partition = sortit(arr, left, right);
            quicksort(arr, left, partition - 1);
            quicksort(arr, partition+1, right);
        }
    }

    public static int sortit(int[] arr,int left,int right){


        int pivot= arr[right];


        while(left<right){

            while(left<right&&arr[left]<=pivot)
            { left++;}
            if(left<right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                right--;

            }while (left<right && arr[right]>=pivot)
            { right--;}
            if(left<right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
            }

        }

return right;


    }



}

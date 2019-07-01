package insertionSort;

public class App {


    public static void main(String[] args){

        int[] arr = {3,18,4,2,9};
        for(int a:arr){
            System.out.println(a);
        }
        System.out.println("============================");
       int[] res=insertionSort(arr);
       for(int a:res){
           System.out.println(a);
       }
    }


   public static int[] insertionSort(int[] arr){

        for(int i=1;i<arr.length;i++){

               if(arr[i-1]>arr[i]){

                   int temp=arr[i];
                   int j=i;

                   while(j>0&&arr[j-1]>temp){
                       arr[j]=arr[j-1];
                       j--;
                   }
                 arr[j]=temp;
               }

        }


        return arr;
   }



}

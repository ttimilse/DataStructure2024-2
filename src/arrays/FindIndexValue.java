package arrays;

import java.util.OptionalInt;

public class FindIndexValue {
    public static OptionalInt findIndex(int[] arr, int t){
        if(arr == null){
            return OptionalInt.empty();
        }
         for(int i = 0;i<arr.length;i++){
             if(arr[i] == t){
                 return OptionalInt.of(i);
             }else{
                 i = i+1;
             }
        }
         return OptionalInt.empty();

    }
    public static boolean contains(int arr[], int item){
        for(int n: arr){
            if(item == n){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {61,12,30,84,15,16,27,8};
        findIndex(arr,30).ifPresent(index -> System.out.println("Index position of 30: "+ index));

        System.out.println(contains(arr,15));
        System.out.println(contains(arr,95));
    }
}

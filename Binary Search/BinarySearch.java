import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int arr[] = new int[7];
        for(int i = 0 ; i <arr.length; i++){
            arr[i] = in.nextInt();
        }

        for(int i = 0 ; i <arr.length; i++){
            System.out.print(arr[i]);
        }

        int result = BinarySearch(arr, 22);
        System.out.println(result);
    }
        static int BinarySearch(int[] arr , int target) {
            int start = 0;
            int end = arr.length -1;
            while(start <= end){
                int mid = start + (end-start)/2;
                if(target< arr[mid]) {
                    end = mid-1;

                }
                else if(target>arr[mid]){
                    start = mid+1;
                }
                else{
                    return mid;
                }
            }
            return -1;
        }
    
}
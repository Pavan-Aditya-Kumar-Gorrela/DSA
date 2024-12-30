import java.util.Scanner;
import java.util.Arrays;

public class LinearSearch {

public static void main(String[] args) {
    


    Scanner in = new Scanner(System.in);
    int list1[] = new int[5];

    for(int i = 0 ; i <list1.length; i++){
        list1[i] = in.nextInt();
    }

    for(int i = 0 ; i <list1.length; i++){
        System.out.print(Arrays.toString(list1));
    }

    int result = Linearsearch(list1, 22);
    System.out.println(result);


}

    static int Linearsearch(int[] arr , int target) {
        if (arr.length == -1) {
            return -1;
        }
        for(int i = 0 ; i < arr.length; i++) {
            int element = arr[i];
            if(element == target) {
                return i;
            }
        }
        return -1;
    }
}

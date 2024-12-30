import java.util.Arrays;

public class LinearSearch2D {
    public static void main(String[] args) {
        int[][] arr_2D = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9, 10}
        };
        int target = 5;
        int[] result = search_2D(arr_2D, target);
        System.out.println(Arrays.toString(result)); 
    }

    static int[] search_2D(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] {row, col};
                }
            }
        }
        return new int[] {-1, -1}; 
    }
}

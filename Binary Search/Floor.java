public class Floor {
    public static void main(String[] args) {
        int[] arr = {9, 8, 6, 5, 4, 3, 2, 1};
        int target = 7;
        int res = findFloor(arr, target);
        if (res != -1) {
            System.out.println("Floor of " + target + " is: " + arr[res]);
        } else {
            System.out.println("No floor found for " + target);
        }
    }

    static int findFloor(int[] arr, int target) {
        int start = 0;
        int last = arr.length - 1;

        boolean isAscending = arr[start] < arr[last];
        int result = -1;

        while (start <= last) {
            int mid = start + (last - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAscending) { 
                if (arr[mid] <= target) {
                    result = mid; 
                    start = mid+1;
                } else {
                    last = mid - 1; 
                }
            } else { 
                if (arr[mid] <= target) {
                    result = mid; 
                    last = mid - 1;  
                } else {
                    start = mid+1;
                }
            }
        }

        return result; 
    }
}

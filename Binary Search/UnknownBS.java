public class UnknownBS {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        int res = bs(arr, 7);
        System.out.println("Found at: " + res);
    }

    static int bs(int[] arr, int target) {
        int start = 0;
        int last = arr.length - 1;

        
        boolean isOrd = arr[start] < arr[last];

        while (start <= last) {
            int mid = start + (last - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isOrd) {
                if (arr[mid] < target) {
                    start = mid + 1; 
                } else {
                    last = mid - 1; 
                }
            } else { 
                if (arr[mid] > target) {
                    start = mid + 1; 
                } else {
                    last = mid - 1; 
                }
            }
        }

        return -1; 
    }
}

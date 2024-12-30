
public class RotationCount {
    public static void main(String[] args){
        int[] arr = {4,5,6,7,0,1,2};
        int res = findCount(arr);
        System.out.print(res);
    }
    static int findCount(int[] nums) {
        int pivot = findpivot(nums);

      
        if (pivot == -1) {
            return -1;
        }
         else {
            return pivot;
        }
    }

    
    static int findpivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid + 1;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid;
            }

            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1; 
    }

   
}

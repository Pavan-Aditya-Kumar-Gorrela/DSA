public class InfiniteArray{
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,11,12,13,14,15,16,17,18,19,20};
        int res = ans(arr , 15);
        System.out.println(res);
    }
    static int ans(int[] arr , int target){
        int start = 0;
        int end = 1;

        while(target > arr[end]) {
            int temp = end+1;

            end  = end + (end-start+1)*2;
            start = temp;
        }

        return BS(arr , start , end , target);
    }
    static int BS(int[] arr , int start , int end,int target){
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
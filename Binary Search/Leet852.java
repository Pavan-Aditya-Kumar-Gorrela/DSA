//https://leetcode.com/problems/peak-index-in-a-mountain-array/
//https://leetcode.com/problems/find-peak-element/submissions/1486421703/
//https://leetcode.com/problems/find-in-mountain-array/submissions/1486441871/
public class Leet852{
    public static void main(String[] args){
        int[] arr = {0,1,2,3,4,5,6,5,4,3,2};
        int res = BS(arr);
        System.out.print(res);
    }
    static int BS(int[] arr ){
        int start = 0;
        int end = arr.length-1;
        
         while(start < end){
            int mid = start + (end-start)/2;
                if(arr[mid]>arr[mid+1]) {
                    end = mid;

                }
                else{
                    start = mid+1;
                }
                
            }
            return start;
    }
    }



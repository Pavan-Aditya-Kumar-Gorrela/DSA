public class EvenDigits {
    //https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
    public static void main(String[] args) {
        int[] nums ={12,345,2,6,7896};
        int result = findNumber(nums);
        System.out.println(result);


    }


    static int findNumber(int[] arr) {
        
        int count = 0;
        for(int i : arr){
            if(even(i)){
                count++;
            }
        }

        return count;
    }
    static boolean  even(int num) {
        int noOfDigits = digits(num);
        
        return noOfDigits%2 == 0;
    }

    static int digits(int num) {
        int count = 0;
        while(num >0) {
            count++;
            num = num/10;
        }
        return  count;
        

    }
}

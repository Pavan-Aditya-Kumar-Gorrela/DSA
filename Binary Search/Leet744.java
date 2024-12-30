//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class Leet744{

    public static void main(String[] args){
        char[] letters = {'x','x','y','y'};
        char target = 'z';
        char res = nextGreatestLetter(letters , target);
        System.out.println(res);

    }

    static char nextGreatestLetter(char[] letters, char target) {


            int start = 0;
            int last = letters.length - 1;

            while (start <= last) {
                int mid = start + (last - start) / 2;

                if (target <letters[mid] ) {
                    last = mid-1;
                }
                else{
                    start = mid + 1;
                }
            }


            return letters[start % letters.length]; 
        }

}

public class SearchinStrings {
    public static void main(String[] args) {
        
        String name = "Aditya";
        char target = 'd';
        boolean result = Searchstr(name , target);
        System.out.print(result);

    }

    static boolean  Searchstr(String str , char ch) {
        if(str.length() == 0) {
            return false;
        }

        for(char index: str.toCharArray()) {
            if(index == ch){
                return true;
            }
        }
        return false;


    }
}

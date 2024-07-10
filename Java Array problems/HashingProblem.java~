import java.util.Arrays;

public class HashingProblem {
    public static void main(String[] args) {
        char[] str ={'a', 'p', 'p', 'l', 'e'};
        char ch = firstRepeatedChar(str);
        System.out.println(ch);
        
    }
    
    public static char firstRepeatedChar (char[] str){
        int[] count = new int[256];
        // to fill the array with only zero then this is the one way
        for(int i = 0 ; i < 256 ; i++){
            count[i] = 0;
        }
        // to fill the array with  only zero then this is the second way
        // Arrays.fill(count, 0);
        for(int i = 0 ; i < str.length ; i++){
            if(count[str[i]] == 1){
                System.out.println(str[i]);
                break;
            }else count[str[i]]++;

        }
        return 0;
    }
}

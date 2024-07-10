import java.util.Arrays;

class LongestCnsecno2{
    public static void main(String[] args) {
        int[] nums = {100,1,3,2,1,4,5,3,21,3,1,2,3,12,1};
        int ans = longestConsectiveNumber(nums);
        System.out.println(ans);
    }

    public static int longestConsectiveNumber(int[] nums){
        int n = nums.length, longest = 1;
        Arrays.sort(nums);
        int lastSmallNumber = nums[0];
        int count = 1;
        for(int i = 1 ; i < n ; i++){
            if(nums[i]-1 == lastSmallNumber){
                lastSmallNumber = nums[i];
                count++;
            }else if(nums[i] == lastSmallNumber){
                continue;
            }else{ 
                lastSmallNumber = nums[i];
                count = 1;
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
}
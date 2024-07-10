class LongestCnsecno {
    public static void main(String[] args) {
        int[] nums = {100, 1001, 1 , 3 ,199, 102, 2, 4};
        int n = longestConsectiveNumber(nums);
        System.out.println(n);
    }

    public static int  longestConsectiveNumber(int[] nums){
        int n = nums.length, longest = 0;
        for(int i = 0 ; i < n ; i++){
            int x = nums[i];
            int count = 0;
            while(linearSearch(nums, x+1) == true){
                count++;
                x++;
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }

    public static boolean linearSearch(int[] nums,int ele){
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == ele){
                return true;
            }
        }
        return false;
    }
}
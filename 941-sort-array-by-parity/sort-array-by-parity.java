import java.util.Arrays;

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        return Arrays.stream(nums)
                .boxed() 
                .sorted((a, b) -> {
                  
                    if (a % 2 == b % 2) return a - b; 
                    else if (a % 2 == 0) return -1; 
                    else return 1; 
                })
                .mapToInt(i -> i) 
                .toArray(); 
    }
}

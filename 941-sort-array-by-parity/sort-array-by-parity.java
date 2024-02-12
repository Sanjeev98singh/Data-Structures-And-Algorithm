import java.util.Arrays;

class Solution {
    public int[] sortArrayByParity(int[] nums) {
            int[] arr=new int[nums.length];
            int evenindex=0;
            int oddindex=nums.length-1;
            for(int i =0 ;i<nums.length;i++){
                if(nums[i]%2==0){
                    arr[evenindex]=nums[i];
                    evenindex++;
                }else{
                    arr[oddindex]=nums[i];
                    oddindex--;
                }
            }
        return arr;
    }
}

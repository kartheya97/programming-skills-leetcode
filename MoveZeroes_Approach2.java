package org.programmingskills_leetcode;

public class MoveZeroes_Approach2 {

    public void moveZeroes(int[] nums) {

        //Time Complexity : O(N) and Space Complexity : O(1)
        int start = 0;
        for(int i  = 0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp    = nums[start];
                nums[start] = nums[i];
                nums[i]     = temp;
                start++;
            }
        }

    }

}

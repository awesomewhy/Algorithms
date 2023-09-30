package Algorithms;


public class Algorithms1 {

    public static void main(String[] args) {
        int[] y = {-1, 2, 1, -4};
        int target = qwe(y, 2);
        System.out.println("Target: " + target);
    }

    public static int qwe(int[] nums, int target) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = recurs(nums,i,i+1,i+2,0);
            result = Math.max(result,sum);
        }
        return result;
    }
    public static int recurs(int[] nums, int i, int j, int k, int sum) {
        if(i >= nums.length || j >= nums.length || k >= nums.length)
        {
            return sum;
        }
        sum = nums[i] + nums[j] + nums[k];
        recurs(nums, i + 1,j + 1, k + 1, sum);
        return sum;
    }



}
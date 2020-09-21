package doit_Algorithm.sector2;

public class MaxValue {
    public static void main(String[] args) {
        int[] nums = new int[]{2,-1,3};

        int max = nums[0];

        for (int i=1; i<nums.length; i++){
            if (nums[i] > max)
                max = nums[i];
        }
        System.out.println("최댓값은 : " + max);
    }
}

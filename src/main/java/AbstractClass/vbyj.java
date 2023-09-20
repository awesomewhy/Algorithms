package AbstractClass;

public class vbyj {
    public static void main(String[] args) {
        int[] y = {1,2,6};
        boolean f = firstLast6(y);
        System.out.println(f);
    }
    public static boolean firstLast6(int[] nums) {

        if(nums[0] == 6 || nums[nums.length - 1] == 6){
            return true;
        }
        return false;
    }
}


public class canBalance {
    public static boolean canBalance(int[] nums){
        int lsum=0,rsum=0;
        for (int i = 0; i < nums.length; i++) {
            lsum += nums[i];
            rsum=0;
            for(int j = nums.length-1;j>i;j--){
                rsum += nums[j];
            }
            if(lsum==rsum){
                return true;
            }
        }
        return false;
    }
}

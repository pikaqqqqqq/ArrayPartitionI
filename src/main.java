import java.util.Arrays;

/**
 * Created by think on 2017/12/28.
 */
public class main {


    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int sum = 0;

        Arrays.sort(nums);

        for(int i=0; i<nums.length; i+=2)
            sum += nums[i];

        return sum;
    }
}

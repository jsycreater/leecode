public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result={0,0};
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(target==(nums[i]+nums[j])){
                    result[0]=i;
                    result[1]=j;
                    break;
                }
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int result[];
        result=twoSum(nums,target);
        System.out.print(result[0]+" "+result[1]);
    }
}

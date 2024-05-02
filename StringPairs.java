public class StringPairs {
    public static int numOfPairs(String[] nums, String target) {
        int out = 0;

        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                String s = nums[i]+nums[j];
                if(s.equals(target)){
                    out++;
                }
            }
        }
        return out;
    }

    public static void main(String[] args) {
        String[] nums = {"777","7","77","77"};
        System.out.println(numOfPairs(nums,"7777"));
    }
}

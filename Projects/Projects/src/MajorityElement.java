public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2, 2, 6, 3, 6, 2, 1, 2, 2, 2};
        System.out.println(findMajority(nums));
    }

    static int findMajority(int[] nums) {
        int majority = nums[0];
        int count = 1;
        for (int n : nums) {
            if (n == majority) {
                count++;
            } else {
                if (count == 0) {
                    majority = n;
                } else {
                    count--;
                }
            }
        }

        return majority;
    }
}

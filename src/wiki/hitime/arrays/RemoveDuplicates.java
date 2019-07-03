package wiki.hitime.arrays;

/**
 * @author zhangdaoping
 * @create 2019-07-03 14:23
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
//        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
//        int[] nums = new int[]{1, 1, 2};
        int[] nums = new int[]{-3, -1, 0, 0, 0, 3, 3};
        int length = removeDuplicates(nums);
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + ", ");
        }
        // 0, 0, 1, 1, 1, 2, 2, 3, 3, 4
        // ^  -

        // 0, 0, 1, 1, 1, 2, 2, 3, 3, 4
        // ^     -

        // 0, 1, 1, 1, 1, 2, 2, 3, 3, 4
        //    ^     -

        // 0, 1, 1, 1, 1, 2, 2, 3, 3, 4
        //    ^     -

        // 0, 1, 1, 1, 1, 2, 2, 3, 3, 4
        //    ^        -

        // 0, 1, 2, 1, 1, 2, 2, 3, 3, 4
        //       ^        -

        // 0, 1, 2, 1, 1, 2, 2, 3, 3, 4
        //       ^           -

        // 0, 1, 2, 1, 1, 2, 2, 3, 3, 4
        //       ^              -

        // 0, 1, 2, 3, 1, 2, 2, 3, 3, 4
        //          ^           -

        // 0, 1, 2, 3, 1, 2, 2, 3, 3, 4
        //          ^              -

        // 0, 1, 2, 3, 4, 2, 2, 3, 3, 4
        //             ^                -


        // 1, 1, 2, 2
        // ^  -

        // 1, 1, 2, 2
        // ^     -

        // 1, 2, 2, 2
        //    ^     -

        // 1, 2, 2, 2
        //    ^       -


        // 1, 2, 3, 4
        // ^  -

        // 1, 2, 3, 4
        //    ^  -

        // 1, 2, 3, 4
        //       ^  -

        // 1, 2, 3, 4
        //          ^  -


        // 1, 1, 2
        // ^  -

        // 1, 1, 2
        // ^     -

        // 1, 2, 1
        //    ^     -


        // 1, 1, 1
        // ^  -

        // 1, 1, 1
        // ^     -

        // 1, 1, 1
        // ^       -
    }

    private static int removeDuplicates(int[] nums) {
        int index = 0;
        int floatIndex = 1;
        while (floatIndex < nums.length) {
            if (nums[index] != nums[floatIndex]) {
                index++;
                nums[index] = nums[floatIndex];
            }
            floatIndex++;
        }
        return index + 1;
    }

}

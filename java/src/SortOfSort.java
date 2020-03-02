public class SortOfSort {
    public static void sortOfSort(int[] nums) {
        int greatestNum = 0;
        int k = 0;
        for (int i = 0; i < nums.length - k ; i++) {
            if (i + 1 < nums.length) {
                if (nums[i] > nums[i + 1]) {
                    greatestNum = nums[i];
                    nums[nums.length - 1] = greatestNum;
                }
            }
        }
    }
}



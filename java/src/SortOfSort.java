public class SortOfSort {
    public static void sortOfSort(int[] nums) {
        int max = 0;
        int k = 0;
        int temp;
        for (int i = 0; i < nums.length - k; i++) {
                if (i + 1 < nums.length) {
                    if (nums[i] > nums[i + 1]) {
                        temp = nums[i + 1];
                        nums[i + 1] = nums[i];
                        nums[i] = temp;
                        k++;
                    } else if (nums[i + 1] > nums[i+2] && nums[i+2] < nums.length) {
                        temp = nums[i + 2];
                        nums[i + 2] = nums[i+1];
                        nums[i+1] = temp;
                        k++;


                    }
                }
            }
        }
    }



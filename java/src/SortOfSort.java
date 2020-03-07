public class SortOfSort {
    public void sortOfSort(int[] nums) {

        int runTimes = 0; //The runTimes counts the times the method has
                          // passed to decide where the number will be sorted
        int start = 0; // The start integer increases every time a number is sorted in the front of the array so it wont keep sorting
                       // that same number.
        int end = nums.length - 1; // The end integer decreases every time a number has
                                   // been sorted at the end of the array so it doesnt sort that number again.

        while (start != end) {
            int maxIndex= maxIndex(nums,start, end );

            //This if statement makes the integers switch from being sorted in the back,
            //to being sorted int the front.
            //*Ivan Arenivas helped me understand how to make the sorting
            // go from the back to the front by using modulus.
            if (runTimes % 4 < 2) {
                int temp = nums[end]; //The following few lanes switch the integers to their right position.
                nums[end] = nums[maxIndex];
                nums[maxIndex] = temp;
                end--;
                runTimes++;
            }
            else {
                int temp = nums[start];
                nums[start] = nums[maxIndex];
                nums[maxIndex] = temp;
                start++;
                runTimes++;
            }
        }
        //This for loop prints the final sorted array.
        //This is just for me to see how the array resulted
        for (int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    //Helper method that finds the index of the largest number
    //in the unsorted part of the array.
    //I made a helper method because when I included this in the sortOfSort,
    // it kept only running for certain integers and this made it cleaner and easier to understand.
    public int maxIndex(int[] nums, int start, int end) {
        int maxIndex = start;
        for (int i = start; i <= end; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}



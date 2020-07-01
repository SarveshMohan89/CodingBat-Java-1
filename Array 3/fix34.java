public int[] fix34(int[] nums) {
for (int i=0; i<nums.length-1; i++) {
if (nums[i] == 3 && nums[i+1] != 4) {
swapWithFour(nums, i+1);
}
}
return nums;
}

private void swapWithFour(int[] nums, int n) {
int swapIndex = -1;
if (nums[0] == 4) swapIndex = 4;

for (int i=1; i<nums.length; i++) {
if (nums[i-1] != 3 && nums[i] == 4) {
swapIndex = i;
break;
}
}

nums[swapIndex] = nums[n];
nums[n] = 4;
}

//Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is immediately followed by a 4. Do not move the 3's, but every other number may move. The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.

//fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
//fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
//fix34([3, 2, 2, 4]) → [3, 4, 2, 2]

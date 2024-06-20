package o_mysin.Easy
// 1. Two Sum
/***
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 104
-109 <= nums[]i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 ***/

fun main() {
    val nums: IntArray = intArrayOf(2, 7, 11, 15)
    val target = 9
    val s = Solution::twoSum.invoke(Solution(), nums, target)

    println(s[0])
}

private class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        //HashMap Key = value; Value = Index
        val solversHashMap: HashMap<Int, Int> = hashMapOf()

        //x + y
        nums.forEachIndexed { index, valueY ->
            val valueX = target - valueY
            if (solversHashMap.contains(valueX)) {
                return solversHashMap[valueX]?.let { intArrayOf(it, index) } ?: intArrayOf(0, 0)
            } else {
                solversHashMap[valueY] = index
            }
        }
        return intArrayOf(0, 0)
    }
}
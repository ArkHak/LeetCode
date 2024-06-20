package Easy

// 9. Palindrome Number
/***
 * Given an integer x, return true if x is a
 * palindrome
 * , and false otherwise.
 *
 *
 *
 * Example 1:
 *
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * Example 2:
 *
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 *
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 *
 *
 * Constraints:
 *
 * -231 <= x <= 231 - 1
 *
 */
fun main() {
    val x = 1000110001
    val test = Solution::isPalindrome.invoke(Solution(), x)

    println(test)
}

private class Solution {
    fun isPalindrome(x: Int): Boolean {
        if ((x < 0) || (x != 0 && x % 10 == 0)) return false
        var workX = x
        var half = 0

        while (workX > half) {
            half = (half * 10) + (workX % 10)
            workX /= 10
        }

        return workX == half || workX == half / 10
    }
}
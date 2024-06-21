package Easy

// 14. Longest Common Prefix

/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.


Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
 */

fun main() {
    val strs = arrayOf("flower", "flow", "flight")
    val test = Solution14::longestCommonPrefix.invoke(Solution14(), strs)

    println(test)
}

class Solution14 {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""

        var prefix = ""
        val base = strs[0]
        var flag: Boolean

        base.forEachIndexed { index, char ->
            flag = true
            for (world in strs) {
                try {
                    if (world[index] != char) {
                        flag = false
                        break
                    }
                } catch (E: IndexOutOfBoundsException) {
                    flag = false
                }
            }
            if (flag) prefix += char else return prefix
        }

        return prefix
    }
}
package Easy

import java.util.*

/***
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 *
 *
 * Example 1:
 *
 * Input: s = "()"
 * Output: true
 * Example 2:
 *
 * Input: s = "()[]{}"
 * Output: true
 * Example 3:
 *
 * Input: s = "(]"
 * Output: false
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 */

fun main() {
    val test = "]]"
    val result = Solution20::isValid.invoke(Solution20(), test)
    println(result)
}

private class Solution20 {
    fun isValid(s: String): Boolean {
        val hashMap = hashMapOf(
            ')' to '(',
            ']' to '[',
            '}' to '{',
        )

        val stackSymbol: Stack<Char> = Stack()

        s.forEach { symbol ->

            if (hashMap.contains(symbol)) {

                try {

                    if (stackSymbol.isNotEmpty() and (stackSymbol.pop() == hashMap[symbol])) {
                        return@forEach
                    } else {
                        return false
                    }
                } catch (_: EmptyStackException) {
                    return false
                }
            } else {
                stackSymbol.push(symbol)
            }

        }

        return stackSymbol.empty()
    }
}
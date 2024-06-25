package Easy

// 21. Merge Two Sorted Lists

/***
 * You are given the heads of two sorted linked lists list1 and list2.
 *
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 *
 * Return the head of the merged linked list.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 * Example 2:
 *
 * Input: list1 = [], list2 = []
 * Output: []
 * Example 3:
 *
 * Input: list1 = [], list2 = [0]
 * Output: [0]
 *
 *
 * Constraints:
 *
 * The number of nodes in both lists is in the range [0, 50].
 * -100 <= Node.val <= 100
 * Both list1 and list2 are sorted in non-decreasing order.
 */

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

fun main() {

}

class Solution21 {
    //    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
//        if (list1 != null && list2 != null) {
//            if (list1.`val` < list2.`val`) {
//                list1.next = mergeTwoLists(list1.next, list2)
//                return list1
//            } else {
//                list2.next = mergeTwoLists(list1, list2.next)
//                return list2
//            }
//        }
//
//        if (list1 != null) {
//            return list1
//        }
//        return list2
//    }
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null) return list2
        if (list2 == null) return list1


        var root: ListNode? = ListNode(0)
        var next1: ListNode? = list1
        var next2: ListNode? = list2
        var node = root
        while (next1 != null && next2 != null) {
            if (next1.`val` < next2.`val`) {
                node?.next = next1
                next1 = next1.next
            } else {
                node?.next = next2
                next2 = next2.next
            }
            node = node?.next
        }
        if (next1 != null) {
            node?.next = next1
            node = node?.next
        }
        if (next2 != null) {
            node?.next = next2
        }
        return root?.next
    }
}


class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

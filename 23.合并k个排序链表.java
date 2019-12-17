import javafx.scene.Node;

/*
 * @lc app=leetcode.cn id=23 lang=java
 *
 * [23] 合并K个排序链表
 */

// @lc code=start

// Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        if (lists == null || lists.length == 0) {
            return null;
        }

        ListNode head = new ListNode(0);
        ListNode current = head;
        while (true) {
            int minIndex = -1;
            for (int i = 0; i < lists.length; i++) {
                ListNode node = lists[i];
                if (node == null) {
                    continue;
                }
                if (minIndex == -1 || node.val <= lists[minIndex].val) {
                    minIndex = i;

                }
            }
            if (minIndex == -1) {
                break;
            }
            current = current.next = lists[minIndex];
            lists[minIndex] = lists[minIndex].next;
        }

        return head.next;

    }
}
// @lc code=end

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
            lists[minIndex] = lists[minIndex].next;
        }

        return head.next;

    }

    public ListNode mergeKLists1(ListNode[] lists) {
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

            current.next = lists[minIndex];
            current = lists[minIndex];
            lists[minIndex] = lists[minIndex].next;

        }
        return head.next;
    }

    public ListNode mergeKLists2(ListNode[] lists) {
        if (lists == null) {
            return null;
        }

        return _merge(0, lists.length - 1, lists);

    }

    private ListNode _merge(int left, int right, ListNode[] lists) {
        if (left == right) {
            return lists[left];
        }

        int mid = (left + right) / 2;
        ListNode n1 = _merge(left, mid, lists);
        ListNode n2 = _merge(mid + 1, right, lists);

        return _merge2List(n1, n2);

    }

    private ListNode _merge2List(ListNode n1, ListNode n2) {

        if (n1 == null) {
            return n2;
        }
        if (n2 == null) {
            return n1;
        }
        if(n1.val<n2.val){
            n1.next= _merge2List(n1, n2);
            return n1;
        }else{
            n2.next=_merge2List(n1, n2.next);
            return n2;
        }


    }

}
// @lc code=end

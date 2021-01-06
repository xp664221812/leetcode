import java.util.List;

/*
 *合并两个有序链表 
 * */

class Solution {

    // 非递归
    public ListNode mergeTwoLists(ListNode t1, ListNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }

        // 设置一个虚拟头节点
        ListNode head = new ListNode(0);
        ListNode current = head;

        while (t1 != null && t2 != null) {
            if (t1.val <= t2.val) {
                current.next = t1;
                current = t1;
                t1 = t1.next;
            } else {
                current.next = t2;
                current = t2;
                t2 = t2.next;
            }
        }

        if (t1 == null) {
            current.next = t2;
        }
        if (t2 == null) {
            current.next = t1;
        }

        return head.next;

    }

    // 递归
    public ListNode mergeTwoLists2(ListNode t1, ListNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        if (t1.val <= t2.val) {
            t1.next = mergeTwoLists2(t1.next, t2);
            return t1;
        } else {
            t2.next = mergeTwoLists2(t1, t2.next);
            return t2;
        }

    }

    public ListNode mergeTwoLists3(ListNode t1, ListNode t2) {
        ListNode head = new ListNode(0);
        ListNode current = head;

        while (t1 != null && t2 != null) {
            if (t1.val < t2.val) {
                current.next = t1;
                current = t1;
                t1 = t1.next;
            } else {
                current.next = t2;
                current = t2;
                t2 = t1.next;
            }
        }

        if (t1 == null) {
            current.next = t2;
        }
        if (t2 == null) {
            current.next = t1;
        }

        return head;

    }

    public ListNode mergeTwoLists4(ListNode t1, ListNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }

        if (t1.val < t2.val) {
            t1.next = mergeTwoLists4(t1.next, t2);
            return t1;
        } else {
            t2.next = mergeTwoLists4(t1, t2.next);
            return t2;
        }

    }

    public ListNode mergeTwoLists5(ListNode t1, ListNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }

        ListNode head = new ListNode(0);
        ListNode current = head;

        while (t1 != null && t2 != null) {
            if (t1.val < t2.val) {
                current.next = t1;
                current = t1;
                t1 = t1.next;
            } else {
                current.next = t2;
                current = t2;
                t2 = t2.next;
            }
        }
        if (t1 == null) {
            current.next = t2;
        }

        if (t2 == null) {
            current.next = t1;
        }
        return head.next;

    }

    // 合并 k 个排序链表，返回合并后的排序链表。
    public ListNode mergeKLists(ListNode[] lists) {
        for (int i = 0; i < lists.length; i++) {

        }
    }

    public ListNode mergeTwoLists6(ListNode t1, ListNode t2) {
        if (t1 == null) {
            return t2;
        }

        if (t2 == null) {
            return t1;
        }

        if (t1.val < t2.val) {
            t1.next = mergeTwoLists6(t1.next, t2);
            return t1;
        } else {
            t2.next = mergeTwoLists6(t1, t2.next);
            return t2;
        }
    }

    public ListNode mergeTwoLists7(ListNode t1, ListNode t2) {
        ListNode head = new ListNode(0);
        ListNode current = head;
        while (t1 != null && t2 != null) {
            if (t1.val < t2.val) {
                current.next = t1;
                current = t1;
                t1 = t1.next;

            } else {
                current.next = t2;
                current = t2;
                t2 = t2.next;
            }
        }
        if (t1 == null) {
            current.next = t2;
        }
        if (t2 == null) {
            current.next = t1;
        }

        return head.next;
    }

    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
package linkedlist;

/**
 * @author haicheng.lhc@alibaba-inc.com 2019/02/13
 */

public class Leetcode{

    /**
     * https://leetcode.com/problems/reverse-linked-list/
     * 206. Reverse Linked List
     * Recursive
     */
    public static ListNode<Integer> reverseLinkedList1(ListNode<Integer> head){
        System.out.println("reverseLinkedList1");

        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = reverseLinkedList1(head.next);
        head.next.next = head;
        head.next = null;
        return p;

    }


    /**
     * https://leetcode.com/problems/reverse-linked-list/
     * 206. Reverse Linked List
     * Iterative
     */
    public static ListNode<Integer> reverseLinkedList(ListNode<Integer> head){
        System.out.println("reverseLinkedList");

        if (head == null || head.next == null) {
            return head;
        }

        ListNode<Integer>  prev = null;
        ListNode<Integer> curr = head;
        while(curr != null){
            ListNode<Integer> tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        return prev;

    }


    /**
     * https://leetcode.com/problems/linked-list-cycle/
     * https://leetcode.com/problems/linked-list-cycle-ii/
     * Linked List Cycle
     */
    public void linkedListCycle(ListNode<Integer> head){



    }

    /**
     * https://leetcode.com/problems/merge-two-sorted-lists/
     */
    public void mergeTwoSortedLists(){

    }

    /**
     * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
     */
    public void removeNthNodeFromEndofList(){

    }

    /**
     * https://leetcode.com/problems/middle-of-the-linked-list/
     * @param head
     * @return
     */
    public static ListNode<Integer> middleoftheLinkedList(ListNode<Integer> head){

        ListNode<Integer> slow = head;
        ListNode<Integer> fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> emptyLink = new SinglyLinkedList();

        SinglyLinkedList<Integer> oneNodelink = new SinglyLinkedList();
        int[] data = {1};
        for (int i = 0; i < data.length; i++) {
            oneNodelink.insertTail(data[i]);
        }

        SinglyLinkedList<Integer> moreNodelink = new SinglyLinkedList();
        int[] data1 = {1,2,3};
        for (int i = 0; i < data1.length; i++) {
            moreNodelink.insertTail(data1[i]);
        }

        ListNode<Integer> res = null;

//        //test null
//        SinglyLinkedList.printAll(emptyLink.getHead());
////        res = Leetcode.reverseLinkedList(emptyLink.head);
////        SinglyLinkedList.printAll(res);
//        res = Leetcode.reverseLinkedList1(emptyLink.getHead());
//        SinglyLinkedList.printAll(res);

//        //test one node
//        SinglyLinkedList.printAll(oneNodelink.getHead());
//        res = Leetcode.reverseLinkedList(oneNodelink.getHead());
//        SinglyLinkedList.printAll(res);
//        res = Leetcode.reverseLinkedList1(oneNodelink.getHead());
//        SinglyLinkedList.printAll(res);

        //test more node
        SinglyLinkedList.printAll(moreNodelink.getHead());
        res = Leetcode.reverseLinkedList(moreNodelink.getHead());
        SinglyLinkedList.printAll(res);
//        res = Leetcode.reverseLinkedList1(moreNodelink.getHead());
//        SinglyLinkedList.printAll(res);


    }
}

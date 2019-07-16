/**
 * @author haicheng.lhc@alibaba-inc.com 2019/06/19
 * @date 2019/06/19
 */

import linkedlist.Leetcode;
import linkedlist.ListNode;
import linkedlist.SinglyLinkedList;
import org.junit.Test;

public class TestLeetcode {

    private static SinglyLinkedList<Integer> composeMoreLinkedList(){

        SinglyLinkedList<Integer> moreNodelink = new SinglyLinkedList();
        int[] data1 = {1,2,3,4};
        for (int i = 0; i < data1.length; i++) {
            moreNodelink.insertTail(data1[i]);
        }
        return  moreNodelink;

    }
    @Test
    public void testReverseLinkedList(){
        SinglyLinkedList<Integer> origin = TestLeetcode.composeMoreLinkedList();
        SinglyLinkedList.printAll(origin.getHead());
        ListNode<Integer>  reverse = Leetcode.reverseLinkedList(origin.getHead());
        SinglyLinkedList.printAll(reverse);


    }

    @Test
    public void testMiddleoftheLinkedList(){
        SinglyLinkedList<Integer> origin = TestLeetcode.composeMoreLinkedList();
        SinglyLinkedList.printAll(origin.getHead());
        ListNode<Integer> middle = Leetcode.middleoftheLinkedList(origin.getHead());
        SinglyLinkedList.printAll(middle);
    }
}

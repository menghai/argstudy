package linkedlist;

/**
 * @author haicheng.lhc@alibaba-inc.com 2019/02/02
 * @date 2019/02/02
 */

public class ListNode<T> {

    public  T data;
    public ListNode next;

    public ListNode(T data, ListNode next) {
        this.data = data;
        this.next = next;
    }
}

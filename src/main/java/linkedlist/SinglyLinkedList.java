package linkedlist;

/**
 * @author haicheng.lhc@alibaba-inc.com 2019/02/02
 * @date 2019/02/02
 */

public class SinglyLinkedList<T> {

    private ListNode head = null;

    public ListNode getHead() {
        return head;
    }

    public void setHead(ListNode head) {
        this.head = head;
    }

    public ListNode findByValue(T value) {
        ListNode p = head;
        while (p != null && p.data != value) {
            p = p.next;
        }

        return p;
    }

    /**
     *
     * @param newListNode
     */
    public void insertToHead(ListNode newListNode) {
        if (head == null) {
            head = newListNode;
        } else {
            newListNode.next = head;
            head = newListNode;
        }
    }

    //无头结点
    //表头部插入
    //这种操作将于输入的顺序相反，逆序
    public void insertToHead(T value) {
        ListNode newListNode = new ListNode(value, null);
        insertToHead(newListNode);
    }

    //顺序插入 链表尾部插入

    public void insertTail(T value) {

        ListNode newListNode = new ListNode(value, null);
        //空链表，可以插入新节点作为head，也可以不操作
        if (head == null) {
            head = newListNode;

        } else {
            ListNode q = head;
            while (q.next != null) {
                q = q.next;
            }
            newListNode.next = q.next;
            q.next = newListNode;
        }
    }

    /**
     * @param p
     * @param newListNode
     */
    public void insertAfter(ListNode p, ListNode newListNode) {
        if (p == null) {
            return;
        }


        newListNode.next = p.next;
        p.next = newListNode;
    }


    /**
     * @param p
     * @param value
     */
    public void insertAfter(ListNode p, T value) {
        ListNode newListNode = new ListNode(value, null);
        insertAfter(p, newListNode);
    }

    public void insertBefore(ListNode p, ListNode newListNode) {
        if (p == null) {
            return;
        }
        if (head == p) {
            insertToHead(newListNode);
            return;
        }

        ListNode q = head;
        while (q != null && q.next != p) {
            q = q.next;
        }

        if (q == null) {
            return;
        }

        newListNode.next = p;
        q.next = newListNode;

    }

    public void insertBefore(ListNode p, T value) {
        ListNode newListNode = new ListNode(value, null);
        insertBefore(p, newListNode);
    }

    public void deleteByNode(ListNode p) {
        if (p == null || head == null) {
            return;
        }

        if (p == head) {
            head = head.next;
            return;
        }

        ListNode q = head;
        while (q != null && q.next != p) {
            q = q.next;
        }

        if (q == null) {
            return;
        }

        q.next = q.next.next;
    }

    public void deleteByValue(T value) {
        if (head == null) {
            return;
        }

        ListNode p = head;
        ListNode q = null;
        while (p != null && p.data != value) {
            q = p;
            p = p.next;
        }

        if (p == null) {
            return;
        }

        if (q == null) {
            head = head.next;
        } else {
            q.next = q.next.next;
        }

    }

    public void printAll() {
        ListNode p = head;
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.println();
    }
    public static <K> void printAll(ListNode<K> head){
        if(head == null){
            System.out.println("head is null");
            return;
        }
        ListNode<K> p = head;
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }

        System.out.println();
    }

    public static ListNode createNode(int value) {
        return new ListNode(value, null);
    }

    //带结点的链表翻转
    public ListNode inverseLinkList_head(ListNode p){
        //　Head　为新建的一个头结点
        ListNode Head = new ListNode(9999,null);
        // p　为原来整个链表的头结点,现在Head指向　整个链表
        Head.next = p;
        /*
        带头结点的链表翻转等价于
        从第二个元素开始重新头插法建立链表
        */
        ListNode Cur = p.next;
        p.next = null;
        ListNode next = null;

        while(Cur != null){
            next = Cur.next;
            Cur.next = Head.next;
            Head.next = Cur;
            System.out.println("first " + Head.data);

            Cur = next;
        }

        //　返回左半部分的中点之前的那个节点
        //　从此处开始同步像两边比较
        return Head;

    }


    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = reverse(slow);
        fast = head;

        while (slow != null) {
            if (fast.data != slow.data) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }


    public static void main(String[] args) {
        SinglyLinkedList link = new SinglyLinkedList();
        int data[] = {1, 2, 5};
        for (int i = 0; i < data.length; i++) {
            link.insertTail(data[i]);
        }


        System.out.println(link.reverse(link.head).data);
    }
}

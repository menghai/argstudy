import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author haicheng.lhc@alibaba-inc.com 2019/03/13
 * @date 2019/03/13
 */

public class Test {

    static  class Node {

        int val;
        Node next;

        @Override
        public String toString() {
            return "Node{" + "val=" + val + ", next=" + next + '}';
        }
    }

    private static Stack<Node> nodeToStack(Node node) {
        Stack<Node> result = new Stack<>();
        Node current = node;
        while (current != null) {
            result.add(current);
            current = current.next;
        }
        return result;
    }

    public static Node findFirtPublicNode(Node first, Node second) {
        Stack<Node> firstStack = nodeToStack(first);
        Stack<Node> secondStack = nodeToStack(second);
        Node result = null;
        Node firstPop = firstStack.pop();
        Node secondPop = secondStack.pop();
        while (secondPop != null && firstPop == secondPop) {
            result = firstPop;
            firstPop = firstStack.pop();
            secondPop = secondStack.pop();
        }
        return result;
    }

    private static Node listToNode(List<Integer> list) {
        Node node = new Node();
        Node current = node;
        for (int i = 0; i < list.size(); i++) {
            current.val = list.get(i);
            if(i!=list.size()-1){
                current.next = new Node();
                current = current.next;
            }

        }

        return node;
    }

    public static void main(String[] args) {
        List<Integer> aa = new ArrayList<>();
        aa.add(1);
        aa.add(2);
        aa.add(3);
        aa.add(4);
        List<Integer> bb = new ArrayList<>();
        bb.add(5);
        bb.add(4);
        bb.add(6);
        bb.add(4);
        Node first = listToNode(aa);
        Node second = listToNode(bb);
        second.next = first.next;
        System.out.println(findFirtPublicNode(first,second));
    }

}

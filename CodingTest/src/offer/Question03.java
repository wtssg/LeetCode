package offer;

import java.util.ArrayList;
import java.util.LinkedList;

class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}
public class Question03 {
    public ListNode turn(ListNode head) {
        if (head == null) {
            return head;
        }
        if (head.next == null) {
            return head;
        }
        ListNode nextNode = turn(head.next);
        nextNode.next = head;
        head.next = null;
        return head;
    }
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        if (listNode.next != null) {
            list.addAll(printListFromTailToHead(listNode.next));
        }
        list.add(listNode.val);
        return  list;
    }
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        Question03 question03 = new Question03();
//        question03.turn(listNode1);
//        System.out.println(listNode3.next.val);
        ArrayList<Integer> list = question03.printListFromTailToHead(listNode1);
        for (int i: list) {
            System.out.println(i);
        }
    }
}

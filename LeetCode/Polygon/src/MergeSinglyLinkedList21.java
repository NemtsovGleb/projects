import java.util.ArrayList;
import java.util.Collections;

public class MergeSinglyLinkedList21 {

    public static void main(String[] args) {
        ListNode node4 =new ListNode(4);
        ListNode node2 = new ListNode(2,node4);
        ListNode node1 = new ListNode(1,node2);

        ListNode node14 =new ListNode(4);
        ListNode node13 = new ListNode(3,node14);
        ListNode node11 = new ListNode(1,node13);

        ListNode root = new ListNode();
        root.mergeTwoLists(node1, node11);


    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

    ArrayList<Integer> vals1 = new ArrayList();
    ArrayList<Integer> vals2 = new ArrayList();

    ListNode.traverse(list1,vals1);
    ListNode.traverse(list2,vals2);

    System.out.println(vals1);
    System.out.println(vals2);

    vals1.addAll(vals2);
    System.out.println(vals1);
    Collections.sort(vals1);
    System.out.println(vals1);

    ListNode root = new ListNode();
    for(int i = vals1.size()-1; i > 0; i--) {

        ListNode temp = new ListNode(i);
        if(i == vals1.size()-1)
            continue;

        root = new ListNode(i, temp);

    }



            return root;
    }

    public static void traverse(ListNode node, ArrayList<Integer> list) {
        ListNode current = node;
        while (current != null) {
            System.out.print(current.val + " ");
            list.add(current.val);
            current = current.next;
        }
        System.out.println();
    }

    public ListNode add(int val) {
        return new ListNode(val);
    }


    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                '}';
    }
}

import java.util.Comparator;
import java.util.PriorityQueue;

public class LinkedListBasics {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // Merge Two Lists
    public ListNode mergeTwoListsExample(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode resultHead = new ListNode();
        if (list1.val < list2.val) {
            resultHead.val = list1.val;
            resultHead.next = mergeTwoListsExample(list1.next, list2);
        } else {
            resultHead.val = list2.val;
            resultHead.next = mergeTwoListsExample(list1, list2.next);
        }

        return resultHead;
    }

    // Merge K Lists
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        ListNode headNode = new ListNode(0);
        ListNode tempNode = headNode;

        int pqSize = lists.length;
        PriorityQueue<ListNode> pq = new PriorityQueue<>(pqSize, new NodeComparator());

        for (ListNode node : lists) {
            if (node != null) pq.add(node);
        }

        while (!pq.isEmpty()) {
            tempNode.next = pq.poll();
            tempNode = tempNode.next;
            if (tempNode.next != null) pq.add(tempNode.next);
        }
        return headNode.next;
    }

    static class NodeComparator implements Comparator<ListNode> {

        // ascending order of val
        @Override
        public int compare(ListNode o1, ListNode o2) {
            if (o1.val < o2.val)
                return -1;
            else if (o1.val > o2.val)
                return +1;
            return 0;
        }
    }
}

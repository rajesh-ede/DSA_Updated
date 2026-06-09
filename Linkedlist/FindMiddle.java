package Linkedlist;

public class FindMiddle {
  // BruteForce Solution
     public static ListNode Middle(ListNode head) {
        ListNode temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        temp = head;
        int middle = count / 2;

        while (middle > 0) {
            temp = temp.next;
            middle--;
        }

        return temp;
    }
    // Optimal Solution
    public static ListNode MiddleOptimal(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
       
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode middleNode = Middle(head);

        System.out.println("Middle Node: " + middleNode.val);
    }
    
}

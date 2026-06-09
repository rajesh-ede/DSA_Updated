package Linkedlist;

public class Reverselinkedlist {
    public static ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode temp = head;
        while(temp != null){
            temp.next = prev;
            prev = temp;
            temp = temp.next;
        }
        return prev;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode reversedHead = reverseList(head);

        System.out.println("Reversed Linked List:");
        ListNode temp = reversedHead;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        } 
    }
}

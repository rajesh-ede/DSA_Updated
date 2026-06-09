
import java.util.*;
public class MergeTwoSortedlist{
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> list = new ArrayList<>();
        while(list1 != null){
            list.add(list1.val);
            list1 = list1.next;
        }
        while(list2 != null){
            list.add(list12.val);
            list2 = list2.next;
        }
        Collections.sort(list);
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        for(int num : list){
            temp.next = new ListNode(num);
            temp = temp.next;
        }
       return dummy.next;
    }
     public ListNode mergeTwoListsOptimal(ListNode list1, ListNode list2){
        


        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while(list1 != null && list2 != null) {

            if(list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }

            temp = temp.next;
        }

        if(list1 != null) {
            temp.next = list1;
        }

        if(list2 != null) {
            temp.next = list2;
        }

        return dummy.next;
     }

}
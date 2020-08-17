package com.vaibhav1.linkedlist;

/**
 * Merge two sorted linked lists and return it as a new sorted list. The new list should be made by splicing together the nodes of the first two lists.
 *
 * Example:
 *
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 */



class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class MergeTwoSortedList {




    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1 == null){
            return l2;
        }

        if(l2 == null){
            return l1;
        }

        ListNode head = null;
        ListNode index = null;
        while(l1!=null && l2!=null){

            if(l1.val < l2.val){

                ListNode temp = new ListNode(l1.val);
                if(head == null){
                    head = temp;
                    index = temp;
                }else{
                    index.next = temp;
                    index = index.next;
                }
                l1 = l1.next;

            } else if(l1.val > l2.val){

                ListNode temp = new ListNode(l2.val);
                if(head == null){
                    head = temp;
                    index = temp;
                }else{
                    index.next = temp;
                    index = index.next;
                }
                l2 = l2.next;

            } else {
                ListNode temp = new ListNode(l1.val);
                if(head == null){
                    head = temp;
                    index = temp;
                }else{
                    index.next = temp;
                    index = index.next;
                }
                l1 = l1.next;
                //l2 = l2.next;
            }
        }

        //if l1 is larger
        while(l1!=null){
            ListNode temp = new ListNode(l1.val);
            index.next = temp;
            index = index.next;
            l1 = l1.next;
        }

        //if l2 is larger
        while(l2!=null){
            ListNode temp = new ListNode(l2.val);
            index.next = temp;
            index = index.next;
            l2 = l2.next;
        }

        return head;
    }
}

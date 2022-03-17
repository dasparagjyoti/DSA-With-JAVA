package com.dsalgowithjava;

public class Print_Elements_in_a_Singly_Linked_List_In_Java {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void display(){ //Created method to print the LL
        ListNode current = head;
        while(current != null){
            System.out.println(current.data + "--->");
            current = current.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args){
        Print_Elements_in_a_Singly_Linked_List_In_Java sll = new  Print_Elements_in_a_Singly_Linked_List_In_Java();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(12);
        ListNode third = new ListNode(13);
        ListNode fourth = new ListNode(14);

        //Now We Will connect them together to form a chain
        sll.head.next = second; //10-->12
        second.next = third; //10-->12-->13
        third.next =fourth; //10-->12-->13-->14-->null

        sll.display();
        //calling the method to print or display the LL
    }

}

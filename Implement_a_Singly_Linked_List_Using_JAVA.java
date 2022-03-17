package com.dsalgowithjava;

public class Implement_a_Singly_Linked_List_Using_JAVA {
    private ListNode head;

    private static class  ListNode{
        private int data; //Data can be any Generic type,here we have taken int type only
        private ListNode next;

        public ListNode(int data){ //Constructor which contains the data
            this.data = data;
            this.next = null;
        }
    }

}

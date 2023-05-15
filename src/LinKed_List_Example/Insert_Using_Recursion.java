package LinKed_List_Example;

import my_linked_list.Basic_LL;

public class Insert_Using_Recursion {
    private Node head;
    private  Node tail;
    public class Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
        }
        Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
    public void insertFirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
    }
    public void insert(int value,int index){
        head=insertion_Rec(value,index,head);

    }
    public  Node insertion_Rec(int value1,int index,Node node1){
   if(index==0){
       Node temp=new Node(value1,node1);

        return temp;
     }insertion_Rec(value1,index-1,node1.next);
   node1.next=insertion_Rec(value1,index-1,node1.next);
   return node1.next;
        }

    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" --> ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] aargs){
        Insert_Using_Recursion in=new Insert_Using_Recursion();
        in.insertFirst(6);
        in.insertFirst(3);
        in.insertFirst(2);
        in.insertFirst(1);
        in.display();
        in.insert(34,2);
        in.display();
    }

}

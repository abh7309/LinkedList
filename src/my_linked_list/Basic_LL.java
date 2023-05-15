package my_linked_list;

public class Basic_LL {
    private  Node head;
    private Node tail;
    private int size;

    public Basic_LL() {
        this.size=size;
    }
    public void insertFirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        size++;
        if(tail==null){
            tail=head;
        }
    }

    public void DeleteAT_tail(){
        if(head==tail){
            insertFirst(89);
            return;
        }
        Node temp3=head;
        while(temp3.next.next!=null){
            temp3= temp3.next;
        }
        temp3.next=null;
        size--;

    }
    public int DeleteAT_2(){
        Node secondlast=get(size-2);
        int value=tail.data;
        tail=secondlast;
        tail.next=null;
        return value;
    }
    public void Delete_AT_Particular(int index){
        Node prevNode=get(index-1);
        Node nextNode=get(index+1);
        prevNode.next=nextNode;
        size--;
    }


    public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }
    public Node find_Node(int value){
        Node node=head;
        while(node.next!=null){
            if(node.data==value){
                return node;
            }
            node=node.next;
        }
        return null;

    }
    public void insertAT_end(int vlaue){
        Node node1=new Node(vlaue);
        Node temp2=head;
        while(temp2.next.next!=null){
            temp2=temp2.next;


        }
     temp2.next.next=node1;
        size++;
    }
    public void insert(int index,int value){
        if(index==size){
            insertAT_end(45);
            return;
        }if(index==0){
            insertFirst(78);
            return;
        }Node temp4=head;
        for(int i=1;i<index;i++){
            temp4=temp4.next;
        }
        Node node2=new Node(7);
        Node temp5=temp4.next;
        temp4.next=node2;
        node2.next=temp5;
        size++;

    }

    private class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
        Node(int data,Node next)
        {
            this.data=data;
            this.next=next;
        }


    }


    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }
    }

    public  static void  main(String[] args){
        Basic_LL BL=new Basic_LL();
        BL.insertFirst(56);
        BL.insertFirst(85);
        BL.insertFirst(93);
        BL.insertFirst(51);
        BL.insertAT_end(999);
        BL.insert(3,7);
       System.out.println( BL.find_Node(85));
        BL.display();
        System.out.println();
        BL.DeleteAT_tail();
        BL.display();
        System.out.println();
        System.out.println(BL.get(2));
        BL.Delete_AT_Particular(2);

        BL.display();
        System.out.println(BL.size);


    }
}

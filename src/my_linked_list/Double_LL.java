package my_linked_list;

public class Double_LL {
    int size;
    private Node head;
    private Node tail;

    class Node{
        Node next;
        Node prev;
        int value;
        Node( int value){
            this.value=value;
        }
    }
    public void insertion_AT_first(int value){
        Node node=new Node(value);
        node.next=head;


        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
        System.out.println(head);
    }
    public void display(){
        Node node=head;
        Node last=null;
        while(node!=null){
            System.out.print("<--"+node.value+"-->");
            last=node;
            node=node.next;}
        System.out.println("END");
        while(last!=null){
            System.out.print("<--"+last.value+"-->");
            last=last.prev;
        }
        System.out.println("START");
     }
     public void insertLast(int value){
        Node lastnode =new Node(value);
        if(head==null){
            head=lastnode;
            head.prev=null;
        }
        Node node=head;
        while(node.next!=null){
            node=node.next;
        }
        node.next=lastnode;
        lastnode.prev=node;

     }
     public void insertAt_position(int position,int value){
        Node node =new Node(value);
        Node temp=head;
        while(temp.value!=position){
            temp=temp.next;
        }
         node.next=temp.next.next;
        temp.next.next.prev=node;
        temp.next=node;
        node.prev=temp;

     }




    public static void main(String[] args){
        Double_LL DLL= new Double_LL();
        DLL.insertion_AT_first(67);

        DLL.insertion_AT_first(78);
        DLL.insertion_AT_first(100);
        DLL.insertLast(754);
        DLL.display();
        DLL.insertAt_position(78,546);
        DLL.display();



    }
}

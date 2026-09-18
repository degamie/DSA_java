//WID(02/09/2026)(Sarthak Mittal)(DegamieSign)#1.1
package LinkedList;

//import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.List;

public class Nodes {
    public  int data;
    public int size;
    int next=0;
    public Nodes head; public Nodes tail;

    Nodes(){
        this.data=data;
        this.size=0;
    }
}
 class  LinkedLists extends  Nodes{
//  public   Nodes next=new Nodes();
public LinkedLists(int data) {
        this.data= head.data;;
        this.head=head;
        this.tail=tail;
    }

     public LinkedLists() {
     }


     public void addNodes(int data){
        LinkedLists n=new LinkedLists(data);
        Nodes curr= null;
        if(head==null){head=n;tail=n;}
        else
            while(head!=null){
                curr=tail;
            }
                curr.next=next;
    }
    public void printLL(){
//        int next=0;
        LinkedLists tmp=(LinkedLists) head;
        while(tmp!=null){
            System.out.println(tail.data+"-> ");
            tmp.next=next;
        }
        System.out.println("null");
    }
}


class Main extends LinkedLists{
    public static void main(String[] args){
//        int x=0;
        List<Integer> l1=new LinkedList();
        l1.add(1);l1.add(2);l1.add(3);l1.add(4);
        l1.removeIf(x->x%2==0);
        l1.add(5);
        l1.addLast(6);
        l1.addFirst(7);
        System.out.println(l1);
        for(int i=0;i<l1.size();i++){
            System.out.println("Element at Index:"+i+l1.get(i));
        }
    }
}



//            LinkedLists n=new LinkedLists();
//            n.addNodes(1);
//        n.addNodes(2);
//        n.addNodes(3);
//        n.addNodes(4);
//        n.printLL();

//    E item;
//    Node<E> prev;    Node<E> next;
//    LinkedLists(E item, Node<E> prev, Node<E> next){
//        this.item=item;
//        this.prev=prev;
//        this.next=next;
//    }
//    public static  void main(String[] args){
//      List<String> l1=new LinkedList();
//       l1.add(0,"Sarthak");
//        l1.add(1,"Mittal");
//        l1.add(2,"Java Full Stack Developer");
//        System.out.println(l1);
//    }



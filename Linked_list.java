import java.util.*;
public class node{
    int data;
    node next;
}
public class LinkedList {
    node head;
    public void insert(int data){
        node Node = new node();
        Node.data = data;
        Node.next = null;
        if(head==null){
            head = Node;
        }
        else{
            node n = head;
            while(n.next!=null){
                n = n.next;
            }
            n.next = Node;
        }
    }
    public void insertAtStart(int data){
        node Node = new node();
        Node.data = data;
        Node.next = null;
        Node.next = head;
        head = Node;
    }
    public void insertAt(int index, int data){
        node Node = new node();
        Node.data = data;
        Node.next = null;
        if(index==0){
            insertAtStart(data);
        }
        else {
            node n = head;
            for (int i = 0; i < index-1; i++) {
                n = n.next;
            }
            Node.next = n.next;
            n.next = Node;
        }

    }

    public void deleteAt(int index){
        if(index==0){
            head = head.next;
        }
        else{
            node n = head;
            node n1 = null;
            for (int i = 0; i < index-1; i++) {
                n = n.next;
            }
            n1 = n.next;
            n.next=n1.next;
        }

    }
    public void show(){
        node n = head;
        while(n.next!=null){
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }
}
class Main {
    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insertAtStart(5);
        list.insertAt(3,25);
        list.deleteAt(3);
        list.show();
    }
}

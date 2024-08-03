package linkedlist;

public class linkedlist {
    public static void main(String[] args) {
        ll list = new ll();
        list.addFirst("first");
        list.addFirst("second");
        list.addFirst("3rd");
        list.addFirst("4th");
        list.addlast("45");
        list.print(); // To print the list and check the insertion order
    }
}

class ll {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) { // constructor
            this.data = data;
            this.next = null;
        }
    }

    void addFirst(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }


    void print(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+"-");
            current=current.next;
        }
        System.out.println("null");
    }
    void addlast(String data) {
        Node newdata = new Node(data);


        if (head == null) {
            head = newdata;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newdata;
    }

    {
    }
}

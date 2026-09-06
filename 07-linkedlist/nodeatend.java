class node {
    int data;
    node next;

    node(int data){
        this.data = data;
        this.next = null;
    }
}

public class nodeatend {
    public static node addNodeAtEnd(node head, int data){
        node newNode = new node(data);
        if(head == null){
            return newNode;
        }

        node last = head;

        while(last.next != null){
            last = last.next;
        }

        last.next = newNode;

        return head;
    }

    public static void printList(node head){
        node current = head;
        while(current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args){
        node head = new node(1);
        head.next = new node(2);
        head.next.next = new node(3);

        System.out.println("Original Linked List:");
        printList(head);

        int newData = 4;
        head = addNodeAtEnd(head, newData);

        System.out.println("Linked List after adding " + newData + " at the end:");
        printList(head);
    }
}

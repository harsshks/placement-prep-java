class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class nodeatfront {
    static node addNodeAtFront(node head, int data) {
        node newNode = new node(data);
        newNode.next = head;
        return newNode;
    }

    static void printList(node head) {
        node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        node head = new node(2);
        head.next = new node(3);
        head.next.next = new node(4);

        System.out.println("Original Linked List:");
        printList(head);

        int newData = 1;
        head = addNodeAtFront(head, newData);

        System.out.println("Linked List after adding " + newData + " at the front:");
        printList(head);
    }
}

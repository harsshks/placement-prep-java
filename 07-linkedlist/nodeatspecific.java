class node {
    int data;
    node next;
    node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class nodeatspecific {
    public static node addNodeAtSpecificPosition(node head, int data, int position) {
        node newNode = new node(data);
        if (position == 0) {
            newNode.next = head;
            return newNode;
        }

        node current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Position is out of bounds.");
            return head;
        }

        newNode.next = current.next;
        current.next = newNode;

        return head;
    }

    public static void printList(node head) {
        node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        node head = new node(1);
        head.next = new node(2);
        head.next.next = new node(3);

        System.out.println("Original Linked List:");
        printList(head);

        int newData = 4;
        int position = 2;
        head = addNodeAtSpecificPosition(head, newData, position);

        System.out.println("Linked List after adding " + newData + " at position " + position + ":");
        printList(head);
    }               
}

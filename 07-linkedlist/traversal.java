class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class traversal {

    // public static void traverse(Node head) {
    //     while(head != null){
    //         System.out.print(head.data);
    //         if(head.next != null){
    //             System.out.print(" -> ");
    //         }
    //         head = head.next;
    //     }
    //     System.out.println();
    // }

    static void traverse(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data);
        if (head.next != null) {
            System.out.print(" -> ");
        }
        traverse(head.next);
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        traverse(head);
    }

}

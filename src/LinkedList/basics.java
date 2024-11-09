package LinkedList;

public class basics {
    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.insertAtStart(50);
        list.insertAtStart(40);
        list.insertAtStart(30);
        list.insertAtStart(20);
        list.insertAtStart(10);
        list.insertAtEnd(60);
        list.insertAtEnd(70);
        list.insertAtEnd(80);
        list.insertAtEnd(90);
        list.insertAtEnd(100);
        list.display(); // Display the LinkedList
    }

    public static class Node {
        int data;
        Node next;

        // Constructor to create a new node with data
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static class linkedlist{
        Node head;
        // Method to insert a node at the start of the LinkedList
        void insertAtStart(int data) {
            Node newNode = new Node(data); // Create a new node with given data
            newNode.next = head;           // Link the new node to the current head
            head = newNode;                 // Make the new node as the head of the LinkedList
        }

        // Method to insert a node at the last of the LinkedList
        void insertAtEnd(int data) {
            Node newNode = new Node(data); // Create a new node with given data
            if(head == null){
                head = newNode; // If list is empty, make the new node as head
                return;
            }
            Node temp =head;
            while(temp.next != null){  //Jump till last  node
                temp = temp.next;
            }
            temp.next = newNode;
        }

        // Method to display the LinkedList
        void display() {
            if (head == null) {
                System.out.println("List is empty.");
                return;
            }
            Node temp = head;
            System.out.print("LinkedList: ");
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
}
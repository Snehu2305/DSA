import java.util.*;

class Node{

    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{

    Node head;

void insert(int data){

        Node newnode = new Node(data);

        if(head == null){
            head = newnode;
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newnode;
    }

 void display(){
        int count = 0;
        Node temp = head;

        if(temp == null){
            System.out.println("List is empty");
            return;
        }

        
        while(temp != null){
            count++;
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

        System.out.println("null");
         System.out.println("total nodes are: "+count);
    }
   
}

 class singlyLinkedList{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedList list = new LinkedList();

        while (true) {
            System.out.println("1. Insert a value");
            System.out.println("2. Display linked list");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int val = scan.nextInt();
                    list.insert(val);
                    break;
                case 2:
                    list.display();
                    break;
                case 3:
                    scan.close();
                    return; 
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}

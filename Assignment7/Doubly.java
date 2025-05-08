import java.util.*;
class Doubly{
 class Node{
   int data;
   Node next;
   Node prev;

   Node(int data){
    this.data = data;
    this.next = null;
    this.prev = null;
   }
  }

  Node head;
  Node tail;

  public void addBeg(int data){
    Node NewNode = new Node(data);
    if(head == null){
      head = tail = NewNode;
     
      return;
    }
     NewNode.next = head;
     head.prev = NewNode;
     head = NewNode;
  }

  public void addLast(int data){
    Node NewNode = new Node(data);
    if(tail == null){
      head = tail = NewNode;
      
      return;
    }
    tail.next = NewNode;
    NewNode.prev = tail;
    tail = NewNode;
  }

  public void delbeg(){
    if(head == null){
      System.out.println("The list is empty");
      return;
    }
    head = head.next;
    head.prev = null;

  }
  public void delend(){
    if(tail == null){
      System.out.println("The list is empty");
      return;
    }
    tail = tail.prev;
    tail.next = null;

  }

  public void displayFront(){
    Node curr = head;

    while(curr!=null){
      System.out.print(curr.data + "->");
      curr = curr.next;
    }
    System.out.print("null");
  }


  public void displayTail(){
    Node curr = tail;

    while(curr != null){
      System.out.print(curr.data + "->");
      curr = curr.prev;
    }
    System.out.print("null");
  }

  public boolean search(int key){
   Node curr = head;
   while(curr != null){
     if(curr.data == key){
      return true;
     }
     
     curr = curr.next;
   }
   return false;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Doubly d = new Doubly();
    int data, key;
    

    while(true){
      System.out.println("\n1.addBeg\n2.addLast\n3.displayFront\n4.displayTail\n5.Search\n6.exit");
      System.out.println("Enter the choice: ");
      int choice = sc.nextInt();

      switch (choice) {
        case 1:
        System.out.println("Enter the data you want to insert: ");
        data = sc.nextInt();
        d.addBeg(data);
          break;

        case 2: 
        System.out.println("Enter the data you want to insert: ");
        data = sc.nextInt();
        d.addLast(data);
          break;

        case 3:
        d.displayFront();
        break;

        case 4:
        d.displayTail();
        break;

        case 5: 
        System.out.println("Enter the kay you wanna search: ");
        key = sc.nextInt();
        System.out.println(d.search(key));

        case 6:
        System.exit(0);
    
      }


    }
    
    
    
  }


   
     
   }
 


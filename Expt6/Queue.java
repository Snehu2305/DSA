import java.util.*;

class Solution{
Scanner scan = new Scanner(System.in);
int element, front = 0, rear = -1, size;
int[] arr;
void solution(){ 
  System.out.println("Enter the size of an queue: ");
  size = scan.nextInt();
  arr = new int[size];
  }
    
  void enqueue(){
  if(rear == size  -1){
   System.out.println("queue is full");
   }
  else{
   System.out.println("Enter element to enqueue: ");
   element = scan.nextInt();
   rear ++;
   arr[rear] = element;
   }
  }

  void dequeue(){
  if(front > rear){
  System.out.println("queue is empty");
  }
  else{
  System.out.println("dequeued element is: " +arr[front]);
  rear--;
  }
   }
   
  void display(){
    if(front > rear){
  System.out.println("queue is empty");
  }
  else{
  System.out.println("The elements are: ");
  for(int i = front; i<=rear; i++){
   System.out.println(arr[i]);
   }
  }
}

 void isFull(){
  if(rear == size  -1){
   System.out.println("queue is full");
   }
   else{
   System.out.println("queue is not full");}
   }
   
  void isEmpty(){
   if(front > rear){
  System.out.println("queue is empty");
  }
   else{
   System.out.println("queue is not empty");}
  }
}
  
class Queue{
 public static void main(String[] ar){
  Scanner sc = new Scanner(System.in);
  int choice;
  Solution solve = new Solution();
  solve.solution();
  
  while(true){
  System.out.println("\n1.enqueue\n2.dequeue\n3.Display\n4.isEmpty\n5.isFull");
  
  System.out.println("Enter a option: ");
  choice = sc.nextInt();
  
  switch(choice){
  case 1:
  solve.enqueue();
  break;
  case 2:
  solve.dequeue();
  break;
  case 3:
  solve.display();
  break;
  case 4:
  solve.isEmpty();
  break;
  case 5:
  solve.isFull();
  break;
  case 0:
  System.exit(0);
   }
  }
 }
}
    
  


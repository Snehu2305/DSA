import java.util.*;
class Stack{
  Scanner scan = new Scanner(System.in);
  
   int element, size, top = -1;
  
  
    int size = scan.nextInt();
    int stk = new int[size];    
  void push(){
   if(top == size - 1){
    System.out.println("The stack is full");
    }
   else{
   System.out.println("Enter the element to push: ");
    element = scan.nextInt();
    top++;
    stk[top] = element;
  }
  }
 
 void pop(){
  if(top == -1){
    System.out.println("the stack is empty");
    }
    else{
    System.out.println("Popped element: "+stk[top]);
     top--;
    }
  }
  
  void display(){
   if(top == -1){
   System.out.println("the stack is empty");
   }
   else{
   System.out.println("The elements are: ");
    for(int i = top; i >=0; i--){
     System.out.println(stk[i]);
    }
    
  }
  }
  
 void top(){
 if(top == -1){
   System.out.println("the stack is empty");
   }
  else{
   System.out.println("top element: " +stk[top]);
   }
  }
  
  void isEmpty(){
    if(top == -1){
   System.out.println("true");
   }
   else{
    System.out.println("false");
   }
   }
   
   void isFull(){
    if(top == size - 1){
   System.out.println("true");
   }
   else{
    System.out.println("false");
   }
   }
  }
   
class StackDSA{
 public static void main(String[] ar){
 Scanner scan = new Scanner(System.in);
   Stack st = new Stack();
  
   int choice;
   
   while(true){
  System.out.println("\n1.Push\n2.Pop\n3.Display\n4.Top\n5.isEmpty\n6.isFull");
 
  System.out.println("Enter the option: ");
  choice = scan.nextInt();
  
  switch(choice){
  case 1:
  st.push();
  break;
  
  case 2:
  st.pop();
  break;
  
  case 3:
  st.display();
  break;
  
  case 4: 
  st.top();
  break;
  
  case 5: 
  st.isEmpty();
  break;
  
  case 6:
  st.isFull();
  break;
  
  case 7:System.exit(0);
  }
  
}
}
}
   
   

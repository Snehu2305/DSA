import java.util.*;

class bubbleSort{
   public static void main(String ar[]){
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter the size of an array: ");
   int size = scan.nextInt();
   System.out.println("Enter the elements of an array: ");
   int[] arr = new int[size];
   for(int i =0; i < size; i++){
       arr[i] = scan.nextInt();
      }
      
     solution(arr, size);
     for(int i = 0; i <size; i++){
        System.out.print(arr[i] + " ");
        }
      
  }    
 static void solution(int[] arr, int size){   
  boolean flag;
 for(int i = 1; i < size; i++){
 flag = false;
    for(int j = 0; j < size - i; j++){
         if(arr[j] > arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
            flag = true;
            }
          }
          if(!flag)
           break;
           }
       
    
  }
  
  }

import java.util.*;
class insertion{
   public static void main(String ar[]){
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter the size of an array: ");
     int size = scan.nextInt();
     System.out.println("Enter the elements of an array: ");
     int[] arr = new int[size];
    
     for(int i = 0; i < size; i++){
      arr[i] = scan.nextInt();
      }
     
     solution(arr, size);
     for(int i = 0; i < size; i++){
      System.out.print(arr[i] + " ");
      }
     
     }
static void solution(int[] a, int n){
   for(int i = 1; i < n; i++){
      int temp = a[i];
      int j = i -1;
       while(j >= 0 && a[j] > temp){
       a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
       }
      }
    }
     


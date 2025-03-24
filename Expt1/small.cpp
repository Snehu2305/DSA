#include<iostream>
using namespace std;

int main(){
  int size;
  cout<<"Enter the size of array: ";
  cin>>size;
  int arr[size];
  
 
  cout<<"Enter the array elements: ";
  for(int i = 0; i<size; i++){
     cin>>arr[i];
     }
      int small = arr[0];
  for(int i = 1; i<size; i++){
      if(arr[i] < small){
       small = arr[i];
       }
      }   
      cout<<"The smallest number is: "<<small<<endl;
      
  
    
     return 0;
     }

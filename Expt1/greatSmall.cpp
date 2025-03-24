#include<iostream>
using namespace std;

int main(){
  int size;
  cout<<"Enter the size of array: ";
  cin>>size;
  int arr[size];
  int great = arr[0];
 
  cout<<"Enter the array elements: ";
  for(int i = 0; i<size; i++){
     cin>>arr[i];
     }
     
  for(int i = 1; i<size; i++){
      if(arr[i] > great){
      great = arr[i];
      }
      }   
      cout<<"The greatest number is: "<<great<<endl;
    
     return 0;
     }

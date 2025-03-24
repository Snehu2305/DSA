#include<iostream>
using namespace std;

int main(){
  int size;
  cout<<"Enter the size of array: ";
  cin>>size;
  int arr[size];
  int sum = 0;
  
 
  cout<<"Enter the array elements: ";
  for(int i = 0; i<size; i++){
     cin>>arr[i];
     }
     
  for(int i = 0; i<size; i++){
     cout<< arr[i]<<" ";
     } 
     cout<<endl;
 
 for(int i = 0; i<size; i++){
    sum += arr[i];
    }
  
  cout<<"The sum is: "<<sum;

    
     return 0;
     }

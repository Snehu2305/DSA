#include<iostream>
using namespace std;

int linear(int arr[], int size, int target){
   for(int i = 0; i<size; i++){
     if(arr[i] == target){
      return i;
      }
   }
   return -1;
  }
   
   
   
int main(){
  int size, target;
  cout<<"Enter the size of an array: "<<endl;
  cin>>size;
  int arr[size];
  cout<<"Enter the elements of an array: ";
  for(int i = 0; i < size; i++){
    cin>>arr[i];
  }
  cout<<"Enter the target value: ";
  cin>>target;
 int ans = linear(arr, size, target);
 cout<<ans;
 return 0; 
  }

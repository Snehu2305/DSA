#include<iostream>
using namespace std;

int binary(int arr[], int size, int target){
   int beg = 0;
   int end = size - 1;
   int mid;
   while(beg <= end){
   
    mid = beg + end / 2;
   
    if(arr[mid] == target){
     return mid;
    }
    else if(target > arr[mid]){
      beg = mid + 1;
     }
    else{
     end = mid -1;
    }
   
    }
  return -1;
}



int main(){
  int size, target;
  cout<<"Enter the size of an array: "<<endl;
  cin>>size;
  int arr[size];
  //cout<<"Enter the elements of an array: ";
  for(int i = 0; i < size; i++){
    cin>>arr[i];
  }
  cout<<"Enter the target value: ";
  cin>>target;
  
  int ans = binary(arr, size, target);
  cout<<"The target element is at "<<ans<<" index";
  
  return 0;
  }


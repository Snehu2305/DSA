#include<iostream>
using namespace std;

int main(){
int size, size1;
int i, j;
 cout<<"Enter size of rows and columns: "<<endl;
 cin>>size>>size1;
 
 int arr[size][size1];
 int arr1[size][size1];
 cout<<"Enter the elements of matrix: "<<endl;
 
 
 for(int i = 0; i<size; i++){
   for(int j = 0; j<size1; j++){
      cin>>arr[i][j];
      }
    }
    for(int i = 0; i<size; i++){
   for(int j = 0; j<size1; j++){
      cin>>arr1[i][j];
      }
    }
  
  int sum[i][j] = {0};
  for(int i = 0; i<size; i++){
   for(int j = 0; j<size1; j++){
      sum[i][j] = arr[i][j] + arr1[i][j];
      }
    }
    
  cout<<"The sum is: "<<sum[i][j];
  
  return 0;
  }
  

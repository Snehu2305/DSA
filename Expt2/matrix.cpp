#include <iostream>
using namespace std;

int main(){
 int size, size1;
 cout<<"Enter size of rows and columns: "<<endl;
 cin>>size>>size1;
 int arr[size][size1];
 cout<<"Enter the elements of matrix: "<<endl;
 for(int i = 0; i<size; i++){
   for(int j = 0; j<size1; j++){
      cin>>arr[i][j];
      }
    }
    cout<<"The matrix is: "<<endl;
  for(int i = 0; i<size; i++){
   for(int j = 0; j<size1; j++){
      cout<<arr[i][j]<<" ";
      }
      cout<<endl;
    }
    return 0;
  }
 

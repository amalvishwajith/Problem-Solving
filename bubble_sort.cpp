#include<bits/stdc++.h>
using namespace std;

void bubble_sort(int a[],int n){
	for(int i=0;i<n-1;i++){ //sorting upto n-1 as the last element will automatically be swapped
		for(int j=0;j<n-i-1;j++){ //running the check upto n-i-1 as after every iteration of the outter loop the last element
			if(a[j]>a[j+1]){		//gets sorted in its right place.	
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
		// for(int i=0;i<n;i++){
		// 	cout<<a[i]<<" ";
		// }
		// cout<<endl;
	}
}

int main(){
	#ifndef ONLINE_JUDGE 
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
    #endif
	int n;
	cin>>n; //size of the array
	int arr[n];
	for(int i=0;i<n;i++){
		cin>>arr[i];
	}
	cout<<"Array before sorting\n";
	for(int i=0;i<n;i++){
		cout<<arr[i]<<" ";
	}
	// cout<<endl;
	bubble_sort(arr,n);
	cout<<"\nArray after sorting\n";
	for(int i=0;i<n;i++){
		cout<<arr[i]<<" ";
	}
}
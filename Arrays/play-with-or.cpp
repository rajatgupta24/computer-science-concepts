#include <bits/stdc++.h>
using namespace std;

int* game_with_number(int arr[], int n)
{
    int a[n];
    
    for (int i=0;i<n;i++){
        if (i+1 != n)
            a[i] = arr[i] | arr[i+1];
        else 
            a[i] = arr[i];
    }
    
    for (int i=0;i<n;i++)
        arr[i] = a[i];
    
    return arr;
}

int main () {
    int t;
    cin>>t;

    while (t--) {
        int n;
        cin>>n;

        int arr[n];
        for (int i=0;i<n;i++)
            cin>>arr[i];

        int *arr2;

        arr2 = game_with_number(arr, n);

        for (int i=0;i<n;i++)
            cout<<arr2[i]<<" ";

        cout<<endl;
    }
    return 0;
}
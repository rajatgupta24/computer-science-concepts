#include <bits/std/c++.h>
using namespace std;

void rotate(int arr[], int n)
{
    int t = arr[n-1];
    
    for (int i=n-1;i>0;i--)
        arr[i] = arr[i-1];
    
    arr[0] = t;
}

int main ()
{
    int t;
    cin>>t;
    while (t--) {
        int n;
        cin>>n;
        
        int a[n], i;
        for (int i=n-1;i>0;i--)
            cin>>a[i];
        
        rotate (a, n);
        for (int i=n-1;i>0;i--)
            cout<<a[i]<<" ";
        
        cout<<endl;
    }
    return 0;
}
#include <bits/stdc++.h>
using namespace std;

int chocolates(int a[], int n)
{
    int min=a[0];
    for (int i=0;i<n;i++) 
        if (min > a[i])
            min = a[i];
    
    return min;
}

int main () {
    int t;
    cin>>t;
    while (t--) {
        int n;
        cin>>n;

        int a[n];
        for (int i=0;i<n;i++) cin>>a[i];

        cout<<chocolates(a,n)<<endl;
    }
    return 0;
}
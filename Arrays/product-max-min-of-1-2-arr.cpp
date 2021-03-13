#include <bits/stdc++.h>
using namespace std;

long long find_multiplication(int a[], int b[], int n, int m)
{   
    long long int num1=*max_element(a, a+ n);
    long long int num2=*min_element(b, b+ m);
    return num1*num2;
}

int main () {
    int t;
    cin>>t;
    while (t--) {
        int n;
        cin>>n;
        int a[n];
        for (int i=0;i<n;i++)
            cin>>a[i];
        
        int m;
        cin>>m;
        int b[m];
        for (int i=0;i<m;i++)
            cin>>b[i];
        
        cout<<find_multiplication(a,b,n,m)<<endl;
    }
    return 0;
}
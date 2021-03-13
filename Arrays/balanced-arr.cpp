#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int minValueToBalance(int a[], int n)
    {
        int sum1=0, sum2=0;
        for (int i=0;i<n;i++){
            if (i<n/2)
                sum1 += a[i];
            else 
                sum2 += a[i];
        }
        if (sum1>sum2)
            return sum1-sum2;
        else
            return sum2-sum1;
    }
};

int main () {
int t;
    cin>>t;
    while (t--) {
        int n;
        cin>>n;
        int a[n];
        for (int i=0;i<n;i++)
            cin>>a[i];
        Solution obj;
        cout<<obj.minValueToBalance(a,n)<<endl;
    }
    return 0;
}
#include <bits/stdc++.h>
using namespace std;

struct pair {
    long long int max;
    long long int min;
};

struct pair getMinMax(long long int arr[], long long int n) {
    struct pair p;
    long long int max=arr[0], min=arr[0];
    for (long long i=0;i<n;i++){
        if (max < arr[i])
            max = arr[i];
        if (min > arr[i])
            min = arr[i];
    }
    
    p.max = max;
    p.min = min;
    
    return  p;
}

int main () {
    long long t, n, a[100002];
    struct pair minmax;

    cin>>t;
    
    while (t--) {
        cin>>n;
        for(long long i=0;i<n;i++)  cin>>a[i];

        minmax = getMinMax(a, n);

        cout<<minmax.min<<minmax.max;
    }
    return 0;
}
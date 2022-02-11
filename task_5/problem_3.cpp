#include<iostream>
using namespace std;
int main()
{
	int n,k,q;
	cin>>n>>k>>q;
	int arr[n];
	int que[q];
	for(int i=0;i<n;i++)
	{
	  cin>>arr[(k+i)%n];
    }
    for(int i=0;i<q;i++)
    cin>>que[i];
    for(int i=0;i<q;i++)
    {
      cout<<arr[que[i]]<<endl;
    }
    return 0;
}

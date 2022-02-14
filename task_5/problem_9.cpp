#include <bits/stdc++.h>

using namespace std;

int main(){
    int a;
    cin>>a;
    while(a--)
    {
        string s;
        cin>>s;
        int i=0,j=0,count=0;
        
        string p="hackerrank";
        while(i<s.length() && j<p.length())
        {
            
            if(s.at(i)==p.at(j))
            {
                i++;
                j++;
                count+=1;
            }
            else i++;
            
        }
         if(count==p.length()){
             cout<<"YES"<<endl;
            
         }
         else 
         {
         cout<<"NO"<<endl;
         }
    }
}

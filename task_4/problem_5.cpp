#include <bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin >> t;
    while(t--)
    {
       unsigned long long x=0;
       string s;
       cin >> s;
       x = stoul(s);
       unsigned long long count = 0;
       for(int i=0; i<s.size(); i++)
       {
           char c = s[i];
           int y = (int)c - '0';
            if(y==0)
                continue;
            else if(x%y==0)
                count++;
       }
       cout << count << '\n';
    }
}

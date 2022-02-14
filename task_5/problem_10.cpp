

#include<bits/stdc++.h>
using namespace std;
int main()
{
  int x;
  scanf("%d",&x);
  while(x--) {
      int n,k,tm;
      scanf("%d %d",&n,&k);
      list<int> :: iterator ite;
       list<int> y;
      for(int i=0;i<n;++i)
      {
          scanf("%d",&tm);
          y.push_back(tm);
      }
      for(ite=y.begin();ite!=y.end();)
      {
          int tm1=*(y.begin());
          if(k==0)
              break;
          int val=*ite;
          ite++;
          int val1=*ite;
          if(val>=val1)
              continue;
          else
          {
              --ite;
              y.erase(itee);
              int tm2=*ite;
              if(tm1!=tm2)
                  --ite;
              else
                  ite=y.begin();
              k--;
          }
      }
      if(k!=0)
      {
          for(int i=0;i<k;++i)
              y.pop_back();
      }
      for(ite=y.begin();ite!=y.end();++ite)
          printf("%d ",*ite);
          printf("\n");
  }
  return 0;
}

#include <stdio.h>
int main() {
  int n,count;
  scanf("%d",&n);
  for(count=1;count<=(2*n);count++)
  {
    if (count%2==1)
    {
      if(count==(2*n-1))
      {
        printf("%d\n",count);
      }
      else
      {
        printf("%d\n",count);
      }
    }
  }
	//Type your code
	return 0;
}
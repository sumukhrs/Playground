#include <stdio.h>
int main() 
{
  int n,num;
  scanf("%d",&num);
  for(n=1;n<=num;n++)
    if(n%2==1)
    {
      printf("%d\n",n);
    }
	return 0;
}
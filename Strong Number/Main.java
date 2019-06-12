#include <stdio.h>
int main() {
  int n,sum=0,rem,temp,fact,i;
  scanf("%d",&n);
  temp=n;
  while(n!=0)
  {
    rem=n%10;
    fact=1;
    for(i=1;i<=rem;i++)
    {
      fact=fact*i;
    }
    sum=sum+fact;
      n=n/10;
  }
 if(sum==temp)
  {
    printf("Yes");
  }
  else
  {
    printf("No");
  }
	//Type your code
	return 0;
}
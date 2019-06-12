#include <stdio.h>
int main() {
  int n,r,sum=0,temp;
  scanf("%d",&n);
  temp=n;
  while(n!=0)
  {
    r=n%10;
    n=n/10;
    sum=sum+(r*r*r);
  }
  if(sum==temp)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	//Type your code
	return 0;
}
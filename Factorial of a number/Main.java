#include <stdio.h>
int main() {
  int num,i,sum=1;
  scanf("%d",&num);
  for(i=1;i<=num;i++)
  {
    sum=sum*i;
  }
  printf("%d",sum);
	//Type your code
	return 0;
}
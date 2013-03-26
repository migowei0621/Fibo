#include <iostream>
using namespace std;

int fibo(int num){

         if (num==1||num==0)
         {
         	return 1;
         }
         else if(num>1)
         {
         	return fibo(num-1)+fibo(num-2);
         }
         else
         	return 0;
}
int main(int argc, char const *argv[])
{    
	for (int i = 0; i < 20; ++i)
	{
		/* code */
	   cout<<fibo(i)<<endl;
	}
	return 0;
}



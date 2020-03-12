#include <stdio.h>
#define OUTPUT printf("%d\n", i)

int main() {
 int i=0; OUTPUT;

 if (fork()) {
   i+=3; OUTPUT;
 } else {
   wait();
   i+=1; OUTPUT; return(0);
 }
}

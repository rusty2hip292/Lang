#include <stdlib.h>
#include <stdio.h>

// auto generated with ANTLR
struct MyClass {
	int a;
	int b;
	int c;
};
typedef struct MyClass* MyClass;

int main() {

  MyClass a = (MyClass) malloc(sizeof(struct MyClass));

  a->a = 1; a->b = 2; a->c = 3;

  printf("%d %d %d\n", a->a, a->b, a->c);

  return 0;
}

#include <stdlib.h>
#include <stdio.h>
#include <stdint.h>


int main();

// auto generated with ANTLR
struct MyClass {
struct MyClass *this;
int a;
int b;
int c;
int (*print)(const char* fmt, ...);
uint8_t h;
};
typedef struct MyClass* MyClass;
MyClass tempMyClass;

int myprintf(const char* fmt, ...) {
	printf("super secret message, should only print in extreme emergencies!\n");
}

int main() {

  MyClass a = (tempMyClass = (MyClass) malloc(sizeof(struct MyClass)), tempMyClass->this = tempMyClass, tempMyClass->a = 12, tempMyClass->b = 91, tempMyClass->c = 13, tempMyClass->print = printf, tempMyClass->h = 2, tempMyClass);;
  MyClass a2 = (tempMyClass = (MyClass) malloc(sizeof(struct MyClass)), tempMyClass->this = tempMyClass, tempMyClass->a = 12, tempMyClass->b = 91, tempMyClass->c = 13, tempMyClass->print = printf, tempMyClass->h = 2, tempMyClass);;

  a2->b = 19;
  a2->h = (uint8_t) (uint64_t) 259;

  a->print("%d %d %d\n", a->a, a->b, a->h);
  a2->print("%d %d %d\n", a2->a, a2->b, a2->h);
  a2->print = myprintf;
  a2->print("");
  
  printf("%d\n", a == a->this);

  return 0;
}

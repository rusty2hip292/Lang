#include <stdio.h>
#include <stdlib.h>

struct MyType {
	int x;
	int y;
	int z;
};

typedef struct MyType* MyType;


int main() {
	MyType m = (MyType) malloc(sizeof(struct MyType));
	printf("%d %d\n", sizeof(struct MyType), m->x);
}

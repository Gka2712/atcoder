#include <stdio.h>
#include <stdlib.h>

#define MAX_SIZE 100

// スタックのデータ構造
typedef struct {
    int items[MAX_SIZE];
    int top;
} Stack;

// スタックの初期化
void initialize(Stack *s) {
    s->top = -1;
}

// スタックが空かどうかをチェック
int isEmpty(Stack *s) {
    return s->top == -1;
}

// スタックが満杯かどうかをチェック
int isFull(Stack *s) {
    return s->top == MAX_SIZE - 1;
}

// スタックに要素をプッシュ
void push(Stack *s, int value) {
    if (isFull(s)) {
        printf("Stack overflow\n");
        return;
    }
    s->items[++(s->top)] = value;
}

// スタックから要素をポップ
int pop(Stack *s) {
    if (isEmpty(s)) {
        printf("Stack underflow\n");
        exit(1);
    }
    return s->items[(s->top)--];
}

// スタックの一番上の要素を取得
int peek(Stack *s) {
    if (isEmpty(s)) {
        printf("Stack is empty\n");
        exit(1);
    }
    return s->items[s->top];
}

int main() {
    Stack stack;
    initialize(&stack);

    push(&stack, 1);
    push(&stack, 2);
    push(&stack, 3);

    printf("Top element: %d\n", peek(&stack));

    pop(&stack);
    printf("Top element after pop: %d\n", peek(&stack));

    return 0;
}

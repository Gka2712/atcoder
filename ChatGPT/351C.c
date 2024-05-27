/*
問題文
空の列と、N 個のボールがあります。i 個目 (1≤i≤N) のボールの大きさは 2 のA i 乗です。
これから 
N 回の操作を行います。
i 回目の操作では、i 個目のボールを列の一番右に付け加えた後、次の手順を繰り返します。
列にあるボールが 
1 つ以下ならば操作を終了する。
列にあるボールのうち右から 
1 番目のものと 2 番目のものの大きさが 異なる ならば操作を終了する。
列にあるボールのうち右から 1 番目のものと 2 番目のものの大きさが 等しい ならば、
2 つのボールを取り除き、「取り除かれた 2 つのボールの大きさの和」の大きさのボール 1 つを列の一番右に付け加える。その後、1. に戻り、手順を繰り返す。
N回の操作の後で、列にあるボールの数を求めてください。
制約
1≤N≤2×(10 の5乗)
0≤A i ≤10 の9乗
入力はすべて整数
入力
入力は以下の形式で標準入力から与えられる。
N
A1,A2,・・・・・・・・・・An
*/
#include <stdio.h>

int main() {
    int N;
    scanf("%d", &N);

    long long balls[N];
    for (int i = 0; i < N; i++) {
        scanf("%lld", &balls[i]);
    }

    int count = 0; // ボールの数をカウントする変数
    for (int i = 0; i < N; i++) {
        // ボールの大きさが2^iの倍数でない場合は、操作を終了する
        if (balls[i] % 2 != 0) {
            break;
        }
        // ボールの数を増やす
        count++;
    }

    printf("%d\n", count);

    return 0;
}
/*
1回目: 上の問題をChatGPTに解かせ、コードを生成。　結果：不正解
2回目: 修正して正解
#include <stdio.h>
#include <stdlib.h>

// スタックのデータ構造
typedef struct Node {
  int data;
  struct Node *next;
} Node;

typedef struct {
  Node *top;
  int size;
} Stack;

// スタックの初期化
void initialize(Stack *s) {
  s->top = NULL;
  s->size = 0;
}
// スタックが空かどうかをチェック
int isEmpty(Stack *s) { return s->top == NULL; }

// スタックに要素をプッシュ
void push(Stack *stack, int value) {
  Node *newNode = (Node *)malloc(sizeof(Node));
  if (newNode == NULL) {
    printf("Memory allocation failed\n");
    exit(1);
  }
  newNode->data = value;
  newNode->next = stack->top;
  stack->top = newNode;
  stack->size++;
}

// スタックから要素をポップ
int pop(Stack *stack) {
  if (isEmpty(stack)) {
    printf("Stack underflow\n");
    return -10;
  }
  int data = stack->top->data;
  Node *temp = stack->top;
  stack->top = stack->top->next;
  free(temp);
  stack->size--;
  return data;
}

// スタックの一番上の要素を取得
int peek(Stack *s) {
  if (isEmpty(s)) {
    printf("Stack is empty\n");
    return -20;
  }
  return s->top->data;
}
int main() {
  Stack stack;
  int N, i;
  int num1, num2;
  scanf("%d", &N);
  int A[N];
  for (i = 0; i < N; i++) {
    scanf("%d", &A[i]);
  }
  initialize(&stack);
  for (i = 0; i < N; i++) {
    push(&stack, A[i]);
    while (stack.size > 1) {
      num1 = pop(&stack);
      num2 = pop(&stack);
      if (num1 == num2) {
        push(&stack, num1 + 1);
      } else {
        push(&stack, num2);
        push(&stack, num1);
        break;
      }
    }
  }
  printf("%d", stack.size);
  return 0;
}
原因
操作終了条件のところで、ボールの大きさが1番目と2番目のボールの大きさが異なる時に操作を終了する所をボールの大きさが2の累乗の倍数でない時に終了するという間違った認識をしている場合。
*/
コード生成要件
・このコードをC言語で作ってください。
・問題の内容を以下にまとめます。
N人の巨人がいます。巨人にはそれぞれ1,2,・・・・Nの名前がついており、巨人iが地面に立った時、肩の高さはAi、頭の高さはBiとなる。
あなたは(1,2,・・・N)を並べ替えて得られる数列(P1,P2,・・・PN)を選び、以下の規則に従ってN人の巨人を積み上げることができます。
・まず地面に巨人P1を立たせる。巨人P1の肩は地面を基準としてA(P1)、頭は地面を基準として、B(P2)の高さとなる。
i=1,2,・・・・,N-1の順に巨人P(i)の肩の上に巨人P(i+1)を立たせる。
巨人P(i)の方が地面を基準として高さtの時、巨人P(i+1)の肩は地面を基準としてt+A(P+1)、頭は地面を基準としてt+B(P+1)の高さとなる。
上に立っている巨人、すなわち巨人P(N)の地面を基準とした頭の高さとして実現できる最大値を求めてください。
・次に問題の制約を以下にまとめます。
2<=N<=2×(10の5乗)
1<=A(i)<=B(i)<=(10の9乗)
入力される値は全て整数。
入力フォーマット
入力は以下の形式で標準入力が与えられる。
N
A1,B1
A2,B2
・
・
・
・
A(N),B(N)
1行目に巨人の数Nを入力。
N行、それぞれA(N),B(N)の値を入力
出力フォーマット
答えを出力せよ
では問題を解き、コードを生成してください。
#include <stdio.h>
#include <stdlib.h>

// 比較関数
int compare(const void *a, const void *b) {
    return (*(int *)b - *(int *)a);
}

int main() {
    int N;
    scanf("%d", &N);
    long result=0;
    // AとBの値を配列に格納
    long long int A[N], B[N];
    for (int i = 0; i < N; i++) {
        scanf("%lld %lld", &A[i], &B[i]);
    }

    // 頭の高さの最大値を求める
    long long int maxHeight = B[0];
    long long int currentHeight = maxHeight;
    for (int i = 1; i < N; i++) {
        currentHeight = B[i]-A[i];
        if (currentHeight > maxHeight) {
            maxHeight = currentHeight;
        }
        result+=A[i];
    }
    result+=maxheight;
    printf("%lld\n", result);

    return 0;
}
/*
不正解
#include <stdio.h>
#include <stdlib.h>
int main() {
  int N;
  scanf("%d", &N);
  long result = 0;
  // AとBの値を配列に格納
  long long int A[N], B[N];
  for (int i = 0; i < N; i++) {
    scanf("%lld %lld", &A[i], &B[i]);
  }

  // 頭の高さの最大値を求める
  long long int maxHeight = 0;
  long long int currentHeight = 0;
  for (int i = 0; i < N; i++) {
    currentHeight = B[i] - A[i];
    if (currentHeight > maxHeight) {
      maxHeight = currentHeight;
    }
    result += A[i];
  }
  result += maxHeight;
  printf("%ld\n", result);

  return 0;
}
*/
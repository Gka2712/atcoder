/*
問題文
N 人の巨人がいます。巨人にはそれぞれ 
1,2,…,N の名前がついており、巨人 
i が地面に立ったとき、肩の高さは 
A 
i
​
 、頭の高さは 
B 
i
​
  となります。

あなたは 
(1,2,…,N) を並べ替えて得られる数列 
(P 
1
​
 ,P 
2
​
 ,…,P 
N
​
 ) を選び、以下の規則に従って 
N 人の巨人を積み上げることができます。

まず地面に巨人 
P 
1
​
  を立たせる。巨人 
P 
1
​
  の肩は地面を基準として 
A 
P 
1
​
 
​
 、頭は地面を基準として 
B 
P 
1
​
 
​
  の高さとなる。

i=1,2,…,N−1 の順に巨人 
P 
i
​
  の肩の上に巨人 
P 
i+1
​
  を立たせる。巨人 
P 
i
​
  の肩が地面を基準として高さ 
t のとき、巨人 
P 
i+1
​
  の肩は地面を基準として 
t+A 
P 
i+1
​
 
​
 、頭は地面を基準として 
t+B 
P 
i+1
​
 
​
  の高さとなる。

一番上に立っている巨人、すなわち巨人 
P 
N
​
  の地面を基準とした頭の高さとして実現できる最大値を求めてください。

制約
2≤N≤2×10 の5乗
 
1≤A ≤B ≤10 の9乗
 
入力される値はすべて整数
入力
入力は以下の形式で標準入力から与えられる。
N
A 1
B 1
A 2
B 2
⋮
A N
B N
出力
答えを出力せよ。
*/
#include <stdio.h>
#include <stdlib.h>

// 比較関数
int compare(const void *a, const void *b) {
    // 頭の高い順にソートする
    return *((int*)b + 1) - *((int*)a + 1);
}

int main() {
    int N;
    scanf("%d", &N);
    int current_height=0;
    int result=0;
    int giants[N][2]; // 各巨人の肩の高さと頭の高さを格納する配列

    // 各巨人の情報を入力
    for (int i = 0; i < N; i++) {
        scanf("%d %d", &giants[i][0], &giants[i][1]);
    }

     // 最大の積み上げの高さ

    // 各巨人を積み上げていく
    for (int i = 1; i < N; i++) {
        current_height=giants[i][1]-giants[i][0];
        if (current_height > max_height) { // 最大の積み上げの高さを更新
            max_height = current_height;
        }
        result+=giants[i][0];
    }
  result+=max_height
    printf("%lld\n", result);

    return 0;
}
/*
1回目:上の問題をChatGPTに解かせ、コードを生成。　結果：不正解
2回目:誤り修正中
生成AIが作ったコード
頭の高さが高い巨人の背の高さ(ここでは、頭の高さと肩の高さの合計。問題の意図とは異なる。)を足し、肩の高さを足していた。

考察:
問題文の意図の理解に漏れがある可能性。
*/
コード生成要件
・このコードをC言語で作ってください。
・問題の内容を以下にまとめます。
鉄道のAtcoder線にはN個の駅があり、それぞれ1,2,・・・・Nの番号がついてある。
Atcoder線では、駅1を始発駅として駅2,3,・・・Nの順に各駅に停車する上り列車と駅Nを始発駅として駅N-1,N-2の順に各駅に停車する下り列車が運行されている。
高橋君はAtcoder線の上り列車あるいは下り列車の一方のみを使うことで駅Xから駅Yまで移動しようとしています。この移動の間に高橋君が乗っている電車が駅Zに停車することがあるか判定してください
・次に問題の制約を以下にまとめます。
3<=N<=100
1<=X,Y,Z<=N
X,Y,Zは異なる文字
入力される値は全て整数
入力フォーマット
入力は以下の形式で標準入力が与えられる。
N X Y Z
一行目でN,X,Y,Zを入力する。
出力フォーマット
駅Xから駅Yへの移動の間に高橋君が乗っている電車が駅Zに停車することがあるならばYesを、そうでないならばNoを出力せよ

では、以下の問題を解いてください。
#include <stdio.h>

int main() {
    int N, X, Y, Z;
    scanf("%d %d %d %d", &N, &X, &Y, &Z);

    // 上り列車の移動
    int i;
    for (i = X; i < Y; i++) {
        if (i == Z) {
            printf("Yes\n");
            return 0;
        }
    }

    // 下り列車の移動
    for (i = Y; i < X; i++) {
        if (i == Z) {
            printf("Yes\n");
            return 0;
        }
    }

    printf("No\n");
    return 0;
}
/*
正解
*/
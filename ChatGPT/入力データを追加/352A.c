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
処理例
入力で「7 6 1 3」が与えられたとします。
これは駅が駅1~駅7まであり、高橋君は、駅6から駅1へ移動します。
駅6を出発し、駅5,4,3,2,1の順に停車するため移動の間に電車が駅3に停車することがあるため、Yesを出力します。
では、以下の問題を解いてください。
不正解
#include <stdio.h>

int main() {
    int N, X, Y, Z;
    scanf("%d %d %d %d", &N, &X, &Y, &Z);

    // 上り列車の移動範囲
    int up_start = 1;
    int up_end = N;
    // 下り列車の移動範囲
    int down_start = N;
    int down_end = 1;

    // 駅Zが上り列車の途中にあるかどうかを判定
    int z_on_up_train = (Z >= up_start && Z <= X);
    // 駅Zが下り列車の途中にあるかどうかを判定
    int z_on_down_train = (Z <= down_start && Z >= X);

    // 駅Zがどちらかの列車の途中にある場合はYesを出力、そうでない場合はNoを出力
    if ((X < Y && z_on_up_train) || (X > Y && z_on_down_train)) {
        printf("Yes\n");
    } else {
        printf("No\n");
    }

    return 0;
}
/*
不正解
処理のミス
処理例に引っ張られてしまった可能性あり。
*/

/*
問題文
鉄道の AtCoder 線には 
N 個の駅があり、それぞれ 
1,2,…,N の番号が付けられています。

AtCoder 線では、駅 
1 を始発駅として駅 
2,3,…,N の順に各駅に停車する上り列車および、駅 
N を始発駅として駅 
N−1,N−2,…,1 の順に各駅に停車する下り列車が運行されています。

高橋君は AtCoder 線の上り列車あるいは下り列車の一方のみを使うことで駅 
X から駅 
Y まで移動しようとしています。

この移動の間に高橋君が乗っている電車が駅 
Z に停車することがあるか判定してください。

制約
3≤N≤100
1≤X,Y,Z≤N
X,Y,Z は相異なる
入力される値はすべて整数
入力
入力は以下の形式で標準入力から与えられる。

N 
X 
Y 
Z
出力
駅 
X から駅 
Y への移動の間に高橋君が乗っている電車が駅 
Z に停車することがあるならば Yes を、そうでないならば No を出力せよ。
この問題をCで解いてください

*/
#include <stdio.h>

int main() {
    int N, X, Y, Z;
    scanf("%d %d %d %d", &N, &X, &Y, &Z);

    // 上り列車がZに停車するかどうか
    int up_stop = 0;
    if (X < Y && Z > X && Z < Y) {
        up_stop = 1;
    }

    // 下り列車がZに停車するかどうか
    int down_stop = 0;
    if (X > Y && Z > Y && Z < X) {
        down_stop = 1;
    }

    if (up_stop || down_stop) {
        printf("Yes\n");
    } else {
        printf("No\n");
    }

    return 0;
}
/*
1回目: 上の問題をChatGPTに解かせ、コードを生成。　結果：正解
*/
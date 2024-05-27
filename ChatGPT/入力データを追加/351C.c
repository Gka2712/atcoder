コード生成要件
・このコードをC言語で作ってください。
・問題の内容を以下にまとめます。
空の列とN個のボールがあります。i個のボールがあります。i個目(1<=i<=N)のボールの大kさは2のAi乗です。
これからN回の操作を行います。i回目の操作では、i個目のボールを列の1番右に付け加えた後、次の手順を繰り返します。
1.列にあるボールが1つ以下ならば操作を終了する。
2.列にあるボールのうち、右から1番目のものと2番目のものの大きさが異なるならば操作を終了する。
3.列にあるボールのうち、右から1番目のものと2番目のものの大きさが等しいならば、2つのボールを取り除き、「取り除かれた2つのボールの大きさの和」の大きさのボール一つを列の1番右に付け加える。その後、1に戻り、手順を繰り返す。
N回の操作の後で、列にあるボールの数を求めてください。
次に問題の制約を以下にまとめます。
1<=N<=2×(10の5乗)
0<=Ai<=10の9乗
入力は全て整数
・入力フォーマット
入力は以下の形式で標準入力から与えられる。
N
A1 A2・・・・・AN
1行目で操作を行う回数Nを入力、2行目でボールの大きさを入力する。
・出力フォーマット
N回の操作の後で、列にあるボールの数を出力せよ。
処理例
1行目で7、2行目で「2 1 1 3 5 3 3」が出たとする。
操作を以下のように行われる。
1回目　1番目の4(2の2乗)のボールを列の1番右に付け加えた後、列にあるボールは1つで大きさは4(2の2乗)。列にあるボールが1つしかないので、操作を終了する。
2回目　2番目の2(2の1乗)のボールを列の1番右に付け加えた後、列にあるボールは2つであり大きさは、4(2の2乗)と2(2の1乗)であり、右から1番目と2番目のボールの大きさが異なるので操作を終了する。
3回目　3番目の2(2の1乗)のボールを列の1番右に付け加えた後、列にあるボールは、3つであり、大きさは、4(2の2乗)と2(2の1乗)と2(2の1乗)であり、右から1番目と2番目のボールの大きさが等しいので、2つのボールを取り除き、取り除かれた2つのボールの大きさの和(2(2の1乗)×2(2の1乗)=4)を列の右側に追加する。
　　　　列のボールは2つあり、大きさは、4(2の2乗)と4(2の2乗)であり、右から1番目と2番目のボールの大きさが等しいので、2つのボールを取り除き、取り除かれた2つのボールの大きさの和(4(2の2乗))×(4(2の2乗))を列の右側に追加する。
　　　　列のボールは一つであるため、ここで3回目の操作を終了する。大きさは、8(2の3乗)である。
4回目　4番目の8(2の3乗)のボールを列の1番右に付け加えた後、列にあるボールは、2つであり、大きさは、8(2の3乗)と8(2の3乗)であり、右から1番目と2番目のボールの大きさが等しいので、2つのボールを取り除き、取り除かれた2つのボールの大きさの和(8(2の3乗)×8(2の3乗)=16)を列の右側に追加する。
　　　　列のボールは一つであるため、ここで4回目の操作を終了する。大きさは、16(2の4乗)である。
5回目  5番目の32(2の5乗)のボールを列の1番右に付け加えた後、列にあるボールは、2つであり、大きさは、16(2の4乗)と32(2の5乗)であり、右から1番目と2番目のボールの大きさが異なるので、操作を終了する。
6回目　6番目の8(2の3乗)のボールを列の1番右に付け加えた後、列にあるボールは、3つであり、大きさは、16(2の4乗)と32(2の5乗)と8(2の3乗)であり、右から1番目と2番目のボールの大きさが異なるので、操作を終了する。
7回目  7番目の8(2の3乗)のボールを列の1番右に付け加えた後、列にあるボールは、4つであり、大きさは、16(2の4乗)と32(2の5乗)と8(2の3乗)と8(2の3乗)であり、右から1番目と2番目のボールの大きさが等しいので、2つのボールを取り除き、取り除かれた2つのボールの大きさの和(8(2の3乗)×8(2の3乗)=16)を列の右側に追加する。
       列のボールは、3つであり、大きさは、16(2の4乗)と32(2の5乗)と16(2の4乗)であり、右から1番目と2番目のボールの大きさが異なるので、操作を終了する。
よって最後に列にあるボールの数である3を出力します。
では問題をとき、コードを生成してください
実行時エラー
#include <stdio.h>

int main() {
    int N;
    scanf("%d", &N);

    long long ball_sizes[100001]; // ボールの大きさを格納する配列
    for (int i = 0; i < N; ++i) {
        scanf("%lld", &ball_sizes[i]);
    }

    int ball_count = 0; // ボールの数
    for (int i = N - 1; i >= 0; --i) {
        if (ball_count == 0) { // 列にボールが1つもない場合はボールを追加
            ++ball_count;
        } else if (ball_count >= 2 && ball_sizes[i] == ball_sizes[i + 1]) { // 右端とその1つ左のボールの大きさが等しい場合
            ball_sizes[i] *= 2; // 2つのボールを取り除き、その和の大きさのボールを追加
            --ball_count; // 取り除いた分ボールの数を減らす
        } else {
            ++ball_count; // ボールを追加
        }
    }

    printf("%d\n", ball_count);

    return 0;
}
/*
理解漏れ?処理ミス
ポイント
N回新しいボールを追加するか、二つボールを取り除き、その和の大きさのボールを追加する処理になっている。
取り除いた二つのボールの大きさが等しい場合には、その2つのボールを取り除き、その和の大きさのボールを追加する処理が必要になるが、その後は、操作は終了しないようにしなければならない。
*/
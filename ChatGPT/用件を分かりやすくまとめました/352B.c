コード生成要件
・このコードをC言語で作ってください。
・問題の内容を以下にまとめます。
高橋君は英小文字からなる文字列Sをキーボードで入力しようとしていました。
高橋君は画面を見ずにキーボードだけを見てタイピングをしていました。
誤って別の詠唱文字を入力してしまった時にはその直後にバックスペースキーを押しましたが、バックスペースキーが壊れていたため誤って入力された文字は消去されず、実際に入力された文字列はTとなりました。Tのうち、高橋君が誤って入力した文字でないものを正しく入力された文字であると定めます。
正しく入力された文字がTの何文字目であるか答えてください。
・次に問題の制約を以下にまとめます。
S,Tは長さ1以上2×(10の5乗)以下の英小文字から成る文字列
Tは問題文中の手続きにより得られる文字列
入力フォーマット
入力は以下の形式で標準入力が与えられる。
S
T
一行目で文字列Sを入力、その後文字列Tを入力。
出力フォーマット
Sの長さを|S|として、正しく入力された文字がA1,A2,・・・・・,A|S|文字目である時A1,A2,・・・・A|S|の値をこの順に空白区切りで出力せよ。
ただし各々1<=i<=|S|-1に対してAi<A(i+1)を満たすようにせよ。
では問題を解き、コードを生成してください。
#include <stdio.h>
#include <string.h>

int main() {
    char S[200001], T[200001];
    scanf("%s %s", S, T);

    int lenS = strlen(S);
    int lenT = strlen(T);

    // Tの文字が正しく入力された文字列Sの何文字目かを格納する配列
    int correctIdx[lenT];
    memset(correctIdx, 0, sizeof(correctIdx));

    // Tの文字が正しく入力された文字列Sの何文字目かを求める
    int sIndex = 0, tIndex = 0;
    while (sIndex < lenS && tIndex < lenT) {
        if (S[sIndex] == T[tIndex]) {
            correctIdx[tIndex] = sIndex + 1; // 1-indexedで格納
            tIndex++;
        }
        sIndex++;
    }

    // 結果を出力
    for (int i = 0; i < lenT; i++) {
        printf("%d ", correctIdx[i]);
    }
    printf("\n");

    return 0;
}
/*
不正解
正解コード
#include <stdio.h>
#include <string.h>

int main() {
  char S[200001], T[200001];
  scanf("%s %s", S, T);

  int lenS = strlen(S);
  int lenT = strlen(T);

  // Tの文字が正しく入力された文字列Sの何文字目かを格納する配列
  int correctIdx[lenT];
  memset(correctIdx, 0, sizeof(correctIdx));

  // Tの文字が正しく入力された文字列Sの何文字目かを求める
  int sIndex = 0, tIndex = 0;
  while (sIndex < lenS && tIndex < lenT) {
    if (S[sIndex] == T[tIndex]) {
      correctIdx[sIndex] = tIndex + 1; // 1-indexedで格納
      sIndex++;
    }
    tIndex++;
  }

  // 結果を出力
  for (int i = 0; i < lenS; i++) {
    printf("%d ", correctIdx[i]);
  }
  printf("\n");

  return 0;
}
処理の流れミス?
不正解プログラムでは、文字列Tが一致しているSの位置をSの文字列の長さ分表示するプログラムになっていた。
正しくは、文字列Sが一致しているTの位置を表示するプログラムである。
*/

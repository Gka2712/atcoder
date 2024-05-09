/*
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

    int giants[N][2]; // 各巨人の肩の高さと頭の高さを格納する配列

    // 各巨人の情報を入力
    for (int i = 0; i < N; i++) {
        scanf("%d %d", &giants[i][0], &giants[i][1]);
    }

    // 頭の高い順にソート
    qsort(giants, N, sizeof(giants[0]), compare);

    long long current_height = giants[0][0] + giants[0][1]; // 現在の積み上げの高さ
    long long max_height = current_height; // 最大の積み上げの高さ

    // 各巨人を積み上げていく
    for (int i = 1; i < N; i++) {
        current_height += giants[i][0]; // 肩の高さを加算
        if (current_height < giants[i][1]) { // 頭の高さを加算
            current_height = giants[i][1];
        }
        if (current_height > max_height) { // 最大の積み上げの高さを更新
            max_height = current_height;
        }
    }

    printf("%lld\n", max_height);

    return 0;
}

*/
#include <stdio.h>

int main() {
    int A[9], B[8];
    int i, j;
    
    // チーム高橋の得点を入力
    for (i = 0; i < 9; i++) {
        scanf("%d", &A[i]);
    }
    
    // チーム青木の得点を入力
    for (j = 0; j < 8; j++) {
        scanf("%d", &B[j]);
    }
    
    // チーム高橋の合計得点とチーム青木の合計得点を計算
    int total_A = 0, total_B = 0;
    for (i = 0; i < 9; i++) {
        total_A += A[i];
    }
    for (j = 0; j < 8; j++) {
        total_B += B[j];
    }
    
    // 9回表の得点が9回裏の得点以上であれば、チーム青木が勝つために必要な最低得点を計算
    if (total_A >= total_B) {
        printf("0\n"); // 既にチーム高橋が勝っているので、チーム青木が得点を取らなくてもよい
    } else {
        int required_score = total_B - total_A; // チーム青木が必要とする得点
        printf("%d\n", required_score); // チーム青木が勝つために必要な得点を出力
    }
    
    return 0;
}
/*
1回目:上の問題をChatGPTに解かせ、コードを生成。結果　不正解
2回目:

原因
コメントで「素手にチーム高橋が勝っているのでチーム青木が得点を取らなくてもよい」とあった。
問題の意図に沿わないプログラムになってしまっていることがわかる。
*/
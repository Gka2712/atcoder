#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAXN 100000
#define MAXW 100000

// 入力
int N;
int A[MAXN];
int W[MAXN];

// 各箱に対する荷物の状況を管理
int boxContent[MAXN + 1];
int boxNeed[MAXN + 1];
long long totalCost = 0;

int compare(const void *a, const void *b) {
    return W[*(int*)a] - W[*(int*)b];
}

int main() {
    scanf("%d", &N);
    for (int i = 0; i < N; i++) {
        scanf("%d", &A[i]);
        boxContent[A[i]]++;
    }
    for (int i = 0; i < N; i++) {
        scanf("%d", &W[i]);
    }

    // 必要な箱の数を計算
    for (int i = 1; i <= N; i++) {
        if (boxContent[i] > 1) {
            boxNeed[i] = 0;
        } else if (boxContent[i] == 0) {
            boxNeed[i] = 1;
        }
    }

    // 重さに基づいて荷物をソート
    int indices[MAXN];
    for (int i = 0; i < N; i++) {
        indices[i] = i;
    }
    qsort(indices, N, sizeof(int), compare);

    // 現在の荷物の位置から必要な位置へ移動
    for (int i = 0; i < N; i++) {
        int idx = indices[i];
        if (boxContent[A[idx]] > 1 && boxNeed[A[idx]] == 0) {
            // 荷物を移動させる
            boxContent[A[idx]]--;
            for (int j = 1; j <= N; j++) {
                if (boxNeed[j]) {
                    boxNeed[j] = 0;
                    boxContent[j] = 1;
                    totalCost += W[idx];
                    break;
                }
            }
        }
    }

    printf("%lld\n", totalCost);
    return 0;
}

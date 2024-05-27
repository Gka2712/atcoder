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
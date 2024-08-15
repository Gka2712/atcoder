#include <stdio.h>
#include <stdlib.h>

typedef long long ll;

// 構造体で蟻を表現します。
typedef struct {
    ll position;
    int direction;
} Ant;

// 比較関数（qsort用）
int compare(const void *a, const void *b) {
    Ant *antA = (Ant *)a;
    Ant *antB = (Ant *)b;
    if (antA->position < antB->position) return -1;
    if (antA->position > antB->position) return 1;
    return 0;
}

int main() {
    int N;
    ll T;
    scanf("%d %lld", &N, &T);
    
    char *S = malloc(N + 1);
    scanf("%s", S);
    
    Ant *ants = malloc(sizeof(Ant) * N);
    
    for (int i = 0; i < N; i++) {
        scanf("%lld", &ants[i].position);
        ants[i].direction = S[i] == '1' ? 1 : -1;
    }
    
    // 座標に基づいて蟻をソート
    qsort(ants, N, sizeof(Ant), compare);
    
    ll count = 0;
    int i, j;
    
    // 各蟻に対して、その右にある蟻が左を向いているか確認
    for (i = 0; i < N; i++) {
        if (ants[i].direction == 1) {  // 蟻iが右向きの場合
            for (j = i + 1; j < N; j++) {
                if (ants[j].direction == -1) {
                    // (ants[j].position - ants[i].position) / 2 <= T 判定
                    if ((ants[j].position - ants[i].position) <= 2 * T) {
                        count++;
                    }
                }
            }
        }
    }
    
    printf("%lld\n", count);
    
    free(S);
    free(ants);
    return 0;
}

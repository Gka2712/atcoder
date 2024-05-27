/*
H行W列のマス目があり、いくつかのマスには磁石が置かれています。
マス目の状態はH個の長さWの文字列S(1),S(2),・・・・S(H)が表され、S(i)のj文字目が#の時上からi行目かつ左からj列目のマスには磁石が置かれていることを.の時何も置かれていないことを表します。
高橋君は鉄の鎧を着ており、あるマスにいるとき次のように移動することができます。
・現在いるマスの上下左右に隣り合うマスのいずれかに磁石が置かれているとき、どこへも移動することができない
・そうでないとき、上下左右に隣り合うマスのいずれかを選んでそのマスに移動することができる。
ただし、マス目の外に移動することはできない
磁石が置かれていない各マスについて、そのマスの自由度を、「最初高橋くんがそのマスにいるとき、そこから移動を繰り返して到達できるマスの個数」として定義します。 マス目のうち磁石が置かれていないマスの中における、マスの自由度の最大値を求めてください。

ただし、自由度の定義において、「移動を繰り返して到達できるマス」とは、最初にいるマスからそのマスまで移動を繰り返して到達する方法（
1 回も移動しないものも含む）が 
1 つ以上存在するようなマスのことであり、 最初のマスから始めてすべてのそのようなマスを巡るような移動方法が存在する必要はありません。特に（磁石の置かれていない）各マス自身は、そのマスから「移動を繰り返して到達できるマス」につねに含まれることに注意してください。
制約
1<=H,W<=1000
H,Wは整数
S(i)は、.と#のみからなる長さWの文字列
磁石の置かれていないマスが少なくとも存在する。
入力
入力は以下の形式で標準入力から与えられる。
H W
S(1)
S(2)
・
・
・
S(H)
出力
マス目のうち磁石が置かれていないマスの中における、マスの自由度の最大値を出力せよ。
この上の問題をC言語で作成してください。
*/
#include <stdio.h>
#include <stdlib.h>

#define MAX 1000

int H, W;
char grid[MAX][MAX];
int visited[MAX][MAX];
int maxFreedom = 0;

// 四方向移動の定義
int dx[] = {0, 0, 1, -1};
int dy[] = {1, -1, 0, 0};

void initializeVisited() {
    for (int i = 0; i < H; i++) {
        for (int j = 0; j < W; j++) {
            visited[i][j] = 0;
        }
    }
}

int isInBounds(int x, int y) {
    return x >= 0 && x < H && y >= 0 && y < W;
}

int isFreeToMove(int x, int y) {
    for (int i = 0; i < 4; i++) {
        int nx = x + dx[i];
        int ny = y + dy[i];
        if (isInBounds(nx, ny) && grid[nx][ny] == '#') {
            return 0;
        }
    }
    return 1;
}

int dfs(int x, int y) {
    visited[x][y] = 1;
    int count = 1;

    for (int i = 0; i < 4; i++) {
        int nx = x + dx[i];
        int ny = y + dy[i];
        if (isInBounds(nx, ny) && grid[nx][ny] == '.' && !visited[nx][ny] && isFreeToMove(nx, ny)) {
            count += dfs(nx, ny);
        }
    }
    return count;
}

int main() {
    scanf("%d %d", &H, &W);
    for (int i = 0; i < H; i++) {
        scanf("%s", grid[i]);
    }

    for (int i = 0; i < H; i++) {
        for (int j = 0; j < W; j++) {
            if (grid[i][j] == '.' && !visited[i][j]) {
                if (isFreeToMove(i, j)) {
                    initializeVisited();
                    int freedom = dfs(i, j);
                    if (freedom > maxFreedom) {
                        maxFreedom = freedom;
                    }
                }
            }
        }
    }

    printf("%d\n", maxFreedom);

    return 0;
//AI generated
}
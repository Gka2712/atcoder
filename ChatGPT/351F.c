/*
座標平面上にN個の点P(1),点P(2)・・・・P(N)があり、点P(i)の座標は(X(i),Y(i))です。
二つの点A,Bの距離dist(A,B)を次のように定義します。
最初ウサギが点Aにいる。
(x,y)にいるウサギは、(x+1,y+1),(x+1,y−1),(x−1,y+1), (x−1,y−1) のいずれかに1回のジャンプで移動することができる。
点A から点Bまで移動するために必要なジャンプの回数の最小値を dist(A,B) として定義する。
ただし、何度ジャンプを繰り返しても点A から点B まで移動できないとき、dist(A,B)=0 とする。
Σi=1,N-1(Σj=i+1,N(dist(P(i),P(j))))を求めてください。
制約
2<=N<=2×(10の5乗)
0<=X(i),Y(i)<=10の8乗
i=jでなければ(X(i),Y(i))=(X(j),Y(j))ではない。
入力は全て整数。
入力
入力は以下の形式で標準入力で与えられる。
N
X(1) Y(1)
X(2) Y(2)
X(3) Y(3)
・
・
・
・
X(N) Y(N)

出力
Σi=1,N-1(Σj=i+1,N(dist(P(i),P(j))))の値を整数で出力せよ
この上の問題をC言語で作成してください
*/
void initializeVisited() {
    for (int i = 0; i < H; i++) {
        for (int j = 0; j < W; j++) {
            visited[i][j] = 0;  // すべてのマスを未訪問として初期化
        }
    }
}

int dfs(int x, int y) {
    visited[x][y] = 1;  // 現在のマスを訪問済みに設定
    int count = 1;

    for (int i = 0; i < 4; i++) {
        int nx = x + dx[i];
        int ny = y + dy[i];
        if (isInBounds(nx, ny) && grid[nx][ny] == '.' && !visited[nx][ny] && isFreeToMove(nx, ny)) {
            count += dfs(nx, ny);  // 隣接するマスを再帰的に訪問
        }
    }
    return count;
}

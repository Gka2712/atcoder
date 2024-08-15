#include <stdio.h>
#include <string.h>

int main() {
    char S[4]; // SにはR, M, Sが含まれるため、長さは3文字 + NULL文字
    scanf("%s", S); // ユーザーからの入力を受け取る

    int r_position = -1, m_position = -1;
    for (int i = 0; i < 3; i++) {
        if (S[i] == 'R') {
            r_position = i;
        } else if (S[i] == 'M') {
            m_position = i;
        }
    }

    if (r_position < m_position) {
        printf("Yes\n");
    } else {
        printf("No\n");
    }

    return 0;
}

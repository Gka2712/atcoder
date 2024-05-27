#include <stdio.h>
#include <string.h>

int main() {
    char S[7];
    scanf("%s", S);
    
    // Sの先頭3文字が"ABC"であり、末尾3文字が数字かどうかを確認
    if (strncmp(S, "ABC", 3) == 0 && strlen(S) == 6) {
        int num = 0;
        for (int i = 3; i < 6; ++i) {
            if (S[i] >= '0' && S[i] <= '9') {
                num = num * 10 + (S[i] - '0');
            } else {
                printf("No\n");
                return 0;
            }
        }
        
        // ABC001からABC349までの範囲にnumが含まれているかどうかを確認
        if (num >= 1 && num <= 349 && num != 316) {
            printf("Yes\n");
        } else {
            printf("No\n");
        }
    } else {
        printf("No\n");
    }
    
    return 0;
}

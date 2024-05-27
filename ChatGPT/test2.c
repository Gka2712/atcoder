#include <stdio.h>
#include <stdlib.h>
int main() {
  int N;
  scanf("%d", &N);
  long result = 0;
  long long int A[N], B[N];
  for (int i = 0; i < N; i++) {
    scanf("%lld %lld", &A[i], &B[i]);
  }
  long long int maxHeight = 0;
  long long int currentHeight = 0;
  for (int i = 0; i < N; i++) {
    currentHeight = B[i] - A[i];
    if (currentHeight > maxHeight) {
      maxHeight = currentHeight;
    }
    result += A[i];
  }
  result += maxHeight;
  printf("%ld", result);
  return 0;
}
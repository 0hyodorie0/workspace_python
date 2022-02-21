# 1~9 숫자 야구 게임
import random
arr = [1, 2, 3, 4, 5, 6, 7, 8, 9]

print(arr)

for i in range(100) :
    rnd = int(9 *random.random())
    a = arr[0]
    b = arr[rnd]
    arr[0] = b
    arr[rnd] = a

print(arr[0], arr[1], arr[2])
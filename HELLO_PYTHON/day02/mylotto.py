import random

arr = list(range(1, 45+1))

print(arr)

for i in range(100) :
    rnd = int(45 *random.random())
    a = arr[0]
    b = arr[rnd]
    arr[0] = b
    arr[rnd] = a

print(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5])
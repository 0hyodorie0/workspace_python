# 베이스볼 게임 (1~9중에 중복없이 3개 추출)
import random
arr = [1,2,3,4,5,6,7,8,9]
com = []

while True:
    rnd = int(9*random.random())
    a = arr[rnd]
    if a != -1 :
        com.append(a)
        arr[rnd] = -1
        
    if len(com) == 3 :
        break

print(arr)
print(com)
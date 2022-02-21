import random
arr = [1,2,3,4,5,6,7,8,9]
arr3 = []

while True:
    rnd = int(9*random.random())
    a = arr[rnd]
    if a == -1 :
        pass
    else :
        arr3.append(a)
        arr[rnd] = -1
        
    if len(arr3) >= 3 :
        break

print(arr)
print(arr3)
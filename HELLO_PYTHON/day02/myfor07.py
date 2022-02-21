start = input("출력할 구구단을 입력하세요.")
num = int(start)

arr = range(1, 9+1)
for i in arr :
    print(start, "*", str(i), "=",str(num*i))
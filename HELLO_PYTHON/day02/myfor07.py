a = int(input("첫 수를 입력하세요."))
b = int(input("끝 수를 입력하세요."))
# aa = int(a)
# bb = int(b)
# arr = range(aa, bb+1)
arr = range(a, b+1)
sum = 0
for i in arr :
    sum += i

print("합은 " , sum , "입니다.")
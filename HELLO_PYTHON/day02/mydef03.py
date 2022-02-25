def add_min_mul_div(a,b):
    return a+b,a-b,a*b,a/b

sum,min,mul,div = add_min_mul_div(2, 3)
tupple = add_min_mul_div(2, 3)

print("멀티리턴",sum,min,mul,div)
print("합 :",sum)
print("빼기 :",min)
print("곱 :",mul)
print("나누기 :",div)

print("===================")
#튜플(tupple) _ a.k.a작은배열
print("변수 하나로 멀티리턴 받기",tupple)
print("0번째 인덱스:",tupple[0])
print("1번째 인덱스:",tupple[1])
print("2번째 인덱스:",tupple[2])
print("3번째 인덱스:",tupple[3])
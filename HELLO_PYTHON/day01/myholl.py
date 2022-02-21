# 홀/짝을 입력하시오(홀/짝)
# 나:홀
# 컴:짝
# 결과:짐
import random

start = input("홀/짝을 입력하시오(홀/짝)")
number = random.random()
result = ""

if number%2==0 :
    computer = "짝"
    print(computer)
else :
    computer = "홀"
    print(computer)

print(number)

if start != computer :
    result = "짐"
else :
    result = "이김"    

print("==============")
print("나 : " , start)
print("컴 : " , computer)
print("결과 : " , result)
print("==============")
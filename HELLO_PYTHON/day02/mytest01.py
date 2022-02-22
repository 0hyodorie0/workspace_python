# 가위, 바위, 보 게임
import random

i = input("가위 바위 보 : ")

num = int(random.random()*3)

if num == 1 :
    res = "가위"
elif num == 2 :
    res = "바위"
else :
    res = "보"
    
if (res == "가위" and i == "가위") or (res == "바위" and i == "바위") or (res == "보" and i == "보") :
    print("컴퓨터:",res," / 나:", i, " // 비겼습니다.")
elif (res == "가위" and i == "바위") or (res == "바위" and i == "보") or (res == "보" and i == "가위") :
    print("컴퓨터:",res," / 나:", i, " // 이겼습니다.")
else :
    print("컴퓨터:",res," / 나:", i, " // 졌습니다.")
# 첫째수 입력 : 4
# 끝째수 입력 : 6 
# 출력 예시 
# ****
# *****
# ******

def drawStar(cnt) :
    txt = ""
    for i in range(cnt) :
        txt += "*"
    print(txt)
    
drawStar(4)
drawStar(5)
drawStar(6)

print("a", end="")
print("b")
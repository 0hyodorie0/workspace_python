import sys
from PyQt5.QtWidgets import *
from PyQt5 import uic
import random

form_class = uic.loadUiType("main06.ui")[0]

class MyWindow(QMainWindow, form_class):
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        
        self.pb.clicked.connect(self.rockScissorsPaper)
        
    def rockScissorsPaper(self):
        
        mine = self.mine.text()
        com = ""
        result = ""

        number = random.random()*3.0
        print(number)
        print(mine)
        
        if(number < 1):
            com = "가위"
        elif(number <2):
            com = "바위"
        else:
            com = "보"
        self.com.setText(com)
        
        if(mine == com):
            result = "비겼습니다"
        elif((mine == "가위" and com == "보") 
             or (mine == "바위" and com == "가위") 
             or (mine == "보" and com == "바위")):
            result = "이겼습니다"
        else:
            result = "졌습니다"
        self.result.setText(result)
        
        
        
if __name__ == "__main__":
    app = QApplication(sys.argv)
    myWindow = MyWindow()
    myWindow.show()
    app.exec_()
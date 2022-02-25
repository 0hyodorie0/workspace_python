import sys
from PyQt5.QtWidgets import *
from PyQt5 import uic
import random

form_class = uic.loadUiType("main03.ui")[0]

class MyWindow(QMainWindow, form_class):
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        
        self.pb.clicked.connect(self.oddEven)
        
    def oddEven(self):
        myNum = self.myNum.text()
        comNum = ""
        result = ""

        number = random.random()
        print(number)
        
        if(number%2==0):
            comNum = "짝"
        else:
            comNum = "홀"
        self.comNum.setText(comNum)
        
        if myNum != comNum:
            result = "졌습니다"
        else:
            result = "이겼습니다"
        self.result.setText(result)
        
        
        
if __name__ == "__main__":
    app = QApplication(sys.argv)
    myWindow = MyWindow()
    myWindow.show()
    app.exec_()
import sys
from PyQt5.QtWidgets import *
from PyQt5 import uic

form_class = uic.loadUiType("main05.ui")[0]

class MyWindow(QMainWindow, form_class) :
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        
        self.pb.clicked.connect(self.plus)
        
    def plus(self):
        num1 = int(self.num1.text())
        num2 = int(self.num2.text())
        result = 0
        for i in range(num1,num2+1):
            result += i
        
        self.result.setText(str(result))
        
if __name__ == "__main__":
    app = QApplication(sys.argv)
    myWindow = MyWindow()
    myWindow.show()
    app.exec_()
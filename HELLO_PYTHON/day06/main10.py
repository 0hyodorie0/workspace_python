import sys
from PyQt5.QtWidgets import *
from PyQt5 import uic
from datetime import time
from time import sleep

form_class = uic.loadUiType("main10.ui")[0]

class MyWindow(QMainWindow, form_class) :
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        
        self.timer.clicked.connect(self.myclick)
        
    def myclick(self):
        result = ""
        i = 1
        for i in range(i,10+1):
            print(i)
            result = str(i)
            sleep(1)
            self.num.setText(result)
        
if __name__ == "__main__":
    app = QApplication(sys.argv)
    myWindow = MyWindow()
    myWindow.show()
    app.exec_()
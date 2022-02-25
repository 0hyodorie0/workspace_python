import sys
from PyQt5.QtWidgets import *
from PyQt5 import uic
from datetime import time

form_class = uic.loadUiType("main10.ui")[0]

class MyWindow(QMainWindow, form_class) :
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        
        self.timer.clicked.connect(self.myclick)
        
    def myclick(self):
        i = 1
        for i in range(i, 10+1):
            print(i)
            self.number.setText(i)            
            time.sleep(1)
        
if __name__ == "__main__":
    app = QApplication(sys.argv)
    myWindow = MyWindow()
    myWindow.show()
    app.exec_()
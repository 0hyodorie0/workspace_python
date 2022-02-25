import sys
from PyQt5.QtWidgets import *
from PyQt5 import uic

form_class = uic.loadUiType("main04.ui")[0]

class MyWindow(QMainWindow, form_class) :
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        
        self.pb.clicked.connect(self.gugudan)
        
    def gugudan(self):
        mynum = int(self.le.text())
        result = ""
        
        result += "{}*{}={}\n".format(mynum,1,mynum*1)
        result += "{}*{}={}\n".format(mynum,2,mynum*2)
        result += "{}*{}={}\n".format(mynum,3,mynum*3)
        result += "{}*{}={}\n".format(mynum,4,mynum*4)
        result += "{}*{}={}\n".format(mynum,5,mynum*5)
        result += "{}*{}={}\n".format(mynum,6,mynum*6)
        
        self.te.setText(result)
        
if __name__ == "__main__":
    app = QApplication(sys.argv)
    myWindow = MyWindow()
    myWindow.show()
    app.exec_()
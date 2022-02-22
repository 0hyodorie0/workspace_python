from matplotlib.patheffects import Stroke
class Animal:
    def __init__(self):
        print("생성자")
        self.age = 0
        
    def aging(self):
        self.age += 1
        
    def __del__(self):
        print("소멸자")
        
class Human(Animal):
    def __init__(self):
        super().__init__()
        self.skillLang = 0
        
    def momsTouch(self, stroke):
        self.skillLang += stroke
        
if __name__ == '__main__':
    a = Human()
    print(a.skillLang)
    print(a.age)
    a.aging()
    a.momsTouch(6)
    print(a.age)
    print(a.skillLang)
class LeeJY:
    def __init__(self):
        self.money = 1000000000
        
    def dirtymoney(self, amount):
        self.money += amount;
        
class Messi:
    def __init__(self):
        self.levelSoccer = 100
    def getOlder(self):
        self.levelSoccer -= 1
        
class SohnHS(LeeJY, Messi):
    def __init__(self):
        LeeJY.__init__(self)
        Messi.__init__(self)
        
if __name__ == '__main__':
    a = SohnHS()
    print(a.money)
    print(a.levelSoccer)
    a.dirtymoney(10000000000000000)
    a.getOlder()
    print(a.money)
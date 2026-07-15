class CloudStorage:
    def __init__(self):
        self.acno = 0
        self.space = 0
        self.bill = 0.0

    def accept(self):
        self.acno = int(input("Enter Account Number: "))
        self.space = int(input("Enter Space: "))

    def calculate(self):
        if 0<self.space<=15:
            self.bill = 15*self.space
        elif 15 < self.space <= 30:
            self.bill = 15 * 15
            self.bill += 13 * (self.space - 15)
        else:
            self.bill = 15 * 15
            self.bill += 13 * 15
            self.bill += 11 * (self.space - 30)

    def display(self):
            print("Account number is -", self.acno)
            print("Storage space is -", self.space)
            print("Bill to be paid -", self.bill)

    obj = CloudStorage()
    obj.accept()
    obj.calculate()
    obj.display()
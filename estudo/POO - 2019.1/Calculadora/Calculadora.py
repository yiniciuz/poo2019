class Calc:
	def __init__ (self, batmax):
		self.battery = 0
		self.batteryMax = batmax

	def charge(self, quant):
		self.battery += quant
		if self.battery > self.batteryMax:
			self.battery = self.batteryMax

	def __str__ (self):
		return "battery = "+ str(self.battery)+ "/"+ str(self.batteryMax)

	def soma(self, a, b):
		if self.battery == 0:
			print("carga insuficiente")
		else:
			print(a+b)
			self.battery -= 1

	def sub(self, a, b):
		if self.battery == 0:
			print("carga insuficiente")
		else:
			print(a-b)
			self.battery -= 1

	def mult(self, a, b):
		if self.battery == 0:
			print("carga insuficiente")
		else:
			print(a*b)
			self.battery -= 1

	def div(self, a, b):
		if self.battery == 0:
			print("bateria insuficiente")
		else:
			if (a or b) != 0:
		 		print(a/b)
		 		self.battery -= 1
			else:
		 		print("divisao por zero")



calc = Calc(0)
print("init, charge, soma, sub, mult, div, show ou end")
while True:
	ui = input().split(" ")

	if ui[0] == "init":
		calc = Calc(int(ui[1]))
	elif ui[0] == "charge":
		calc.charge(int(ui[1]))
	elif ui[0] == "soma":
		calc.soma(int(ui[1]), int(ui[2]))
	elif ui[0] == "sub":
		calc.sub(int(ui[1]), int(ui[2]))
	elif ui[0] == "mult":
		calc.mult(int(ui[1]), int(ui[2]))
	elif ui[0] == "div":
		calc.div(int(ui[1]), int(ui[2]))
	elif ui[0] == "show":
		print(calc)
	elif ui[0] == "end":
		break
	else:
		print("comando invalido")
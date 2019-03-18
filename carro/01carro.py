class Carro:
	def __init__ (self):
		self.pas = 0
		self.fuel = 0
		self.km = 0
		self.lim_pas = 2
		self.lim_fuel = 10

	def entrar(self):
		if self.pas < self.lim_pas:
			self.pas += 1
		else :
			print("limite de pessoas atingido")

	def sair(self):
		if self.pas > 0:
			self.pas -= 1
		else:
			print ("nao ha ninguem no carro")

	def abastecer (self, quant):
		self.fuel += quant
		if (self.fuel > self.lim_fuel):
			self.fuel = self.lim_fuel

	def dirigir (self, distancia):
		if self.pas > 0:
			if (self.fuel >= distancia / 10):
				self.km += distancia
				self.fuel -= (distancia) / 10
			else:
				print("gasolina insuficiente")
		else:
			print("nao ha ninguem no carro")


	def __str__ (self):
		return  "pas: " + str(self.pas) + ", fuel: " + str(self.fuel) + ", km: " + str(self.km)
carro = Carro ()
comando = ""

while (comando != "end"):
	comando = input()
	ui = comando.split(" ")

	if (ui[0] == "show"):
		print (carro)
	elif (ui[0] == "entrar"):
		carro.entrar()
	elif (ui[0] == "sair"):
		carro.sair()
	elif (ui[0] == "abastecer"):
		carro.abastecer(int(ui[1]))
	elif (ui[0] == "dirigir"):
		carro.dirigir(int(ui[1]))
	elif (ui[0] == "end"):
		break
	else:
		print("undefild")
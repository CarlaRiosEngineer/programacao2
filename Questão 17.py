#Questao 17
import random

def simular_dado(n):
    resultados = []
    for _ in range(n):
        jogar = random.randint(1,6)
        resultados.append(jogar)
    return resultados

print(simular_dado(7))


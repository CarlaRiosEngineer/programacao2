#Questão 14
def eh_primo(numero):
    if numero < 2:
        return False
    for i in range(2, int(numero ** 0.5) + 1):
        if numero % i == 0:
            return False
    return True

def numeros_primos(n):
    primos = []
    for num in range(2, n + 1):
        if eh_primo(num):
            primos.append(num)
    return primos

print(numeros_primos(20))

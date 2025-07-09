#Questao 13

def palindromo(palavra):
    palavra = palavra.lower()
    invertida = ''.join(reversed(palavra))
    return palavra == invertida

print(palindromo("arara"))



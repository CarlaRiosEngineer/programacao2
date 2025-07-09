#Questao 10
def maior(a,b,c):
    if a > b and a > c:
        return a
    if b > a and b > c:
        return b
    else:
        return c

print(maior(10,15,50))


#Questao 15

def analise(lista):
    m = maior(lista)
    me = menor(lista)
    soma = 0
    for e in lista:
        soma += e
    media = soma/len(lista)
    return m, me, media

def maior(lista):
    m = lista[0]
    for e in lista:
        if e > m:
            m = e
    return m
def menor(lista):
    me = lista[0]
    for e in lista:
        if e < me:
            me = e
    return me

print(analise([10,20,30]))

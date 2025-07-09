#Questao 12

def vogais(palavra):
    palavra.lower()
    v= ["a", "e", "i" ,"o", "u"]
    count = 0
    for letra in palavra:
        if letra in v:
            count +=1
    return count

print(vogais("carla"))
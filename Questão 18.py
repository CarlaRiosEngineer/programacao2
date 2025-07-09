#Questao 18
def senha_segura(senha):
    if len(senha) < 8:
        return False

    maiuscula = any(c.isupper() for c in senha)
    minuscula = any(c.islower() for c in senha)
    numero = any(c.isdigit() for c in senha)

    return all([maiuscula, minuscula, numero])

senha = senha_segura(input("Digite uma senha: "))
print(senha)







def jogo_adivinhacao():
    import random

    numero_secreto = random.randint(1, 100)
    tentativas = 0
    acertou = False
    print("Tente acertar um número adivinhando!")
    print("Dica: Ele está entre 1 e 100!")

    while not acertou:
        try:
            palpite = int(input("Qual é o seu palpite? "))
            tentativas += 1

            if palpite < numero_secreto:
                print("Muito baixo! Tente novamente.")
            elif palpite > numero_secreto:
                print("Muito alto! Tente novamente.")
            else:
                acertou = True
                print(f"Parabéns! Você acertou o número {numero_secreto} em {tentativas} tentativas.")
        except ValueError:
            print("Insira um número válido.")

iniciar = jogo_adivinhacao()
print(iniciar)

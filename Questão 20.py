#Questao 20
def intercalar_listas(lista1, lista2):
    if len(lista1) != len(lista2):
        raise ValueError("As listas devem ter o mesmo tamanho.")

    lista_intercalada = []
    for i in range(len(lista1)):
        lista_intercalada.append(lista1[i])
        lista_intercalada.append(lista2[i])

    return lista_intercalada


teste = intercalar_listas([1, 2, 3], ['a', 'b', 'c'])
print("Lista intercalada:",teste)
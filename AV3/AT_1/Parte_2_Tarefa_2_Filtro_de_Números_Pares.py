def filtro_pares(lista):
    resultado = []  
    for numero in lista:
        if numero % 2 == 0: 
            resultado.append(numero)
    return resultado

entrada = [1, 2, 3, 4, 5, 6]
saida = filtro_pares(entrada)

print(saida)  
def soma_quadrados(lista):
    soma = 0
    for numero in lista:
        soma += numero ** 2
    return soma

#Entrada
entrada = [1, 2, 3, 4]
resultado = soma_quadrados(entrada)

#Resultado
print("Resultado:", resultado)
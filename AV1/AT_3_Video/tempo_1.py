#Tempo de Projeto de Linguagem:
def soma_numeros(n):
    total = 0
    for i in range(1, n + 1):
        total += i
    return total

resultado = soma_numeros(10)
print(f"A soma dos números de 1 a 10 é: {resultado}")

'''
O tempo de linguagem, geralmente se refere à execução do código 
e como ele é interpretado ou compilado. Python é uma linguagem de programação
interpretada, o que significa que o código é executado linha por linha em tempo
real, ao invés de ser compilado completamente antes da execução.
'''
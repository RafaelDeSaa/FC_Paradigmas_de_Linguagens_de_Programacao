#8)Escreva a definição de uma função que calcule o fatorial de um número.
def fatorial(n):
    if n == 0 or n == 1:
        return 1  
    else:
        resultado = 1
        for i in range(2, n + 1):  
            resultado *= i  
        return resultado
print(fatorial(5))  
print(fatorial(0))  
print(fatorial(1))  
print(fatorial(7))    
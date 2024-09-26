#Tempo de Compilação:
import time
def calcular():
    total = 0
    for i in range(1, 1000000):
        total += i
    return total

start_time = time.time()

resultado = calcular()
end_time = time.time()

print(f"O resultado é: {resultado}")
print(f"Tempo total de execução: {end_time - start_time:.5f} segundos")

'''
O tempo de compilação em Python é uma consideração menor em 
comparação com linguagens compiladas. No entanto, entender esse
processo pode ajudar a otimizar a execução e a estrutura do seu código. 
'''
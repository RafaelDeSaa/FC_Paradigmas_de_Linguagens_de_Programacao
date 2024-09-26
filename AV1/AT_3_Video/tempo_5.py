#Tempo de Execução:
import time
def soma_numeros(n):
    total = sum(range(1, n + 1))
    return total

n = 1000000
start_time = time.time()

resultado = soma_numeros(n)

end_time = time.time()

print(f"A soma dos números de 1 a {n} é: {resultado}")
print(f"Tempo de execução: {end_time - start_time:.5f} segundos")

'''
O tempo de execução é um aspecto fundamental a ser considerado
durante o desenvolvimento em Python, pois impacta diretamente 
a experiência do usuário e a eficiência do software. Medir e
otimizar esse tempo pode levar a melhorias significativas no 
desempenho da sua aplicação.
'''
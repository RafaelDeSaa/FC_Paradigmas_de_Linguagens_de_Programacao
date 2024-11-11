#4) Escreva a definição de uma função que conte,
#  a partir do número informado como parâmetro,
#  até chegar a zero. Enquanto não chegar a zero,
#  mostrar o número correspondente. Quando a contagem 
# chegar a zero, mostrar a mensagem “Encerrado”.
def contar_ate_zero(numero):
    while numero >= 0:
        print(numero)
        numero -= 1  
    
    print("Encerrado")
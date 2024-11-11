#2)Escreva a definição de uma função que, a partir de dois números,
#escreva se são ou não múltiplos?
def sao_multiplos(a, b):
    if a % b == 0 or b % a == 0:
        print(f"{a} e {b} são múltiplos.")
    else:
        print(f"{a} e {b} não são múltiplos.")
#1) Escreva a definição de uma função que, a partir de dois números, 
#escreva qual é o maior?
def maior_numero(a, b):
    if a > b:
        print(f"O maior número é {a}")
    elif b > a:
        print(f"O maior número é {b}")
    else:
        print("Os dois números são iguais.")

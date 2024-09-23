"""
Fazer o usuário digitar o número inteiro qualquer
e a partir desse número deve imprimir a seguinte
-Caso o usuário digite 3:
*
**
***
"""
numero = int(input("Digite um número interio:"))
for i in range(1,numero +1): 
    print("*"*i)
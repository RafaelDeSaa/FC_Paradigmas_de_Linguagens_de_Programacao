#6)Escreva a definição de uma função que, a partir de três
#parâmetros (dois números e um caracter representando a 
#operação aritmética desejada + - * /) calcula o resultado
#da operação aritmética (dica: utilize a primitiva cond).
def calcular_operacao(num1, num2, operador):
    if operador == '+':
        return num1 + num2
    elif operador == '-':
        return num1 - num2
    elif operador == '*':
        return num1 * num2
    elif operador == '/':
        if num2 != 0:
            return num1 / num2
        else:
            return "Erro: divisão por zero!"
    else:
        return "Operador inválido!"
    
print(calcular_operacao(10, 5, '+'))  
print(calcular_operacao(10, 5, '-'))  
print(calcular_operacao(10, 5, '*'))  
print(calcular_operacao(10, 5, '/'))  
print(calcular_operacao(10, 0, '/'))  
print(calcular_operacao(10, 5, '^'))     
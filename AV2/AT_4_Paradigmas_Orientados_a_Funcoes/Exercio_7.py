#7)Escreva a definição de uma função que, a partir
#de um parâmetro numérico representando o salário bruto
#de uma pessoa, calcule o valor a ser pago referente
#ao INSS, de acordo com as seguintes faixas de valores:
#até R$1200,00 2% do salário bruto, acima de R$1200,00 
#até R$2500,00 5% do salário bruto e acim de R$2500,00 
#8% do salário bruto (dica: utilize a primitiva cond).
def calcular_inss(salario_bruto):
    if salario_bruto <= 1200.00:
        inss = salario_bruto * 0.02  
    elif salario_bruto <= 2500.00:
        inss = salario_bruto * 0.05  
    else:
        inss = salario_bruto * 0.08 
    
    return inss
print(calcular_inss(1000.00)) 
print(calcular_inss(1500.00))
print(calcular_inss(3000.00))
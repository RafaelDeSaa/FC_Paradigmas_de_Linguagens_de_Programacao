#5) Escreva a definição de funções que, a partir de um 
#parâmetro representando a idade de uma pessoa expressa 
#em dias, mostre-a expressa em anos, meses e dias 
#(dica: utilize as primitivas quotient para extrair a parte
#inteira de uma divisão e remainder para extrair o resto da divisão).
def converter_idade_em_anos_meses_dias(idade_em_dias):
    
    anos = idade_em_dias // 365  
    restante_dias = idade_em_dias % 365  
    meses = restante_dias // 30  
    dias = restante_dias % 30  

    print(f"{anos} ano(s), {meses} mês(es) e {dias} dia(s).")
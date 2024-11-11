#3)Escreva a definição de funções que, a partir de
#um parâmetro representando a o tempo necessário para
#fabricar um produto expresso em segundos, mostre o
#expresso em horas, minutos e segundos
#(dica: utilize as primitivas quotient para extrair a 
#parte inteira de uma divisão e remainder para extrair o resto da divisão).
def converter_tempo(tempo_em_segundos):

    horas = tempo_em_segundos // 3600  
    minutos = (tempo_em_segundos % 3600) // 60  
    segundos = tempo_em_segundos % 60  
   
    print(f"{horas} hora(s), {minutos} minuto(s) e {segundos} segundo(s).")
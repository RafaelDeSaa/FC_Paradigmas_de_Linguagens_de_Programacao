#Tempo de Implementação de Linguagem:
import csv

def ler_csv(arquivo):
    with open(arquivo, mode='r') as file:
        leitor = csv.reader(file)
        for linha in leitor:
            print(linha)

ler_csv('dados.csv')

'''
O tempo de implementação, é geralmente menor
quando comparado a muitas outras linguagens, devido
à sua simplicidade e às poderosas bibliotecas disponíveis.
'''
#Tempo de Carregamento:
import time
def modulo_demorado():
    time.sleep(2) 
    return "Módulo carregado!"

start_time = time.time()

resultado = modulo_demorado()

end_time = time.time()

print(resultado)
print(f"Tempo de carregamento: {end_time - start_time:.2f} segundos")

'''
O tempo de carregamento, pode influenciar o desempenho
da sua aplicação, especialmente se você estiver lidando com muitos
módulos ou bibliotecas grandes. Compreender e otimizar esse tempo
é fundamental para garantir uma experiência suave para o usuário.      
'''
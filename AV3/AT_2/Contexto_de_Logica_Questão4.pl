mora(joao, copacabana).
mora(maria, ipanema).
mora(pedro, leblon).
mora(ana, botafogo).
mora(carla, copacabana).
mora(luiz, tijuca).
mora(fernanda, tijuca).

pertence(copacabana, zona_sul).
pertence(ipanema, zona_sul).
pertence(leblon, zona_sul).
pertence(botafogo, zona_sul).
pertence(tijuca, zona_norte).

amigo(joao, carla).
amigo(maria, pedro).
amigo(ana, joao).
amigo(luiz, fernanda).

tem_carro(joao).
tem_carro(ana).
tem_carro(luiz).
tem_carro(joao).
tem_carro(carlos).
tem_carro(paulo).

pode_dar_carona(Pessoa1, Pessoa2) :-
    tem_carro(Pessoa1),
    mora(Pessoa1, Bairro1),
    mora(Pessoa2, Bairro2),
    pertence(Bairro1, Regiao),
    pertence(Bairro2, Regiao).

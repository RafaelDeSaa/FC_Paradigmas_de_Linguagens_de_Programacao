mora(joao, centro).
mora(maria, centro).
mora(ana, jardim).
mora(carlos, jardim).
mora(paulo, vila_nova).
mora(fernanda, vila_nova).

pertence(centro, norte).
pertence(jardim, norte).
pertence(vila_nova, sul).

amigo(joao, maria).
amigo(ana, carlos).
amigo(paulo, fernanda).

tem_carro(joao).
tem_carro(carlos).
tem_carro(paulo).

pode_dar_carona(Pessoa1, Pessoa2) :-
    tem_carro(Pessoa1),
    mora(Pessoa1, Bairro1),
    mora(Pessoa2, Bairro2),
    pertence(Bairro1, Regiao),
    pertence(Bairro2, Regiao).

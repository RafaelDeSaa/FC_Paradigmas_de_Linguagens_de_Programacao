cachorro(doky).
gato(garfield).
peixe(nemo).
passaro(dudu).
pessoas(joao, maria).

magro(doky).
gordo(garfield).

gosta(cachorro, pessoas).
gosta(gato, peixes).
gosta(gato, passaros).
gosta(gato, pessoas).

come(X, Y) :-
gosta(X, Y),
not((X = gato, Y = pessoas)).


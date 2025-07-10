% Fatos: relações familiares
pai(joao, maria).
pai(joao, jose).
pai(jose, carla).

mae(ana, maria).
mae(ana, jose).
mae(mariana, carla).

% Regras
irmao(X, Y) :- pai(P, X), pai(P, Y), mae(M, X), mae(M, Y), X \= Y.
avo(X, Y) :- pai(X, Z), pai(Z, Y).
tia(X, Y) :- irmao(X, Z), pai(Z, Y).

:- initialization(true).

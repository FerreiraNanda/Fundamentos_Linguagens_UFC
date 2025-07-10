# Desafio 12 – Programação Lógica

Neste desafio, foi utilizado o paradigma de programação lógica para modelar um pequeno problema de genealogia utilizando a linguagem Prolog.

---

## Objetivo

- Representar relações familiares por meio de fatos lógicos (`pai`, `mae`);
- Definir regras de inferência (`irmao`, `avo`, `tia`);
- Permitir que o sistema deduza relações a partir dos fatos, sem codificação imperativa;
- Utilizar sintaxe padrão do Prolog compatível com SWI-Prolog ou GNU Prolog.

---

## `arvore_genealogica.pl`

```prolog
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
```

---

## Exemplos de Consultas no SWI-Prolog

```prolog
?- irmao(jose, maria).
false.

?- avo(joao, carla).
true.

?- tia(maria, carla).
true.
```

---

## Explicação

- `irmao/2` verifica se duas pessoas têm o mesmo pai e a mesma mãe e não são a mesma pessoa.
- `avo/2` verifica se alguém é pai do pai de outra pessoa.
- `tia/2` define alguém como tia se for irmã do pai da pessoa.

---

## Conclusão

O exemplo desenvolvido demonstra como o paradigma declarativo da programação lógica permite representar e deduzir relações complexas de maneira simples, utilizando apenas fatos e regras. A abordagem mostra como é possível modelar conhecimento e fazer inferências lógicas sem a necessidade de estruturas de controle ou comandos imperativos, reforçando as características do Prolog.

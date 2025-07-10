# Desafio 11 – Programação Funcional

Baseado no que foi visto na disicplina de Inteligência de negócios e Visualização de Dados e aplicando conceitos da programação funcional usando a linguagem Python, com foco em recursão e funções de alta ordem. A aplicação desenvolvida utiliza um exemplo realista: o processamento de uma lista de valores de vendas.

---

## Objetivo

- Utilizar funções de alta ordem (map, filter, reduce);
- Aplicar recursão para resolver um problema de forma funcional;
- Criar uma solução com contexto prático e funcional.

---

## `programacao_funcional.py`

```python
from functools import reduce

vendas = [253.0, 171.5, 325.75, 91.0, 410.6, 155.0, 985.3]

def aplicar_desconto(lista):
    return list(map(lambda v: v * 0.9, lista))

def filtrar_acima_de_200(lista):
    return list(filter(lambda v: v > 200, lista))

def somar(lista):
    if not lista:
        return 0
    return lista[0] + somar(lista[1:])

def somar_com_reduce(lista):
    return reduce(lambda x, y: x + y, lista)

print("Vendas originais:", vendas)

vendas_com_desconto = aplicar_desconto(vendas)
print("Com desconto de 10%:", vendas_com_desconto)

vendas_filtradas = filtrar_acima_de_200(vendas_com_desconto)
print("Vendas acima de R$200:", vendas_filtradas)

total = somar(vendas_filtradas)
print("Total com recursao:", total)

total_reduce = somar_com_reduce(vendas_filtradas)
print("Total com reduce:", total_reduce)
```

---

## Explicação

- Funções de alta ordem:
  - `map`: aplica um desconto de 10% a cada venda.
  - `filter`: seleciona apenas as vendas com valor superior a R$200.
  - `reduce`: soma todos os valores filtrados de forma funcional.

- Recursão:
  - A função `somar(lista)` é definida recursivamente para somar os elementos da lista sem laços imperativos.

---

## Conclusão

O programa apresentado mostra como a programação funcional pode ser aplicada em Python para resolver tarefas comuns como transformação, filtragem e agregação de dados. Utilizando recursão e funções de alta ordem, o código se mantém expressivo, modular e sem efeitos colaterais.

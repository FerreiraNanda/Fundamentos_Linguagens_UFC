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

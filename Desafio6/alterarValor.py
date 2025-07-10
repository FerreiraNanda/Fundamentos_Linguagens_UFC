def alterar_por_valor(x):
    x = 100
    print("[alterar_por_valor] x alterado para", x)

def alterar_por_referencia(x):
    x[0] = 100
    print("[alterar_por_referencia] x[0] alterado para", x[0])

a = 10
print("Antes de alterar_por_valor, a =", a)
alterar_por_valor(a)
print("Depois de alterar_por_valor, a =", a)
print()

b = [10]
print("Antes de alterar_por_referencia, b =", b)
alterar_por_referencia(b)
print("Depois de alterar_por_referencia, b =", b)

def sum(raio):
    aux = ((raio * raio) * 3.14159)
    return "{:.4f}".format(aux)

raio = float(input())

print(f'A={sum(raio)}')
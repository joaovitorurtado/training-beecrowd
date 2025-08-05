def media(val1, val2, val3):
    valorFinal = (((val1 * 2) + (val2 * 3) + (val3 * 5))/10)
    valorFinal = round(valorFinal, 1)
    return "{:.1f}".format(valorFinal)

val1 = round(float(input()), 1)
val2 = round(float(input()), 1)
val3 = round(float(input()), 1)
print(f'MEDIA = {media(val1, val2, val3)}')
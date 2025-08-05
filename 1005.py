def media(val1, val2):
    mediaFinal = (((val1 * 0.35) + (val2 * 0.75))/1.1)
    return "{:.5f}".format(mediaFinal)

val1 = round(float(input()), 1)
val2 = round(float(input()), 1)


print(f'MEDIA = {media(val1, val2)}')
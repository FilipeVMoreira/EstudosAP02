def moda(lista):
   moda = lista[0]
   mais_repetido = 0
   repeticoes = {}
   for i in lista:
      repeticoes[i] = repeticoes.get(i, 0) + 1
   for i, repetido in repeticoes.items():
      if repetido > mais_repetido:
        mais_repetido = repetido
        moda = i
   return moda

lista1 = [0, 1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 6, 0, 7, 0, 8, 0, 9]
lista2 = [i//10 for i in range(100, -10, -1)] + [10,11,12,13,14,5,16,17,18,19]
lista3 = [(i**3)//1000 for i in range(100, -10, -1)]

moda1 = moda(lista1)
moda2 = moda(lista2)
moda3 = moda(lista3)

print(moda1)
print(moda2)
print(moda3)

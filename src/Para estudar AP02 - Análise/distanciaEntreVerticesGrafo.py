def busca_em_largura(grafo, inicio):
    n = len(grafo)
    visitados = [False] * n
    distancia = [-1] * n
    fila = [inicio]
    visitados[inicio] = True
    distancia[inicio] = 0


    while fila:
        vertice = fila.pop(0)

        for vizinho in range(n):
            if grafo[vertice][vizinho] == 1 and not visitados[vizinho]:
                visitados[vizinho] = True
                fila.append(vizinho)
                distancia[vizinho] = distancia[vertice] + 1
    return distancia

def maior_distancia(grafo):
    mais_longe = 0

    for i in range(len(grafo)):
        distancia = busca_em_largura(grafo, i)
        for d in distancia:
            if d > mais_longe:
                mais_longe = d

    return mais_longe


grafo_matriz1 = [[0, 1, 1, 0, 0, 0], #indice0
                 [1, 0, 1, 1, 0, 1], #indice1
                 [1, 1, 0, 1, 1, 0], #indice2
                 [0, 1, 1, 0, 1, 1], #indice3
                 [0, 0, 1, 1, 0, 1], #indice4
                 [0, 1, 0, 1, 1, 0]] #indice5

grafo_matriz2 = [[0, 1, 0, 0, 0, 0], #indice0
                 [1, 0, 1, 1, 0, 1], #indice1
                 [0, 1, 0, 0, 0, 0], #indice2
                 [0, 1, 0, 0, 0, 0], #indice3
                 [0, 0, 0, 0, 0, 1], #indice4
                 [0, 1, 0, 0, 1, 0]] #indice5

grafo_matriz3 = [[0, 1, 0, 0, 0, 0], #indice0 
                 [1, 0, 1, 0, 0, 0], #indice1
                 [0, 1, 0, 1, 0, 0], #indice2
                 [0, 0, 1, 0, 0, 1], #indice3
                 [0, 0, 0, 0, 0, 1], #indice4
                 [0, 0, 0, 1, 1, 0]] #indice5

maior_distancia1 = maior_distancia(grafo_matriz1)
maior_distancia2 = maior_distancia(grafo_matriz2)
maior_distancia3 = maior_distancia(grafo_matriz3)

print(maior_distancia1)
print(maior_distancia2)
print(maior_distancia3)
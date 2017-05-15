#include <stdio.h>
#include <stdlib.h>
#include "Lista.h"
#include "ListaEncadeada.h"

void main()
{
    int vetor[7] = {1,2,3,4,5,6,7};
    int vetor2[5];
    int i;
    Celula *LISTA = (Celula *) malloc(sizeof(Celula));
    Celula *COPIA = (Celula *) malloc(sizeof(Celula));
    criaLista(LISTA);
    criaLista(COPIA);
    vetor_para_lista(vetor,LISTA,7);
    imprimeLista(LISTA);
    inverte_Lista(LISTA);
    printf("\nLista invertida:\n");
    imprimeLista(LISTA);

}

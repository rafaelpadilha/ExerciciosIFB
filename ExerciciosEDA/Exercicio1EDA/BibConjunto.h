#include <stdio.h>
#include <stdlib.h>
#define TAMANHO 20

typedef struct
{
    int elemento[20];
    int tamanho;
} TConjunto;
//Struct

/*
 * Recebe um conjunto do tipo TConjunto
 * Atribui zero a seu tamanho
 */
void InicializaConjunto(TConjunto *c);

/*
 * Recebe três conjuntos do tipo TConjunto por referência
 * sendo dois conjuntos com elementos e um terceiro para
 * armazenar o resutado da união dos dois conjuntos
 */
void uniaoConjunto(TConjunto* c1,TConjunto* c2, TConjunto* c3);

/*
 * Recebe três conjuntos do tipo TConjunto por referência
 * sendo dois conjuntos com elementos e um terceiro para
 * armazenar o resutado da intersecção dos dois conjuntos
 */
void intersecConjunto(TConjunto *c1, TConjunto *c2, TConjunto *c3);

/*
 * Recebe dois conjuntos do tipo TConjunto por referência
 * Copia o conteúdo para dois conjuntos auxiliares
 * Ordena os conjuntos auxiliares
 * Verifica se cada elemendo das mesmas posições são iguais
 * RETORNA 1 para verdadeiro / 0 para falso
 */
int conjuntosIguais(TConjunto *c1, TConjunto *c2);

/*
 * Utilizada na função conjuntosIguais
 * Recebe dois conjuntos por referência
 * Ordena os conjuntos
 */
void ordenaVetor(TConjunto *vetor);

/*
 * Recebe um conjunto do tipo TConjunto
 * Imprime-o
 */
void imprimeConjunto(TConjunto *c);

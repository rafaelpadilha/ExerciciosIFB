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
 * Recebe tr�s conjuntos do tipo TConjunto por refer�ncia
 * sendo dois conjuntos com elementos e um terceiro para
 * armazenar o resutado da uni�o dos dois conjuntos
 */
void uniaoConjunto(TConjunto* c1,TConjunto* c2, TConjunto* c3);

/*
 * Recebe tr�s conjuntos do tipo TConjunto por refer�ncia
 * sendo dois conjuntos com elementos e um terceiro para
 * armazenar o resutado da intersec��o dos dois conjuntos
 */
void intersecConjunto(TConjunto *c1, TConjunto *c2, TConjunto *c3);

/*
 * Recebe dois conjuntos do tipo TConjunto por refer�ncia
 * Copia o conte�do para dois conjuntos auxiliares
 * Ordena os conjuntos auxiliares
 * Verifica se cada elemendo das mesmas posi��es s�o iguais
 * RETORNA 1 para verdadeiro / 0 para falso
 */
int conjuntosIguais(TConjunto *c1, TConjunto *c2);

/*
 * Utilizada na fun��o conjuntosIguais
 * Recebe dois conjuntos por refer�ncia
 * Ordena os conjuntos
 */
void ordenaVetor(TConjunto *vetor);

/*
 * Recebe um conjunto do tipo TConjunto
 * Imprime-o
 */
void imprimeConjunto(TConjunto *c);

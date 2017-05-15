#include <stdio.h>
#include <stdlib.h>

/*
 * Aluno
 * Rafael Padilha
 * IFB - Taguatinga
 */

typedef struct cel Celula;


/*
 * Função que recebe uma Celula simples
 * Retorna um int com a quantidade de elementos que possui na Celula
 */
int tamanhoDaLista(Celula *LISTA);

/*
 * Recebe um vetor, uma Lista do tipo Celula e o tamanho do vetor
 * Insere na Celula os elementos do vetor
 */
void vetor_para_lista(int *vetor,Celula *LISTA,int tamanho);

/*
 * Recebe um vetor, uma Lista do tipo Celula e o tamanho da Celula
 * Copia para o vetor os elementos de uma Celula encadeada simples
 */
void lista_para_vetor(int *vetor,Celula *LISTA,int tamanho);

/*
 * Recebe a Celula que deseja copiar e a Celula que deseja que seja a copia
 * Copia os elementos de uma Celula para a outra
 */
void copiar_lista(Celula *LISTA,Celula *COPIA);

/*
 * Recebe duas Celulas
 * Junta o final de uma com o começo da outra
 */
void concatena_lista(Celula *LISTA,Celula *LISTA2);

/*
 * Recebe um vetor e o tamanho do vetor
 * Ordena o vetor em ordem crescente
 */
void ordena_Vetor(int vetor[], int tamanho);

/*
 * Recebe duas Celulas
 * Transforma as Celulas em vetores , compara os vetores para ver se tem o mesmo conteudo
 * Retorna 1 para Celulas iguais(com o mesmos valores) , 0 para diferentes
 */
int verifica_listas_iguais(Celula *LISTA1,Celula *LISTA2);

/*
 * Recebe uma Celula
 * Inverte as Celulas alterando os ponteiros
 */
void inverte_Lista (Celula *LISTA);

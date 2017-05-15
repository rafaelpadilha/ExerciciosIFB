#include <stdio.h>
#include <stdlib.h>

/*
 * Aluno
 * Rafael Padilha
 * IFB - Taguatinga
 */

struct cel
{
    int info;
    struct cel *prox;
};
typedef struct cel Celula;

/*
 * Cria a Lista
 */
void criaLista(Celula *LISTA);

/*
 * Recebe a Celula
 * Verifica se a celula está vazia
 * Retorna 1 para sim 0 para não
 */
int listaVazia(Celula *LISTA);

/*
 * Recebe a celula e o numero
 * Adiciona o numero no fim da celula
 */
void insereFim(Celula *LISTA,int numero);

/*
 * Recebe a Celula e imprime
 */
void imprimeLista(Celula *LISTA);

/*
 * Recebe um numero inteiro que deseja buscar,
 * a celula.Retorna 1 caso exista este valor na Celula
 */
int busca (int x, Celula *le);

/*
 * Recebe um inteiro que deseja excluir e a Celula
 * Exclui o elemento da celula
 */
void excluiInfo(int y, Celula *le);

/*
 * Recebe a Celula
 * Apaga toda a Celula
 */
void libera(Celula *LISTA);

/*
 * Recebe um valor inteiro e o insere ordenado na Celula
 * Não consegui fazer
 */
//void inserirOrdenado(Celula **p,int num);
void insereInicio(Celula *LISTA,int num);

#include <stdio.h>
#include <stdlib.h>
#include "ListaEncadeada.h"

/*
 * Aluno
 * Rafael Padilha
 * IFB - Taguatinga
 */

void criaLista(Celula *LISTA)
{
    LISTA->prox = NULL;
}

int listaVazia(Celula *LISTA)
{
    if(LISTA->prox == NULL)
        return 1;
    else
        return 0;
}

void insereFim(Celula *LISTA,int numero)
{
    Celula *novo=(Celula *) malloc(sizeof(Celula));
    novo->info=numero;
    novo->prox = NULL;

    if(listaVazia(LISTA))
        LISTA->prox=novo;
    else
    {
        Celula *tmp = LISTA->prox;

        while(tmp->prox != NULL)
            tmp = tmp->prox;

        tmp->prox = novo;
    }
}

void imprimeLista(Celula *LISTA)
{
    if(listaVazia(LISTA))
    {
        printf("\nLista vazia!\n\n");
        return ;
    }

    Celula *tmp;
    tmp = LISTA->prox;

    while( tmp != NULL)
    {
        printf("info: %d\n", tmp->info);
        tmp = tmp->prox;
    }
    printf("\n\n");
}

int busca (int x, Celula *LISTA)
{
    Celula *tmp = LISTA;
    int achou = 0;
    while (tmp != NULL && !achou)
    {
        if (tmp->info == x) achou = 1;
        tmp = tmp->prox;
    }
    if (achou) return 1;
    else return 0;
}

void excluiInfo(int y, Celula *LISTA)
{
    Celula *p, *q;
    p = LISTA;
    q = LISTA->prox;
    while (q != NULL && q->info != y)
    {
        p = q;
        q = q->prox;
    }
    if (q != NULL)
    {
        p->prox = q->prox;
        free (q);
    }
}

void libera(Celula *LISTA)
{
     free(LISTA);
}

void insereInicio(Celula *LISTA,int num)
{
	Celula *novo=(Celula *) malloc(sizeof(Celula));
	novo->info=num;

	Celula *antigo = LISTA->prox;

	LISTA->prox = novo;
	novo->prox = antigo;
}


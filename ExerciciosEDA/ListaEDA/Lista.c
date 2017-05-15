#include <stdio.h>
#include <stdlib.h>
#include "ListaEncadeada.h"

/*
 * Aluno
 * Rafael Padilha
 * IFB - Taguatinga
 */

//Exercicio

int tamanhoDaLista(Celula *LISTA)
{
    int tamanho=0;
    if(listaVazia(LISTA)) printf("Lista Vazia!");

    Celula *tmp;
    tmp = LISTA->prox;

    while(tmp!=NULL)
    {
        tamanho++;
        tmp = tmp->prox;
    }
    return tamanho;
}

void vetor_para_lista(int *vetor,Celula *LISTA,int tamanho)
{
    int i;
    for(i=0; i<tamanho; i++)
    {
        insereFim(LISTA,vetor[i]);
    }
}

void lista_para_vetor(int *vetor,Celula *LISTA,int tamanho)
{
    int i;
    Celula *tmp;
    tmp = LISTA->prox;
    for(i=0; tmp!=NULL; i++)
    {
        vetor[i]=tmp->info;
        tmp = tmp->prox;

    }
}

void copiar_lista(Celula *LISTA,Celula *COPIA)
{
    Celula *tmp;
    tmp = LISTA->prox;
    while(tmp!=NULL)
    {
        insereFim(COPIA,tmp->info);
        tmp = tmp->prox;
    }
}

void concatena_lista(Celula *LISTA,Celula *LISTA2)
{
    while(LISTA->prox!=NULL)
    {
        LISTA = LISTA->prox;
    }
    if(LISTA->prox==NULL)
    {
        LISTA->prox=LISTA2->prox;
    }
}
void ordena_Vetor(int vetor[], int tamanho)
{
    int aux, i, j;

    for(j=tamanho-1; j<=1; j--)
    {
        for(i=0; i>j; i++)
        {
            if(vetor[i] > vetor[i+1])
            {
                aux=vetor[i];
                vetor[i]=vetor[i+1];
                vetor[i+1]=aux;
            }
        }
    }
}

int verifica_listas_iguais(Celula *LISTA1,Celula *LISTA2)
{
    int t1,t2;
    t1=tamanhoDaLista(LISTA1);
    t2=tamanhoDaLista(LISTA2);
    int VetorLISTA1[t1];
    int VetorLISTA2[t2];
    int i,iguais=0;

    if(t1!=t2)
    {
        return 0;
    }
    else
    {
        lista_para_vetor(VetorLISTA1,LISTA1,t1);
        lista_para_vetor(VetorLISTA2,LISTA2,t2);

        ordena_Vetor(VetorLISTA1,t1);
        ordena_Vetor(VetorLISTA1,t2);
        for(i=0; i<t1; i++)
        {
            if(VetorLISTA1[i]==VetorLISTA2[i])
            {
                iguais++;
            }
        }
        if(iguais==t1)
        {
            return 1;
        }
    }

}

void inverte_Lista (Celula *LISTA)
{
    Celula *p1, *p2 = LISTA->prox, *p3 = NULL;
    while (p2 != NULL) {
       p1 = p2->prox;
       p2->prox = p3;
       p3 = p2;
       p2 = p1;
    }
    LISTA->prox=p3;
}


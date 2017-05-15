#include <stdio.h>
#include <stdlib.h>
#include "BibConjunto.h"

//Inicializar o conjunto adicionando 0 a seu tamanho
void InicializaConjunto(TConjunto *c)
{
    c->tamanho=0;
}

void uniaoConjunto(TConjunto* c1,TConjunto* c2,TConjunto* c3)
{
    int i=0,j=0;

    if(((c1->tamanho)+(c2->tamanho))<= TAMANHO)
    {
        c3->tamanho=c1->tamanho+c2->tamanho;
        for(i=0; i<c1->tamanho; i++)
        {
            c3->elemento[j]=c1->elemento[i];
            j++;
        }
        for (i=0; i<c2->tamanho; i++)
        {
            c3->elemento[j] = c2->elemento[i];
            j++;
        }

        //Elimina numeros repetidos
        for(i=0; i<c3->tamanho; i++)
        {
            for(j=i+1; j<c3->tamanho; j++)
            {
                if(c3->elemento[i]==c3->elemento[j])
                {
                    c3->elemento[j]=c3->elemento[c3->tamanho-1];
                    c3->tamanho--;
                }
            }
        }
    }
    else
        printf("Erro!");
}
void intersecConjunto(TConjunto *c1, TConjunto *c2, TConjunto *c3)
{
    int i=0,j=0;
    for(i=0; i<c1->tamanho; i++)
    {
        for(j=0; j<c2->tamanho; j++)
        {
            if(c1->elemento[i]==c2->elemento[j])
            {
                c3->elemento[c3->tamanho]=c1->elemento[i];
                c3->tamanho++;
            }
        }
    }
}
int conjuntosIguais(TConjunto *c1, TConjunto *c2)
{

    int i;
    TConjunto aux1,aux2;
    InicializaConjunto(&aux1);
    InicializaConjunto(&aux2);

    //copia os conjuntos para auxiliares
    for(i=0; i<c1->tamanho; i++)
    {
        aux1.elemento[i]=c1->elemento[i];
        aux2.elemento[i]=c2->elemento[i];
    }
    ordenaVetor(&aux1);
    ordenaVetor(&aux2);
    if(c1->tamanho==c2->tamanho)
    {
        for(i=0;i<c1->tamanho;i++)
        {
            if(aux1.elemento[i]!=aux2.elemento[i])
            {
                return 0;
            }
        }
    }
    return 1;
}

void ordenaVetor(TConjunto *vetor)
{
    int i,j,aux;
    for(i=0; i < vetor->tamanho; i++ )
    {
        for(j = vetor->tamanho - 1; j > i; j-- )
        {
            if( vetor->elemento[j] < vetor->elemento[j-1] )
                aux = vetor->elemento[j];
            vetor->elemento[j] = vetor->elemento[j-1];
            vetor->elemento[j-1] = aux;
        }
    }
}
void imprimeConjunto(TConjunto *c)
{
    int i;
    for(i=0; i<c->tamanho; i++)
    {
        printf("%i ",c->elemento[i]);
    }
}

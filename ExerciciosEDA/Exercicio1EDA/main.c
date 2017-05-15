#include <stdio.h>
#include <stdlib.h>
#include "BibConjunto.h"

void main()
{
    TConjunto c1,c2,c3;
    int i;

    InicializaConjunto(&c1);
    InicializaConjunto(&c2);
    InicializaConjunto(&c3);

    //limpa tela
    printf("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    //entrada conjunto 1
    printf("Digite os elementos do conjunto 1:\n");
    for(i=0;i<TAMANHO;i++)
    {
        printf("Deseja adiciona mais numeros ?(s/n)");
        if(getch()=='s')
        {
            printf("\nDigite o elemento %i: ",i+1);
            scanf("%i",&c1.elemento[i]);
        }
        else{
            c1.tamanho=i;
            break;
        }
    }
    //limpa tela
    printf("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    //entrada conjunto 2
    printf("Digite os elementos do conjunto 2:\n");
    for(i=0;i<TAMANHO;i++)
    {
        printf("Deseja adiciona mais numeros ?(s/n)");
        if(getch()=='s')
        {
            printf("\nDigite o elemento %i: ",i+1);
            scanf("%i",&c2.elemento[i]);
        }
        else{
            c2.tamanho=i;
            break;
        }
    }
    //limpa tela
    printf("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    //imprime conjunto 1
    printf("\nConjunto 1 :\n");
    imprimeConjunto(&c1);

    //imprime conjunto 2
    printf("\nConjunto 2 :\n");
    imprimeConjunto(&c2);

    //imprime a união
    printf("\nUniao dos conjuntos:\n");
    uniaoConjunto(&c1,&c2,&c3);
    imprimeConjunto(&c3);

    //imprime a intersecção
    printf("\nInterseccao dos conjuntos:\n");
    InicializaConjunto(&c3);
    intersecConjunto(&c1,&c2,&c3);
    imprimeConjunto(&c3);

    //verifica se são iguais e imprime
    printf("\nConjuntos iguais ? : ");
    if(conjuntosIguais(&c1,&c2)==1) printf("Sim");
    else printf("Nao");

}

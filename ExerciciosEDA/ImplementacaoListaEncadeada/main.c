#include <stdio.h>
#include <stdlib.h>
#include "ListaEncadeada.h"

void main()
{
    int adcNumero;
    Celula *LISTA = (Celula *) malloc(sizeof(Celula));
    criaLista(LISTA);
    imprimeLista(LISTA);

    do
    {
        printf("\nDigite um numero:");
        scanf("%d",&adcNumero);
        insereFim(LISTA,adcNumero);
        printf("Digite a para adicionar outro valor ou qualquer outra tecla para sair.\n");
    }
    while(getch()=='a');
    imprimeLista(LISTA);

    printf("\nDeseja buscar algum item na lista?(s/n)");
    if(getch()=='s')
    {
        printf("\nInforme o numero que deseja buscar:");
        scanf("%d,",&adcNumero);
        if(busca(adcNumero,LISTA))
        {
            printf("\nO numero esta na lista!\n");
            imprimeLista(LISTA);
        }
        else
        {
            printf("\nO numero nao esta na lista");
        }
    }
    printf("\nDeseja excluir algum item na lista?(s/n)");
    if(getch()=='s')
    {
        printf("\nInforme o numero que deseja excluir:");
        scanf("%d,",&adcNumero);
        excluiInfo(adcNumero,LISTA);
        imprimeLista(LISTA);
    }
    printf("\nDeseja Liberar a lista ?(s/n)");
    if(getch()=='s')
    {
        criaLista(LISTA);
        imprimeLista(LISTA);

    }
}

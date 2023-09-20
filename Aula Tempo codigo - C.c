#include <stdio.h>
#include <time.h>

int main()
{
    clock_t inicial, final;
    double tempoCPU;
    int diletra;
        scanf("%i", &diletra);
    
    
    inicial = clock();
    printf("Ola mundo\n");
    final = clock();
    
    tempoCPU = ((double) (final - inicial))/CLOCKS_PER_SEC;
    
    printf("%f", tempoCPU);
    
    return(0);    
}

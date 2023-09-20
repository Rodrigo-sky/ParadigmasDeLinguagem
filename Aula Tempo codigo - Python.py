import time;

#Parte 1 - exibir "Ola mundo"
print("Parte um\n")
inicioParteUm = time.time ()

print ("Ola mundo");

fimParteUm = time.time ()

print ("Tempo total: " + str (fimParteUm - inicioParteUm))


#Parte 2 - exibir Pares de 0 a 60
print("\nParte dois\n")
inicio = time.time ()
i = 0;
Epar = 0;

while(i < 600):
    if(i%2 == 0):
        print(i);
    i = i+1;

fim = time.time ()

print ("Tempo total: " + str (fim - inicio))

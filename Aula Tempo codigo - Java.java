import java.util.Date;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Parte Um\n\n");
        long tempoinicial1 = new Date().getTime(); // Inicialize a variável tempoinicial para a primeira parte
        System.out.println("Ola Mundo");
        long tempofinal1 = new Date().getTime(); // Inicialize a variável tempofinal para a primeira parte
        System.out.println("Tempo em milissegundos (Parte Um): " + (tempofinal1 - tempoinicial1));
        
        System.out.println("\n\nParte dois\n\n");
        long tempoinicial2 = new Date().getTime(); // Inicialize a variável tempoinicial para a segunda parte
        
        int i = 0;
        while (i < 600000) {
            System.out.println(i);
            i++;
        }
        
        long tempofinal2 = new Date().getTime(); // Inicialize a variável tempofinal para a segunda parte
        System.out.println("Tempo em milissegundos (Parte dois): " + (tempofinal2 - tempoinicial2));
    }
}

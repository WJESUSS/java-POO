package ListaNomes;

import java.util.Scanner;

public class ListaNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[7];

 
        for (int i = 0; i < 7; i++) {
            System.out.print("Digite um nome: ");
            nomes[i] = scanner.nextLine();
        }

    
        System.out.println("Nomes na ordem inversa:");
        for (int i = 6; i >= 0; i--) {
            System.out.println(nomes[i]);
        }

        scanner.close();
    }
}

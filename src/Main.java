import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Foguete> foguetes = new ArrayList<>();
        ArrayList<Satelite> satelites = new ArrayList<>();

        System.out.print("Quantos foguetes deseja cadastrar? ");
        int qtdFoguetes = input.nextInt();
        input.nextLine();

        for (int i = 0; i < qtdFoguetes; i++) {

            System.out.println("\nFoguete " + (i + 1));

            System.out.print("Nome: ");
            String nome = input.nextLine();

            System.out.print("Combustível: ");
            float combustivel = input.nextFloat();

            System.out.print("Carga: ");
            float carga = input.nextFloat();
            input.nextLine();

            foguetes.add(new Foguete(nome, combustivel, carga));
        }

        System.out.print("\nQuantos satélites deseja cadastrar? ");
        int qtdSatelites = input.nextInt();
        input.nextLine();

        for (int i = 0; i < qtdSatelites; i++) {

            System.out.println("\nSatélite " + (i + 1));

            System.out.print("Nome: ");
            String nome = input.nextLine();

            System.out.print("Massa: ");
            float massa = input.nextFloat();
            input.nextLine();

            System.out.print("Órbita: ");
            String orbita = input.nextLine();

            System.out.print("Energia: ");
            float energia = input.nextFloat();
            input.nextLine();

            satelites.add(new Satelite(nome, massa, orbita, energia));
        }
        
        for (Foguete f : foguetes) {
            System.out.println("\n" + f);
            f.lancar();
        }

        for (Satelite s : satelites) {
            System.out.println("\n" + s);
            s.ativarPainel();
            s.enviarDados("Teste de envio");
        }
    }
}

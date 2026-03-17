import java.util.ArrayList;
import java.util.Scanner;

public class Missao_Geral {

    static Scanner input = new Scanner(System.in);
    static int contador = 1;

    public static void enviarMissao(
            ArrayList<String> Missao,
            ArrayList<Satelite> Satelite,
            ArrayList<Foguete> Foguete) {

        while (true) {

            System.out.println("\nIniciar missão?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");

            int resposta = input.nextInt();
            input.nextLine();

            if (resposta == 2) {
                System.out.println("Missão cancelada.");
                break;
            }

            System.out.print("Nome do foguete: ");
            String nomeFoguete = input.nextLine().toLowerCase();

            System.out.print("Nome do satélite: ");
            String nomeSatelite = input.nextLine().toLowerCase();

            for (Foguete f : Foguete) {

                if (f.getNome().toLowerCase().equals(nomeFoguete)) {

                    if (f.lancar()) {

                        String novaMissao =
                                "\n--- Missão ---" +
                                        "\nID: " + contador +
                                        "\nSatélite: " + nomeSatelite +
                                        "\nFoguete: " + nomeFoguete;

                        Missao.add(novaMissao);

                        System.out.println("Missão criada! ID: " + contador);

                        contador++;

                        for (Satelite s : Satelite) {

                        }

                    } else {
                        System.out.println("Falha: combustível insuficiente.");
                    }
                }
            }
        }
    }
}
import java.util.ArrayList;
import java.util.Scanner;

public class Relatorios_Geral {

    public static void enviardados(
            ArrayList<String> missoes,
            ArrayList<Satelite> satelites,
            int idMissao) {

        Scanner input = new Scanner(System.in);

        System.out.println("\nDigite os dados do satélite:");

        System.out.print("Temperatura: ");
        double temperatura = input.nextDouble();

        System.out.print("Radiação: ");
        double radiacao = input.nextDouble();

        System.out.print("Posição orbital: ");
        double posicao = input.nextDouble();

        for (String m : missoes) {

            if (m.contains("ID: " + idMissao)) {

                for (Satelite s : satelites) {

                    if (m.contains(s.getNome())) {

                        System.out.println("\n===== Dados do Satélite =====");
                        System.out.println("Temperatura: " + temperatura + " °C");
                        System.out.println("Radiação: " + radiacao + " RAD");
                        System.out.println("Posição orbital: " + posicao + "°");
                        System.out.println("==============================");
                    }
                }
            }
        }
    }
}

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Foguete> foguetes = new ArrayList<>();
        ArrayList<Satelite> satelites = new ArrayList<>();

        // ================= CRIANDO OBJETOS =================
        Foguete foguete1 = new Foguete("Bolsonaro", 120f, 500f);
        Foguete foguete2 = new Foguete("Lula", 40f, 300f);

        Satelite satelite1 = new Satelite("Hubble", 200f, "LEO", 100f);
        Satelite satelite2 = new Satelite("GPS", 150f, "MEO", 80f);

        foguetes.add(foguete1);
        foguetes.add(foguete2);

        satelites.add(satelite1);
        satelites.add(satelite2);

        // ================= RELATÓRIO INICIAL =================
        System.out.println("===== RELATÓRIO INICIAL =====");

        for (Foguete f : foguetes) {
            System.out.println(f);
        }

        for (Satelite s : satelites) {
            System.out.println(s);
        }

        // ================= LANÇAMENTO =================
        System.out.println("\n===== LANÇAMENTO =====");

        if (foguete1.lancar()) {
            System.out.println("Satélite " + satelite1.getNome() + " foi enviado!");

            satelite1.ativarPainel();
            satelite1.enviarDados("Dados da missão");
        } else {
            System.out.println("Falha no lançamento!");
        }

        // ================= RELATÓRIO FINAL =================
        System.out.println("\n===== RELATÓRIO FINAL =====");

        for (Foguete f : foguetes) {
            System.out.println(f);
        }

        for (Satelite s : satelites) {
            System.out.println(s);
        }
    }
}

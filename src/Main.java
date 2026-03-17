import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Listas
        ArrayList<Foguete> foguetes = new ArrayList<>();
        ArrayList<Satelite> satelites = new ArrayList<>();

        // Criando foguetes
        Foguete f1 = new Foguete("Apollo", 1000, 500);
        Foguete f2 = new Foguete("Falcon", 50, 300);

        foguetes.add(f1);
        foguetes.add(f2);

        // Criando satélites
        Satelite s1 = new Satelite("Hubble", 200, "Lua", 100);
        Satelite s2 = new Satelite("JamesWebb", 300, "Marte", 80);

        satelites.add(s1);
        satelites.add(s2);

        // Testando foguetes
        for (Foguete f : foguetes) {
            System.out.println(f);
            f.lancar();
            System.out.println();
        }

        // Testando satélites
        for (Satelite s : satelites) {
            System.out.println(s);
            s.ativarPainel();
            s.enviarDados("Imagem capturada");
            System.out.println();
        }
    }
}
public class Foguete {

    private String nome;
    private float combustivel;
    private float carga;
    private String status;

    public Foguete(String nome, float combustivel, float carga) {
        this.nome = nome;
        this.combustivel = combustivel;
        this.carga = carga;
        this.status = "Pronto";
    }

    public void abastecer(float quantidade) {
        combustivel += quantidade;
    }

    public boolean lancar() {

        if (combustivel >= 100) {
            status = "Lançado";
            System.out.println("Foguete " + nome + " lançado com sucesso!");
            return true;
        } else {
            status = "Falha";
            System.out.println("Foguete " + nome + " não tem combustível suficiente.");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Foguete: " + nome +
                "\nCombustível: " + combustivel +
                "\nCarga: " + carga +
                "\nStatus: " + status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
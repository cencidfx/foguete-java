public class Satelite {

    private String nome;
    private float massa;
    private String orbita;
    private float energia;
    private boolean ativo;

    public Satelite(String nome, float massa, String orbita, float energia) {
        this.nome = nome;
        this.massa = massa;
        this.orbita = orbita;
        this.energia = energia;
        this.ativo = true;
    }

    public boolean ativarPainel() {

        energia -= 20;

        if (energia <= 0) {
            ativo = false;
            System.out.println("Satélite " + nome + " ficou sem energia.");
            return false;
        }

        System.out.println("Painéis solares ativados no satélite " + nome);
        return true;
    }

    public void enviarDados(String mensagem) {

        if (ativo) {
            System.out.println("Satélite " + nome + " enviou: " + mensagem);
        } else {
            System.out.println("Satélite desligado.");
        }
    }

    @Override
    public String toString() {
        return "Satélite: " + nome +
                "\nMassa: " + massa +
                "\nÓrbita: " + orbita +
                "\nEnergia: " + energia;
    }

    public CharSequence getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
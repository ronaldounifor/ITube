package observer;

public class Usuario implements Observador {
    private String nome;
    private int idade;
    private String email;

    public Usuario(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    @Override
    public void atualizar(Observavel observavel) {
        Canal canal = (Canal) observavel;

        //Envio de uma notificação fantástica
        System.out.println(nome + " recebeu notificação.");
        System.out.println(canal);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

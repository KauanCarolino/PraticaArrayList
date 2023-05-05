package ArrayList;

public class Cliente {
    private String nome;
    private String endereco;
    private String contato;
    private String cpf;
    private double limite;

    public Cliente(String nome, String endereco, String contato, String cpf, double limite) {
        this.nome = nome;
        this.endereco = endereco;
        this.contato = contato;
        this.cpf = cpf;
        this.limite = limite;
    }

    public Cliente() {
        super();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}

public class Filme{
    private int codigo;
    private String nome;
    private double valor;
    private boolean disponivel;

    //faça os geots e os sets

    public void setNumero(int numero) {
        this.codigo = numero;
    }

    public int getNumero() {
        return this.codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public boolean isDisponivel() {
        return this.disponivel;
    }

}
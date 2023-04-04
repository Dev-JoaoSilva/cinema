public class Principal {
    public static void main(String[] args) {

        Filme f = new Filme();
        // set todas as informações do filme
        f.setCodigo(31);
        f.setNome("Homem aranha");
        f.setValor(30);

        f.setDisponivel(false);
        if (f.isDisponivel()) {

            System.out.println("Código: " + f.getCodigo());
            System.out.println("Nome do filme: " + f.getNome());
            System.out.println("Valor: " + f.getValor());

        } else {
            System.out.print("Não está disponível");
        }
    }
}

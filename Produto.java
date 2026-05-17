public class Produto {

    public String nome;
    public double preco;
    public int quantidadeEstoque;

    public void vender(int quantidade) {

        if (quantidade <= quantidadeEstoque) {
            quantidadeEstoque -= quantidade;
        } else {
            System.out.println();
        }
    }

    public void repor(int quantidade) {
        quantidadeEstoque += quantidade;
    }

    public double calcularValorTotal() {
        return preco * quantidadeEstoque;
    }

    public void exibirInformacoes() {

        System.out.println(
            "Produto: " + nome +
            " | Preço: R$ " + preco +
            " | Estoque: " + quantidadeEstoque + " unidades"
        );

        System.out.println(
            "Valor total em estoque: R$ " + calcularValorTotal()
        );
    }
}
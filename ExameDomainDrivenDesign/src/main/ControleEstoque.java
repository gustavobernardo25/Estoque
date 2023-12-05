package main;

import java.util.List;
import java.util.ArrayList;


class ControleEstoque {
    private List<Produto> produtos;

    public ControleEstoque() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado ao estoque.");
    }

    public void exibirProdutosMarca(String marca) {
        System.out.println("Produtos da marca " + marca + ":");
        for (Produto produto : produtos) {
            if (produto.getMarca().equalsIgnoreCase(marca)) {
                produto.exibirInformacoes();
                System.out.println("------------------------------");
            }
        }
    }

    public void exibirProdutosEstoqueBaixo() {
        System.out.println("Produtos com estoque baixo:");
        for (Produto produto : produtos) {
            if (produto.getQuantidadeEmEstoque() < produto.getEstoqueMinimo()) {
                produto.exibirInformacoes();
                System.out.println("------------------------------");
            }
        }
    }

    public double calcularValorTotalEstoque() {
        double valorTotal = 0;
        for (Produto produto : produtos) {
            valorTotal += produto.calcularValorTotal();
        }
        return valorTotal;
    }
}
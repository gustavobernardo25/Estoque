package main;
import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        ControleEstoque sistema = new ControleEstoque();
        Scanner scanner = new Scanner(System.in);

        // Exemplo de uso
        Produto produto1 = new Produto("Produto1", "Marca1", "Categoria1", 10.0, 20, 5);
        Produto produto2 = new ProdutoPerecivel("Produto2", "Marca2", "Categoria2", 15.0, 15, 3, 0.5, "01/01/2023");

        sistema.adicionarProduto(produto1);
        sistema.adicionarProduto(produto2);

        sistema.exibirProdutosMarca("Marca1");
        sistema.exibirProdutosEstoqueBaixo();

        double valorTotalEstoque = sistema.calcularValorTotalEstoque();
        System.out.println("Valor Total do Estoque: " + valorTotalEstoque);

        scanner.close();
    }
}
package main;
class ProdutoPerecivel extends Produto {
    private double peso;
    private String dataValidade;

    // Construtor para produtos perecíveis
    public ProdutoPerecivel(String nome, String marca, String categoria, double preco, int quantidadeEmEstoque, int estoqueMinimo, double peso, String dataValidade) {
        super(nome, marca, categoria, preco, quantidadeEmEstoque, estoqueMinimo);
        this.peso = peso;
        this.dataValidade = dataValidade;
    }

    // Getters para as propriedades específicas de produtos perecíveis

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Peso: " + peso);
        System.out.println("Data de Validade: " + dataValidade);
    }
}
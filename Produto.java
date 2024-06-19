import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Produto {
    private String codigoDeBarras;
    private String nome;
    private String ingredientes;

    public Produto(String codigoDeBarras, String nome, String ingredientes) {
        this.codigoDeBarras = codigoDeBarras;
        this.nome = nome;
        this.ingredientes = ingredientes;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public String getNome() {
        return nome;
    }

    public String getIngredientes() {
        return ingredientes;
    }
}

class Sistema {
    private Map<String, Produto> bancoDeProdutos;

    public Sistema() {
        bancoDeProdutos = new HashMap<>();
        inicializarProdutos();
    }

    private void inicializarProdutos() {
        // Adicionando alguns produtos ao banco de dados
        bancoDeProdutos.put("1234567890123", new Produto("1234567890123", "Biscoito Recheado", "Farinha de trigo, açúcar, óleo vegetal, cacau, leite em pó, fermento químico, emulsificante"));
        bancoDeProdutos.put("9876543210987", new Produto("9876543210987", "Leite Integral", "Leite integral"));
        bancoDeProdutos.put("1928374650912", new Produto("1928374650912", "Suco de Laranja", "Suco de laranja concentrado, água, açúcar"));
    }

    public Produto buscarProdutoPorCodigo(String codigoDeBarras) {
        return bancoDeProdutos.get(codigoDeBarras);
    }
}

public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Sistema de Identificação de Ingredientes!");
        System.out.print("Informe o código de barras do produto: ");
        String codigoDeBarras = scanner.nextLine();

        Produto produto = sistema.buscarProdutoPorCodigo(codigoDeBarras);

        if (produto != null) {
            System.out.println("Produto: " + produto.getNome());
            System.out.println("Ingredientes: " + produto.getIngredientes());
        } else {
            System.out.println("Produto não encontrado.");
        }

        scanner.close();
    }
}

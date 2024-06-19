import java.util.Scanner;

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

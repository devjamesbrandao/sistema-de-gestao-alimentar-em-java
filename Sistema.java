import java.util.HashMap;
import java.util.Map;

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

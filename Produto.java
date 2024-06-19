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

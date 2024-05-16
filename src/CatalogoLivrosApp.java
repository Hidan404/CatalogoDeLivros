public class CatalogoLivrosApp {
    public static void main(String[] args) {
        CatalogoLivros livros = new CatalogoLivros();

        livros.adicionarLivros("Morte", "thanos", 2025);
        livros.adicionarLivros("Marte", "Paulo coelho", 2015);
        livros.adicionarLivros("Saturno", "tifoid", 2005);

        livros.pesquisarPorAutor("thanos");
        livros.pesquisarPorIntervaloAnos(2026,2029);
    }
}

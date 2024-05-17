public class CatalogoLivrosApp {
    public static void main(String[] args) {
        CatalogoLivros livros = new CatalogoLivros();

        livros.adicionarLivros("Morte", "thanos", 2025);
        livros.adicionarLivros("Marte", "Paulo coelho", 2015);
        livros.adicionarLivros("Saturno", "tifoid", 2005);

       

        livros.pesquisarPorTitulor("Morte");
        livros.pesquisarPorIntervaloAnos(2000,2005);
        livros.pesquisarPorAutor("Paulo coelho");
    }
}

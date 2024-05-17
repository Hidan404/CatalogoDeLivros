import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    List<Livros> livros = new ArrayList<>();

    public void adicionarLivros(String titulo, String autor,int ano ){
        livros.add(new Livros(titulo, autor, ano));
    }

    public void pesquisarPorAutor(String autor){
        List<Livros> livrosAutor = new ArrayList<>();

        if(!livros.isEmpty()){
            for (Livros livros2 : livros) {
                if(livros2.getAutor().trim().equalsIgnoreCase(autor)){
                    livrosAutor.add(livros2);
                }
            }
        }
        else{
            System.out.println("Lista nao tem autor selecionado");
        }
        System.out.println(livrosAutor);
    }

    public void pesquisarPorTitulor(String autor){
        Livros livroporTitulo = null;

        if(!livros.isEmpty()){
            for (Livros livros2 : livros) {
                if(livros2.getTitulo().trim().equalsIgnoreCase(autor)){
                    livroporTitulo = livros2;
                }
            }
            
        }
        else{
            System.out.println("Lista nao tem titulo selecionado");
        }
        System.out.println(livroporTitulo);
    }
    
    public List<Livros> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livros> livrosAno = new ArrayList<>();

        if(!livros.isEmpty()){
            for (Livros livros2 : livros) {
                if(livros2.getAno() >= anoInicial && livros2.getAno() <= anoFinal){
                    livrosAno.add(livros2);
                }
            }
            System.out.println(livrosAno);
        }
        else{
            System.out.println("Nao encontrou nenhum livro entre esses periodos");
        }
        return livrosAno;
    }
}

import java.time.LocalDate;
import java.util.ArrayList;

public class Livro {
    public String titulo;
    public Autor autor;
    public float preco;
    public LocalDate dataLancamento;
    ArrayList<Livro> listaLivros = new ArrayList<>();

    public void CadastrarLivro( Livro novoLivro){
        listaLivros.add(novoLivro);
        System.out.println("suSeXo");
    }
}

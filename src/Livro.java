import java.time.LocalDate;

public class Livro {
    public String titulo;
    public String autor;
    public Float preco;
    public LocalDate dataLancamento;

    public int calcularData(LocalDate dataLancamento) {

        if (dataLancamento>= 5) {
            return 0;
        }
        return 0;


    }
}
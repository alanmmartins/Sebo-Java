import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

//- Exercício:
//        Você deve montar um sistema de cadastro e listagem de livros para um sebo que só aceita livros com mais de 5  anos de lançamento.
//        Seu PO fez uma reunião com o dono do sebo e fez uma modelagem para que você possa se basear e criar o  sistema.
public class Main {
    public static void main(String[] args) {
       /* ArrayList<Livro> listaLivros = new ArrayList<>();*/

        System.out.print("Bem vindo ao sistema de Sebo!");

        Livro novoLivro = new Livro();
        Autor novoAutor = new Autor();

        Livro metodoLivro = new Livro();

        Scanner scanner = new Scanner(System.in);

        int opcao;

        do{
            System.out.println("Escolha uma opção: \n 1 - Cadastrar livro \n 2 - Listar livros \n 0 - Sair");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:

                    System.out.print("Digite o nome do livro que deseja cadastrar \n R : ");
                    novoLivro.titulo = scanner.next();

                    System.out.print("Digite o autor do livro que deseja cadastrar \n R :  ");
                    novoAutor.nome = scanner.next();

                    System.out.print("Digite o local de nascimento do autor \n R :  ");
                    novoAutor.localNasc = scanner.next();

                    System.out.print("Digite o preço do livro \n R :  ");
                    novoLivro.preco = scanner.nextFloat();

                    System.out.print("Digite a data de lançamento do livro \n R :  ");
                    LocalDate date = LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("dd/MM/yyy"));
                    Period periodo = Period.between(date, LocalDate.now());

                    novoLivro.dataLancamento = date;

                    if(periodo.getYears() > 5){
                        System.out.println("O livro tem mais de cinco anos de lançamento.");
                    } else{
                        System.out.println("O livro tem menos de cinco anos de lançamento. \n Voltando ao menu anterior");
                        break;
                    }

                    metodoLivro.CadastrarLivro(novoLivro);
                    /*listaLivros.add(novoLivro);*/

                  /*  System.out.println("Livro cadastrado com sucesso!");*/
                    break;

                case 2:
                    if (metodoLivro.listaLivros.isEmpty()) {
                        System.out.println("Lista vazia.\n Voltando ao menu anterior.");
                    } else {
                        for(Livro cadaLivro : metodoLivro.listaLivros){
                            System.out.println();
                            System.out.println("Título do livro: " + cadaLivro.titulo);
                            System.out.println("Autor do livro: " + novoAutor.nome);
                            System.out.println("Preço do livro: R$" + cadaLivro.preco);
                            System.out.println("Data de lançamento do livro: " + cadaLivro.dataLancamento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                            System.out.println();
                        }
                    }

                    System.out.print("Fim da Lista.");
                    break;

                case 0:
                    System.out.print("Obrigado volte sempre !");
                    break;

                default:
                    System.out.print("A opção " + opcao + " não é válida! \n Digite uma opção válida.");
                    break;
            }
        } while (opcao != 0);
    }
}
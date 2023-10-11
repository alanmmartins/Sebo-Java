import jdk.internal.classfile.BufWriter;
import jdk.internal.icu.text.UnicodeSet;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    ArrayList<Livro>novoLivro = new ArrayList<>();
    private static String Livro;

    public static void main(String[] args) {
        ArrayListist<Livro> dataLancamento = new ArrayListist<>();


        System.out.println("Bem vindo ao sistema do SEBO Senai");

        Scanner leitor = new Scanner(System.in);


        String opcao;


        System.out.println("Escolha uma opção 1 -Livro   / 2 - autor / 0 - Sair");
        opcao = leitor.nextLine();

        switch (opcao) {
            case "1":

                String opcaoLivro;
                do {
                    System.out.println("Digite uma opção: 1 - Cadastrar livro / 2 - Listar livro / 0 - Voltar");
                    opcaoLivro = leitor.nextLine();

                    switch (opcaoLivro) {

                        case "1":

                            Livro novoLivro = new Livro();
                            System.out.println("Digite o titulo: ");
                            novoLivro.titulo = leitor.nextLine();

                            System.out.println("Digite o Autor: ");
                            novoLivro.autor = leitor.nextLine();

                            System.out.println("Digite o Preco: ");
                            novoLivro.preco = Float.valueOf(leitor.nextLine());


                            System.out.println("Digite a data de lancamento: (dd/mm/aaaa)");
                            novoLivro.dataLancamento = LocalDate.parse(leitor.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy")); //convertendo tipo data / DateTimeFormatter.ofPattern("") > definindo padrao da data


                            Period Livro = Period.between(novoLivro.dataLancamento, LocalDate.now());


                            if (Livro.getYears() >= 5) {
                                System.out.println("data Válida e dentroo!");
                            } else {
                                System.out.println("data Inválida");
                                break;
                            }



                            System.out.println("Livro cadastrado com sucesso! :)");

                            break;
                        case "2":


                            if (Livro.size() > 0) {
                                for (Livro cadaLivro : novoLivro.getYears()) {
                                    System.out.println("Titulo " + cadaLivro.titulo);
                                    System.out.println("Autor " + cadaLivro.autor);
                                    System.out.println("Data de lancamento " + cadaLivro.dataLancamento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                                    System.out.println("Preco " + cadaLivro.preco);
                                    System.out.println();
                                    System.out.println("Aperte ENTER para continuar");
                                    leitor.nextLine();
                                }
                            }else  {
                                System.out.println("A lista vazia");
                            }
                            break;


                        case "0":
                            System.out.println("volta");
                            break;
                        default:

                            break;
                    }
                } while (!opcaoLivro.equals("0"));

                break;


        }
    }

    private static class ArrayListist<T> {
    }
}
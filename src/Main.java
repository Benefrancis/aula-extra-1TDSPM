import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Hello world!");

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o seu nome");
        String nome = leitor.nextLine();


        System.out.println("Informe o ano de nascimento");
        Integer ano = leitor.nextInt();

        System.out.println("Informe o mes de nascimento");
        Integer mes = leitor.nextInt();

        System.out.println("Informe o dia de nascimento");
        Integer dia = leitor.nextInt();


        Pessoa pessoa = new Pessoa();
        pessoa.nome = nome;
        pessoa.nascimento = LocalDate.of(ano, mes, dia);

        System.out.println(pessoa.faleOsSeusDadosBasicos());

    }
}
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        System.out.print("Nome: ");
        pessoa.setNome(scanner.nextLine());
        System.out.print("Sobrenome: ");
        pessoa.setSobrenome(scanner.nextLine());
        System.out.print("Idade: ");
        pessoa.setIdade(scanner.nextInt());
        System.out.print("Altura: ");
        pessoa.setAltura(scanner.nextDouble());
        System.out.print("Peso: ");
        pessoa.setPeso(scanner.nextDouble());
        pessoa.informaObesidade();
        scanner.close();
    }
}

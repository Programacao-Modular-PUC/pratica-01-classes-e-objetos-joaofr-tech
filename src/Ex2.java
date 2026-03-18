import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Sobrenome: ");
        String sobrenome = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        System.out.print("Altura (m): ");
        double altura = scanner.nextDouble();
        System.out.print("Peso (kg): ");
        double peso = scanner.nextDouble();

        Pessoa pessoa = new Pessoa(nome, sobrenome, idade, altura, peso);
        pessoa.calculaIMC();
        System.out.println("IMC: "+pessoa.getIMC());
        pessoa.informaObesidade();
        scanner.close();
    }
}

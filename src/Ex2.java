import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa("Joao", "Francisco", 19, 1.75, 65);
        pessoa.informaObesidade();
        scanner.close();
    }
}

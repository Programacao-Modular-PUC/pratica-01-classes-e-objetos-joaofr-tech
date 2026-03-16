import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Pitagoras pitagoras = new Pitagoras(32, 4);
        System.out.println("Area: "+pitagoras.calculaArea());
        System.out.println("Hipotenusa: "+pitagoras.calculaHipotenusa());
    }
}

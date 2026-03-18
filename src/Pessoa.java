import static java.lang.Math.pow;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;
    private double peso;
    private double IMC;

    public Pessoa(String nome, String sobrenome, int idade, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public void calculaIMC(){
        this.IMC = this.peso/pow(this.altura, 2);
    }

    public void informaObesidade(){
        if (IMC < 18.5){
            System.out.println("Abaixo do peso");
        } else if (IMC < 25){
            System.out.println("Peso normal");
        } else if (IMC < 30){
            System.out.println("Sobrepeso");
        } else if (IMC < 35){
            System.out.println("Obesidade Grau 1");
        } else if (IMC < 40){
            System.out.println("Obesidade Grau 2");
        } else {
            System.out.println("Obesidade Grau 3");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getIMC() {
        return IMC;
    }

    public void setIMC(double IMC) {
        this.IMC = IMC;
    }
}

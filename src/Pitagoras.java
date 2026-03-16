import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Pitagoras {
    double h;
    double c1;
    double c2;

    public Pitagoras(double c1, double c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public double calculaArea(){
        return this.c1 * this.c2;
    }

    public double calculaHipotenusa(){
        this.h = sqrt(pow(this.c1, 2) + pow(this.c2, 2));
        return this.h;
    }
}

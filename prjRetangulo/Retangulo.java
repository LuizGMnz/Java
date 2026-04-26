/**
 *
 * @author Luiz Gustavo
 */
public class Retangulo {
    private double altura;
    private double base;

    public  void setAltura(double altura){
        this.altura = altura;
    }
    public void setBase(double base){
        this.base = base;
    }
    public double getAltura(){
        return altura;
    }
    public double getBase(){
        return base;
    }
    public double calcArea(){
        return base * altura;
    }
    public double calcPerimetro(){
        return 2 * (base + altura);
    }
}

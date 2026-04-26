/**
 *
 * @author Luiz Gustavo
 */
import java.util.Scanner;

public class Aplic {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Retangulo Retangulo1 = new Retangulo();
        
        System.out.println("Calcular Retângulo");
        
        System.out.println("Digite o valor da BASE: ");
        double base = ler.nextDouble();
        Retangulo1.setBase(base);
        
        System.out.println("Digite o valor da ALTURA: ");
        double altura = ler.nextDouble();
        Retangulo1.setAltura(altura);
        
        System.out.println("Informações do Retangulo 1:");
        System.out.println("Base: " + Retangulo1.getBase());
        System.out.println("Altura: " + Retangulo1.getAltura());
        System.out.println("Área: " + Retangulo1.calcArea());
        System.out.println("Perímetro: " + Retangulo1.calcPerimetro());
    }
}

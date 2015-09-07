package fatec.poo.aula1;

import java.util.Scanner;

/**
 *
 * @author dimas
 */
public class Aplic1 {
    public static void main(String[] args) {
       Scanner Entrada = new Scanner(System.in);
       double medBase, medAlt;
       
       System.out.println("Digite a medida da base: ");
       medBase = Entrada.nextDouble();
       System.out.println("Digite a medida da altura: ");
       medAlt = Entrada.nextDouble();
       
        //instanciação do objeto
       Retangulo objRet = new Retangulo(medBase, medAlt);         
               
       System.out.println("Area: " + 
                           objRet.calcArea());
       System.out.println("Perimetro: " + 
                       objRet.calcPerimetro());
       System.out.println("Diagonal: " + 
                       objRet.calcDiagonal());
       
    }    
}

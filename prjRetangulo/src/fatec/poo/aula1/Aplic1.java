package fatec.poo.aula1;

import java.util.Scanner;

public class Aplic1 {

    public static void main(String[] args) {

        Scanner Entrada = new Scanner(System.in);
        
        Retangulo objRet = new Retangulo();
        
        double medBase, medAltura;
        
        System.out.println("Digite a medida da base: ");
        medBase=Entrada.nextDouble();
        
        System.out.println("Digite a medida da altura: ");
        medAltura=Entrada.nextDouble();
        
        objRet.setBase(medBase);
        objRet.setAltura(medAltura);
        
        System.out.println("Area: " + objRet.calcArea());
        System.out.println("Perímetro: " + objRet.calcPerimetro()); 
        System.out.println("Diagonal: " + objRet.calcDiagonal()); 
        
    }
    
}

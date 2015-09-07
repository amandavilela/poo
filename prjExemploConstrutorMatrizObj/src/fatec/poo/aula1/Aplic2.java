package fatec.poo.aula1;

import java.util.Scanner;

public class Aplic2 {
    
    public static void main(String[] args){
        
        Scanner Entrada = new Scanner(System.in);
        double medBase, medAlt;
        
        Retangulo[] retangulos = new Retangulo[5];
        
        for(int cont=0;cont<retangulos.length;cont++){
            System.out.println("Digite a medida da base: ");
            medBase=Entrada.nextDouble();
            System.out.println("Digite a medida da altura: ");
            medAlt=Entrada.nextDouble();
            
            retangulos[cont] = new Retangulo(medBase, medAlt);
            
        }
        
        for(int cont=0;cont<retangulos.length;cont++){
        
            System.out.println("\n\nObjeto retangulo " + cont);
            System.out.println("\n\nBase = " + retangulos[cont].getBase());
            System.out.println("\n\nAltura = " + retangulos[cont].getAltura());
            System.out.println("\n\nArea = " + retangulos[cont].calcArea());
            System.out.println("\n\nPerímetro = " + retangulos[cont].calcPerimetro());
            System.out.println("\n\nDiagonal = " + retangulos[cont].calcDiagonal());
            
        }
        
    }
    
}

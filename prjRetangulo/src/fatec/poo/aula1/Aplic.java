package fatec.poo.aula1;

public class Aplic {

    public static void main(String[] args) {
        
        Retangulo objRet; // Definição do ponteiro
        
        //Instanciação do objeto
        objRet= new Retangulo();
        
        //Passagem de mensagens
        objRet.setBase(5);
        objRet.setAltura(8);
        
        System.out.println("Medida da base: " + objRet.getBase());
        System.out.println("Medida da altura: " + objRet.getAltura());
        System.out.println("Área: " + objRet.calcArea());
        System.out.println("Perímetro: " + objRet.calcPerimetro());
        
    }
    
}

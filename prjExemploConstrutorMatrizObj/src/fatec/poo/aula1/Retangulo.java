package fatec.poo.aula1;

public class Retangulo {
    private double base;
    private double altura;
    
    public Retangulo(double b, double a){
        base=b;
        altura=a;
    }
        
    public void setBase(double b){
        base = b;
    }    
    public void setAltura(double a){
        altura = a;
    }
    public double getBase(){
        return(base);
    }
    public double getAltura(){
        return(altura);
    }
    public double calcArea(){
        return(base * altura);
    }
    public double calcPerimetro(){
        return( 2 * (base + altura));
    }
    public double calcDiagonal(){
        return(Math.sqrt(Math.pow(base,2) + 
                         Math.pow(altura,2)));
    }
    
}

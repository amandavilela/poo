package fatec.poo.view;
import fatec.poo.model.Pessoa;

public class AplicCPF {

    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("404.762.128-55", "Amanda");
        System.out.println(pessoa.validaCPF("404.762.128-55"));
        
        
    }
    
}
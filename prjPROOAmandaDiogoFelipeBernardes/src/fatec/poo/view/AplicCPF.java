package fatec.poo.view;
import fatec.poo.model.Pessoa;

public class AplicCPF {

    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("40476212855", "Amanda");
        System.out.println(pessoa.validaCPF("40476212855"));
        
        
    }
    
}

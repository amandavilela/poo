package fatec.poo.view;
import fatec.poo.model.Pessoa;
import fatec.poo.model.ValidaCPF;
import fatec.poo.model.isNumeric;

public class AplicCPF {

    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("11111111111", "Amanda");
        System.out.println(ValidaCPF.validaCPF("11111111111"));
        System.out.println(isNumeric.isNumeric("asd"));
        
    }
    
}

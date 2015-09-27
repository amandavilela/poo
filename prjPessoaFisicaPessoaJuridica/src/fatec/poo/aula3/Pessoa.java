package fatec.poo.aula3;

public class Pessoa {
    private String nome;
    private String dataNasc;
    private String email;
    
    public Pessoa(String n, String dt){
        nome = n;
        dataNasc = dt;
    }
    
    public void setEmail(String em){
        email = em;
    }
    
    public String getNome(){
        return(nome);
    }
    
    public String getDataNasc(){
        return(dataNasc);
    }
    
    public String getEmail(){
        return(email);
    }
}    
 

package fatec.poo.aula3;

public class Aluno extends Pessoa{
    
    private int ra;
    private String escolaridade;
    private String dataMatricula;
    
    public Aluno(int r, String n, String dt, String e, String dtM){
        //chamada do método construtor da superclasse
        super(n, dt);
        ra=r;
        escolaridade = e;
        dataMatricula = dtM;
    }
    
    public int getRa(){
        return ra;
    }
    
    public String getEscolaridade(){
        return escolaridade;
    }
    
    public String getDataMatricula(){
        return dataMatricula;
    }
    
}

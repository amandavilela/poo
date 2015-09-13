package fatec.poo.aula3;

public class Professor extends Pessoa{

    private int regFunc;
    private String titularidade;
    private String dataAdmissao;
    
    public Professor(int r, String n, String dt, String dtA){
        super(n,dt);
        regFunc=r;
        dataAdmissao=dtA;
    }
    
    public void setTitularidade(String t){
        titularidade = t;
    }
    
    public int getRegFunc(){
        return regFunc;
    }
    
    public String getTitularidade(){
        return titularidade;
    }
    
    public String getDataAdmissao(){
        return dataAdmissao;
    }
    
}

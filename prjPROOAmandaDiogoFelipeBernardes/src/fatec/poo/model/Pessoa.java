package fatec.poo.model;

public class Pessoa {
    
    private String cpf;
    private String nome;
    private String endereco;
    private String cidade;
    private String cep;
    private String uf;
    private String ddd;
    private String telefone;
    
    public Pessoa(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }
    
    public String getCpf() {
        return cpf;
    }
     
    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public boolean validaCPF(String cpf) {
        int cpfArray[] = new int[11], dv1=0, dv2=0;  
  
        cpf = cpf.replace(".", "");  
        cpf = cpf.replace("-", "");  

        if (this.cpf.length()!=11) {  
            return false;  
        }

        for(int i=0;i<11;i++) {  
            cpf[i] = Integer.parseInt(this.cpf.substring(i, i+1));
        }
        for(int i=0;i<9;i++) {  
            dv1 += cpf[i] * (i+1);  
        }
        
        cpf[9] = dv1 = dv1 % 11;
        
        for(int i=0;i<10;i++) {  
            dv2 += cpf[i] * i;
        }
        cpf[10] = dv2 = dv2 % 11;  
        if(dv1>9) cpf[9]=0;      if(dv2>9) cpf[10]=0;  

        if(Integer.parseInt(this.cpf.substring(9,10))!= cpf[9]||  
                Integer.parseInt(this.cpf.substring(10,11))!=cpf[10])  
            return false;  
        else  
            return true; 
    }
    
}

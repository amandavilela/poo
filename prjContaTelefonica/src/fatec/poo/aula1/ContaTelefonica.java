package fatec.poo.aula1;

public class ContaTelefonica {
    private int numero;
    private int tipo;
    private int qtdePulsos;
    private int qtdeInter;
    private int qtdeServDesp;
    
    public void setNumero(int n) {
        numero = n;
    }
    
    public void setTipo(int t) {
        tipo = t;
    }
    
    public void setPulso(int pulsos) {
        qtdePulsos = pulsos;
    }

    public void setInterurbano(int interurbanos) {
        qtdeInter = interurbanos;
    }
    
    public void setDespertador(int despertador) {
        qtdeServDesp = despertador;
    }
    
    public int getNumero() {
        return numero;
    }

    public int getTipo() {
        return tipo;
    }

    public int getPulso() {
        return qtdePulsos;
    }

    public int getInterurbano() {
        return qtdeInter;
    }

    public int getDespertador() {
        return qtdeServDesp;
    }
    
    public double calcValorConta(){
        
    	double taxa = 0, vlrPulsos = 0, vlrInterurbano, vlrDesp;
    	
    	if (tipo==1){
            taxa = 10;
    	}
        else{
            taxa = 15;
    	}
    	
    	if(qtdePulsos>90){
    		vlrPulsos = (qtdePulsos-90)*0.05;
    	}
    	
    	vlrInterurbano = (qtdeInter*60)*0.08;
    	vlrDesp = qtdeServDesp*2;
    	
    	return(taxa+vlrPulsos+vlrInterurbano+vlrDesp);
    }
}

package fatec.poo.model;

public class Pedido {
    private int numero;
    private String dataEmissaoPedido;
    private String dataPagto;
    private boolean status;
    
    public Pedido(int numero, String dataEmissao) {
        this.numero = numero;
        this.dataEmissaoPedido = dataEmissao;
        this.status = true;
    }

    public int getNumero() {
        return numero;
    }

    public String getDataEmissaoPedido() {
        return dataEmissaoPedido;
    }

    public String getDataPagto() {
        return dataPagto;
    }

    public boolean isStatus() {
        return status;
    }

    public void setDataPagto(String dataPagto) {
        this.dataPagto = dataPagto;
        this.status = false;
    }
    
}

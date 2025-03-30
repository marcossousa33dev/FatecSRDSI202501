package packageOrientacao;

public class Conta {
    private int numero;
    private double saldo;
    private double limite;     
    
    public void deposita(double valor){
        this.saldo += valor;
        this.descontaTarifa();
    }
    
    public void saca(double valor){
        this.saldo -= valor;
        this.descontaTarifa();
    }
    
    private void descontaTarifa(){
        this.saldo -= 0.1;
    }
    
}

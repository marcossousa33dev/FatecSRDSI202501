package packageOrientacao;

public class TestaMetodosConta {

    public static void main(String[] args) {
        //Referencia de um objeto
        Conta c = new Conta();
        
        //Chamando o método deposita()
        c.deposita(1000);
        //c.imprimeExtrato();
        
        c.saca(100);
        //c.imprimeExtrato();
        
        //Armazenando a resposta de um método em variável
        //double saldoDisponivel = c.consultaSaldoDisponivel();
        //System.out.println("Saldo disponível: " + saldoDisponivel);
    }    
}

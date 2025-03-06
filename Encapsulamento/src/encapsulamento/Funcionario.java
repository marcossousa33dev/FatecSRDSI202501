
package encapsulamento;

public class Funcionario {
    private double salario;
    private String nome;
    
    public double getSalario(){
        return this.salario; 
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
}

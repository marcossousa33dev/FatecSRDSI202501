package metodospackage;

public class Funcionario {
    String nome;
    double salario;
    
    void aumentaSalario(double percAumento){
        this.salario = this.salario + (this.salario * percAumento);
    }
    
    void mostraDadosFuncionario(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario R$ " + this.salario);
    }
}



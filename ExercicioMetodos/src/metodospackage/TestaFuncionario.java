package metodospackage;

public class TestaFuncionario {

    public static void main(String[] args) {
        Funcionario func = new Funcionario();
        
        func.nome = "Marcos Costa";
        func.salario = 2500.89;
        
        func.aumentaSalario(10);
        func.mostraDadosFuncionario();
    }    
}

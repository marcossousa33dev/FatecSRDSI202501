package encapsulamento;

public class TestaFuncioario {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        
        f.setNome("Marcos Costa");
        f.setSalario(100);
        
        System.out.println(f.getNome());
        System.out.println(f.getSalario());
    }    
}

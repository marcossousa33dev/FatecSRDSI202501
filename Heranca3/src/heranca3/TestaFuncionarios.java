package heranca3;

public class TestaFuncionarios {

    public static void main(String[] args) {
        Gerente g = new Gerente();
        //Classe Funcionario (Mãe)
        g.setNome("Marcos Costa");        
        g.setSalario(32450.22);
        
        //Classe Filha (Funcionario)
        g.setUsuario("marcão");
        g.setSenha("batatinha");
        
        Telefonista t = new Telefonista();
        //Classe Telefonista (Mãe)
        t.setNome("Eliane Prado");
        t.setSalario(10780.23);
        
        //Classe Filha (Telefonista)
        t.setEstacaoDeTrabalho(12);

        Secretaria s = new Secretaria();
        //Classe Funcionario (Mãe)
        s.setNome("Nilva Prado");
        s.setSalario(6550.99);
        
        //Classe Filha (Secretaria)
        s.setRamal(6677);
        
        //Mostrar os dados Gerente
        System.out.println("===============================================");
        System.out.println("GERENTE:");
        g.mostrarDados();
        
        //Mostrar os dados Telefonista
        System.out.println("===============================================");
        System.out.println("TELEFONISTA:");
        t.mostrarDados();
              
        //Mostrar os dados Secretaria
        System.out.println("===============================================");
        System.out.println("SECRETARIA:");
        s.mostrarDados();
        
    }    
}

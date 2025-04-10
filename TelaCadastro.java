package Login;

/**
 *
 * @author Professor Marcos Costa
 */
/*
Importações de todas as bibliotecas que estou utilizando na classe
*/
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaCadastro extends JFrame{
    //Declaração dos atributos de tela
    private final JPanel tela; 
    private final JTextField txtNome;
    private final JTextField txtUsuario;
    private final JPasswordField passSenha;
    private final JPasswordField passConfSenha;
    
    //Validações de usuário e cadastro corretos
    private boolean usuarioValido;
    private boolean cadastroValido;
    
    //String de mensagem
    private String mensagemJOption;
    private int mensagemTipo = 0;
    
    //Método construtor da classe   
    public TelaCadastro() {

        setLocationRelativeTo(null); 
        setResizable(false);        
        setTitle("Cadastro");          
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setBounds(500, 200, 426, 230);

        tela = new JPanel();        
        tela.setBackground(SystemColor.gray); 
        setContentPane(tela);
        tela.setLayout(null);           

        //Adicionando elementos na tela:
        JLabel lblIdentificao = new JLabel("Informar campos para cadastro"); 
        lblIdentificao.setBounds(60, 0, 500, 39);
        lblIdentificao.setFont(new Font("Arial", 3, 19));
        tela.add(lblIdentificao);   //adiciono o meu label ao meu Panel

        JLabel lblNome = new JLabel("Nome");
        lblNome.setBounds(24, 50, 70, 15);
        tela.add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(120, 50, 219, 19);
        tela.add(txtNome);
        txtNome.setColumns(10);
        
        JLabel lblUsuario = new JLabel("Usuario");
        lblUsuario.setBounds(24, 75, 70, 15);
        tela.add(lblUsuario);

        txtUsuario = new JTextField();
        txtUsuario.setBounds(120, 75, 219, 19);
        tela.add(txtUsuario);
        txtUsuario.setColumns(10);

        JLabel lblsenha = new JLabel("Senha");
        lblsenha.setBounds(24, 100, 70, 15);
        tela.add(lblsenha);

        passSenha = new JPasswordField();
        passSenha.setBounds(120, 100, 219, 19);
        tela.add(passSenha);

        JLabel lblconfsenha = new JLabel("Confirmar Senha");
        lblconfsenha.setBounds(24, 125, 100, 15);
        tela.add(lblconfsenha);

        passConfSenha = new JPasswordField();
        passConfSenha.setBounds(120, 125, 219, 19);
        tela.add(passConfSenha);

        JButton btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.setBounds(200, 156, 117, 25);
        tela.add(btnCadastrar);

        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(50, 156, 117, 25);
        tela.add(btnCancelar);        
    }    
    
    public void abreTela(){
        TelaCadastro panelCadastro = new TelaCadastro();        
        panelCadastro.setVisible(true);
    }
}

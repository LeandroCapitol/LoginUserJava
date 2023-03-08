import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaLogin extends JFrame{
    private JPanel telaInicial;
    private JButton btnOK;
    private JPasswordField pswSenha;
    private JTextField txtUsuario;
    private JLabel lblUsuario;
    private JLabel lblSenha;

    public telaLogin() {
        iniciarComponentes();
        criarListeners();
    }
        public void iniciarComponentes(){
            setTitle("Tela de Login");
            setSize(300,150);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setContentPane(telaInicial);
            setVisible(true);
        }

public void criarListeners(){
    btnOK.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            validarLogin();

        }
    });
}
private void validarLogin(){
    String usuario = txtUsuario.getText();
    String senha = new String(pswSenha.getPassword());

        if (usuario.equals("Leandro")&& senha.equals("123")) {

                telaMenu menu = new telaMenu();
                menu.setVisible(true);
                dispose();

        }else{
                JOptionPane.showMessageDialog(this, "Usuário ou senha incorreto!");
        }


}

    public static void main(String[] args) {
        telaLogin iniciar = new telaLogin();
    }
}

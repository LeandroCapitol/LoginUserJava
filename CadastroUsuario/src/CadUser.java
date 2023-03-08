import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadUser extends JFrame {
    private JTextField txtSobrenomeUser;
    private JTextField txtSetorUser;
    private JTextField txtFuncaoUser;
    private JTextField txtLoginUser;
    private JPasswordField pswUser;
    private JPanel pnlTelaUser;
    private JTextField txtNomeUser;
    private JButton btnOkUser;


    public CadUser() {
        setTitle("Cadastro de Usuário");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pnlTelaUser);
        setVisible(true);


        btnOkUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String NomeUser  = txtNomeUser.getText();
                String Sobrenome = txtSobrenomeUser.getText();
                String Setor     = txtSetorUser.getText();
                String Funcao    = txtFuncaoUser.getText();
                String Login     = txtLoginUser.getText();
                String Senha     = pswUser.getText();


                JOptionPane.showMessageDialog(btnOkUser,
                        "O seguinte usuário foi cadastrado:\n" +
                        "Nome: "   +NomeUser+" " +Sobrenome+"\n"+
                        "Setor: "  +Setor+"\n"+
                        "Função: " +Funcao+"\n"+
                        "Login: "  +Login+"\n"
                );

                dispose();
                telaMenu retorno = new telaMenu();
            }
        });
    }


}


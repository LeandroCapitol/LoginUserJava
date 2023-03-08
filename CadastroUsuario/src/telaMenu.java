import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaMenu extends JFrame  {
    private JPanel pnlTelaMenu;
    private JButton btnCadUsuario;
    private JButton btnCadProduto;
    private JLabel OU;
public telaMenu() {
    setTitle("Opção de cadastro");
    setSize(300, 150);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setContentPane(pnlTelaMenu);
    setVisible(true);
    botoes();
}


public void botoes() {
        btnCadProduto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CadProd produto = new CadProd();
                produto.setVisible(true);
                dispose();

            }
        });


            btnCadUsuario.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    CadUser user = new CadUser();
                    user.setVisible(true);
                    dispose();
                }
            });

    }
}

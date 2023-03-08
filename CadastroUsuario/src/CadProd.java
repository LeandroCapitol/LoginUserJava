import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadProd extends JFrame{
    private JTextField txtCodProd;
    private JTextField txtDescProd;
    private JTextField txtPrecoProd;
    private JTextField txtQntdProd;
    private JLabel Preco;
    private JPanel pnlTelaProd;
    private JButton btnOkProdButton;


    public CadProd(){
        setTitle("Cadastro de Produtos");
        setSize(300,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pnlTelaProd);
        setVisible(true);

        btnOkProdButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String CodProd = txtCodProd.getText();
                String DesProd = txtDescProd.getText();
                String PrecoProd = txtPrecoProd.getText();
                String QntdProd = txtQntdProd.getText();

                JOptionPane.showMessageDialog(btnOkProdButton,
                        "O seguinte produto foi cadastrado:\n"+
                                "Cód: "            +CodProd+"\n"+
                                "Preço(R$): "      +PrecoProd+"\n"+
                                "Quantidade(un): " +QntdProd+"\n"+
                                "\n"+
                                DesProd




                );

                dispose();
                telaMenu retorno = new telaMenu();
            }
        });
    }



}

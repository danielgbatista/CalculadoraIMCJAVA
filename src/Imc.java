import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Imc extends JFrame implements ActionListener {
	JLabel lblCalcularImc = new JLabel("Calcular Imc");
	JLabel lblPeso = new JLabel("Peso");
	JLabel lblAltura = new JLabel("Altura");
	JTextField txtPeso = new JTextField();
	JTextField txtAltura = new JTextField();
	JButton btnCalcularImc = new JButton("Calcular Imc");
	JButton btnSair = new JButton("Sair");
	Font textoSecundario = new Font("Georgia", Font.BOLD, 19);
	Font textoTitulo = new Font("Georgia", Font.BOLD, 24);
	Font textoButton = new Font("Arial", Font.BOLD, 17);
	Color corPrimaria = new Color(255, 106, 106);
	Color corFundo = new Color(224, 255, 255);
	
	public Imc() {
		btnSair.addActionListener(this);
		btnCalcularImc.addActionListener(this);
		
		setLayout(null);
		setBackground(corFundo);
		
		// JLabel Texto de Titulo do formulário
		lblCalcularImc.setBounds(120, 0, 200, 50);
		add(lblCalcularImc);
				
		//JLabel Texto Peso
		lblPeso.setBounds(95, 60, 100, 20);
		add(lblPeso);
		
		//JTextField Peso
		txtPeso.setBounds(180, 60, 120, 20);
		add(txtPeso);
		
		//JLabel Texto Altura
		lblAltura.setBounds(90, 120, 100, 20);
		add(lblAltura);
		
		//JTextField Altura
		txtAltura.setBounds(180, 120, 120, 20);
		add(txtAltura);
		
		//JButton Calcular Imc
		btnCalcularImc.setBounds(130, 180, 130, 20);
		add(btnCalcularImc);
		
		//JButton Sair
		btnSair.setBounds(135, 230, 120, 20);
		add(btnSair);
		
		//Fonte
		lblPeso.setFont(textoSecundario);
		lblCalcularImc.setFont(textoTitulo);
		lblAltura.setFont(textoSecundario);
		btnCalcularImc.setFont(textoButton);
		btnSair.setFont(textoButton);
		
		//Cores
		btnCalcularImc.setBackground(corPrimaria);
		btnCalcularImc.setBackground(corPrimaria);
		
		//JFrame
		setTitle("IMC");
		setVisible(true);
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
	}
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalcularImc) {
            if (!txtPeso.getText().equals("") && !txtAltura.getText().equals("") ) {
            	double peso = Double.parseDouble(txtPeso.getText());            
                double altura = Double.parseDouble(txtAltura.getText());
                double imc = peso / Math.pow(altura, 2);
                JOptionPane.showMessageDialog(null, "Imc: " + imc);
            }
        }
        else {
            if (e.getSource() == btnSair) {
                System.exit(0);                
            }
        }        
    }
	public static void main(String []args) {
		new Imc();
	}
}
package View;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Menu extends JFrame{
	private JButton ingresar;
	private JButton cerrar;
	private JComboBox opcion;

	public static void main(String[] args){
		new Menu();
	}
		// TODO Auto-generated method stub
		public Menu(){
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setResizable(false);
			this.setSize(1000, 600);
			this.setLocationRelativeTo(null);//Permite el centro
			JButton ingresar = new JButton();
			this.setLayout(null);
			ingresar.setText("Aceptar");
			ingresar.setBounds(320, 480, 300, 50);
			add(ingresar);
			this.setVisible(true);
			opcion = new JComboBox<>();
			this.getContentPane().add(opcion);
			opcion.addItem("Registrar Cliente");
			opcion.addItem("Apertura Cuenta");
			opcion.addItem("Mantenedor Ejecutivo");
			opcion.addItem("Mantenedor Cliente");
			opcion.addItem("Mantenedor Cuenta");
			add(opcion);
			this.getContentPane().setLayout(new FlowLayout());

	}
	
		
	

}

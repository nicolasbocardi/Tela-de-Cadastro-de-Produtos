package totaldeprodutos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.BoxLayout;

public class Cadastro {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro window = new Cadastro();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cadastro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
	    JLabel titulo = new JLabel("<html><h1>Incluir Produto<h1><html>");
	    titulo.setHorizontalAlignment(JLabel.CENTER);
	    frame.add(titulo,  BorderLayout.NORTH); 
	    
	    
	    inserirdados inserirdados = new inserirdados();
	    frame.add(inserirdados);
	    
	    
	    
		
		
	}

}

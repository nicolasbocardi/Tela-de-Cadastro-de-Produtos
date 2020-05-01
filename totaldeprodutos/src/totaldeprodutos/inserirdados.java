package totaldeprodutos;

import java.awt.GridLayout;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import totaldeprodutos.mdl.listadeprodutos;

public class inserirdados  extends JPanel {
	
	private List<listadeprodutos> listadeprodutos = new ArrayList<>();
	

	public inserirdados() {
	
	this.setLayout (new GridLayout(0 , 2));
	
	JLabel Produto = new JLabel("Produto");
	this.add (Produto);
	
	JTextField ProdutoField = new JTextField();
	this.add(ProdutoField);
	
	JLabel Quantidade = new JLabel("Quantidade");
	this.add (Quantidade);
	
	JTextField quantidadeField = new JTextField();
	this.add(quantidadeField);
	
	JLabel valor = new JLabel("Valor");
	this.add (valor);
	
	JTextField valorField = new JTextField();
	this.add(valorField);
	
	JButton btnadicionar = new JButton("Inserir");
	this.add(btnadicionar);
	
	btnadicionar.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String nome = ProdutoField.getText();
			int quantidade = Integer.parseInt(quantidadeField.getText());
			
			
			 listadeprodutos totaldeprodutos = new listadeprodutos (nome, quantidade, valor);
			 
			 listadeprodutos.add(totaldeprodutos);
			
			 System.out.println("quantidade cadastrada " + listadeprodutos.size());
			 
			 ProdutoField.setText("");
			 
			 quantidadeField.setText("");
			 
			 valorField.setText("");
			
			
		}
		
	});
	
	JButton btnrelatorio = new JButton("Relatório");
	this.add(btnrelatorio);
	
	btnrelatorio.addActionListener(new ActionListener() {

		private  JTable Table;

		@Override
		public void actionPerformed(ActionEvent arg0) {
			for(int i=0; i<listadeprodutos.size(); i++) { 
				System.out.println(listadeprodutos.get(i));
			
		};
		
		Object[] titulos = {"nome", "Quantidade", "Valor"};
		
		Object[][] linhas = new Object[listadeprodutos.size()][3];
		
		for (int i=0; i<listadeprodutos.size(); i++) {
			Object[] linha = new Object[] {listadeprodutos.get(i).getNome(), listadeprodutos.get(i).getQuantidade(), listadeprodutos.get(i).getValor()};
			linhas[i] = linha;
		}
		
		JTable Table = new JTable(linhas, titulos);
		
		JOptionPane.showMessageDialog(null, new JScrollPane(Table));
		
	}

		private Object listadeprodutos(int i) {
			// TODO Auto-generated method stub
			return null;
		};
	
	
	
	});
}


	protected static inserirdados get(int i) {
		// TODO Auto-generated method stub
		return null;
	}


	protected Object getValor() {
		// TODO Auto-generated method stub
		return null;
	}


	protected Object getquantidade() {
		// TODO Auto-generated method stub
		return null;
	}


	protected Object getnome() {
		// TODO Auto-generated method stub
		return null;
	}};

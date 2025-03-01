/**
 * 
 */
package sistema;

import javax.swing.JOptionPane;

import com.factory.*;


/**
 * @author deboracarvalho
 * @version 1.0
 * @since fev/2025
 */
public class Main {


	public static void main(String[] args) {
		int op;
		/**Gerando um menu para que o usuário escolha o formato desejado para a geração do relatório*/
		String menu= " \nBem-vindo ao Sistema de Relatórios"+ "\n1.Relatório em PDF" + "\n2.Relatório em Excel"+
		"\n3.Relatório em CSV" + "\n0.Sair"+ "\nEscolha o formato desejado: ";
		
		/**Criando as fábricas para gerar os relatórios*/
		RelatorioFactory factory1 = new RelatorioPDFFactory();
		RelatorioFactory factory2 = new RelatorioExcelFactory();
		RelatorioFactory factory3 = new RelatorioCSVFactory();
		
		do {
			/**O menu é criado utilizando JOptionPane*/
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));

			/**Criando os relatórios específicos*/
			switch (op) {
				case 1: {
					Relatorio relatorioPDF = factory1.criarRelatorio();
					relatorioPDF.gerarRelatorio();
					break;
				}
				case 2: {
					Relatorio relatorioExcel = factory2.criarRelatorio();
					relatorioExcel.gerarRelatorio();
					break;
				}
				case 3: {
					Relatorio relatorioCSV = factory3.criarRelatorio();
					relatorioCSV.gerarRelatorio();
					break;
				}
				case 0: {
					JOptionPane.showMessageDialog(null, "Saindo do sistema...");
					 break;					
				}
				default:
					JOptionPane.showMessageDialog(null,"Opção inválida. Digite 1, 2, 3(como opção de formato) ou 0 (para sair)");
				}
		} while (op!=0);

	}

}

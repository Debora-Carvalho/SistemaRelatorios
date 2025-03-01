/**
 * 
 */
package com.concretas;

import javax.swing.JOptionPane;

import sistema.Relatorio;

/**
 * 
 */
public class RelatorioCSV implements Relatorio {

	@Override
	public void gerarRelatorio() {
		// TODO Auto-generated method stub
		System.out.println("\nGerando relatório em formato CSV...");
		JOptionPane.showMessageDialog(null, "O relatório foi gerado em CSV (relatorio.csv)");
	}

}

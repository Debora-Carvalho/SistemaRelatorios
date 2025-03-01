/**
 * 
 */
package com.concretas;

import javax.swing.JOptionPane;

import sistema.Relatorio;

/**
 * 
 */
public class RelatorioExcel implements Relatorio {

	@Override
	public void gerarRelatorio() {
		// TODO Auto-generated method stub
		System.out.println("\nGerando relatório em formato Excel...");
		JOptionPane.showMessageDialog(null, "O relatório foi gerado em Excel (relatorio.xlsx)");
	}

}

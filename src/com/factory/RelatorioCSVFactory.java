/**
 * 
 */
package com.factory;

import com.concretas.RelatorioCSV;

import sistema.Relatorio;

/**
 * 
 */
public class RelatorioCSVFactory extends RelatorioFactory {
	@Override 
	public Relatorio criarRelatorio() { 
		return new RelatorioCSV();
	 }	
}

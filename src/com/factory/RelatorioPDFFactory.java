/**
 * 
 */
package com.factory;

import com.concretas.RelatorioPDF;

import sistema.Relatorio;


/**
 * 
 */
public class RelatorioPDFFactory extends RelatorioFactory {
	@Override 
	public Relatorio criarRelatorio() { 
		return new RelatorioPDF();
	 }	
}

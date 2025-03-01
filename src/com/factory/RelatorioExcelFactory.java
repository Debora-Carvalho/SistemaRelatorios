/**
 * 
 */
package com.factory;

import com.concretas.RelatorioExcel;

import sistema.Relatorio;

/**
 * 
 */
public class RelatorioExcelFactory extends RelatorioFactory {
	@Override 
	public Relatorio criarRelatorio() { 
		return new RelatorioExcel();
	 }	
}

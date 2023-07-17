package com.conversor.dialog;

import java.text.NumberFormat;

import javax.swing.JOptionPane;

import com.conversor.models.MonedasModels;

public class MensajeModel {
	
	public static Boolean main(String[] args, MonedasModels moneda) {
		NumberFormat formato = NumberFormat.getNumberInstance();
		Double resultado = (double) Math.round(moneda.conversion()*100d)/100;
		JOptionPane.showMessageDialog(null, 
				"Tienes $" + formato.format(resultado)+ " " + moneda.getNombreDeMoneda(), 
				"Excepcion", JOptionPane.INFORMATION_MESSAGE);
		
		return Continuacion.main(null);
		
	}
	
}

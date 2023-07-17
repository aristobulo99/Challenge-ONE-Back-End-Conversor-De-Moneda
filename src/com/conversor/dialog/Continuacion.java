package com.conversor.dialog;

import javax.swing.JOptionPane;

public class Continuacion {
	
	public static Boolean main(String[] args) {
		
		Object[] botonesPersonalizados = {
				"Si",
				"No",
				"Cancelar"
		};
		
		Integer posicion = JOptionPane.showOptionDialog(null, 
				"¿Desea Continuar?",
				null,
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, 
				null,
				botonesPersonalizados, 
				botonesPersonalizados[0]);
		
		switch (posicion) {
			case 0: {
				return true;
			}
			default: 
				JOptionPane.showMessageDialog(null, 
						"Programa Finalizado", 
						"Mensage", JOptionPane.INFORMATION_MESSAGE);
				return false;
				
		}
	}

}

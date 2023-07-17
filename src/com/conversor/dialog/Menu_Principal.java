package com.conversor.dialog;

import javax.swing.JOptionPane;

public class Menu_Principal {

	 public static void main(String[] args) {
		
		Object[] opcionesDeConveriso = {
					"Conversor de Moneda",
					"Conversor de Masa",
					"Conversor de Longitud",
					"Conversor de Temperatura"
		};
		Boolean iteradorInfini = true;
		while(iteradorInfini) {
			
			String repuesta = (String) JOptionPane.showInputDialog(null, 
					"Seleccione una opción de conversión", 
					"Menú", 
					JOptionPane.DEFAULT_OPTION, 
					null, 
					opcionesDeConveriso, 
					opcionesDeConveriso[0]
					);
			
			
			if(repuesta == null) repuesta = "null";
			
			switch (repuesta) {
			
				case "Conversor de Moneda": {
					iteradorInfini = Conversor_Monedas.main(null);
					break;
				}
				case "Conversor de Masa": {
					iteradorInfini = InputCantidadDeMasa.main(null);
					break;
				}
				case "Conversor de Longitud": {
					iteradorInfini = InputLongitud.main(null);
					break;
				}
				case "Conversor de Temperatura": {
					iteradorInfini = InputTemperatura.main(null);
					break;
				}
				case "null": {
					iteradorInfini = !iteradorInfini;
					break;
				}
				
			
			}
		}
	}
}

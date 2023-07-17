package com.conversor.dialog;

import java.io.ObjectInputStream.GetField;

import javax.swing.JOptionPane;

import com.conversor.models.LongitudModels;

public class SeleccionLongitud {
	
	public static Boolean main(LongitudModels longitud) {
		
		Object[] longitudes = {
				"Kilometro	",
				"Metro",
				"Centimetro",
				"Milimitro",
				"Micrometro"
		};
		Boolean iteradorInfinito = true;
		Boolean validorDeRespueta = true;
		String validadorDeSelccion = "";
		
		while(iteradorInfinito) {
			
			String respuesta = (String) JOptionPane.showInputDialog(null, 
					"Elige la longitud asociada al valor ingresado", 
					"Longitud Original", 
					JOptionPane.DEFAULT_OPTION, 
					null, 
					longitudes, 
					longitudes[0]
			);
			
			String respuesta2 = (String) JOptionPane.showInputDialog(null, 
					"Elige la longitud a convertir", 
					"Longitud a convertir", 
					JOptionPane.DEFAULT_OPTION, 
					null, 
					longitudes, 
					longitudes[0]
			);
			
			if(respuesta == null || respuesta2 == null) {
				validadorDeSelccion = "null";
			}
			
			switch (validadorDeSelccion) {
			case "null": {
				iteradorInfinito = !iteradorInfinito;
				break;
			}
			default:
				longitud.setUnidadInicial(respuesta);
				longitud.setUnidadConvertida(respuesta2);
				JOptionPane.showMessageDialog(null, 
						longitud.getValorUniidad()+ " " + longitud.getUnidadInicial() +"s equivalen a" + 
						longitud.conversor(longitudes) + " " + longitud.getUnidadConvertida() +"s", 
						"Excepcion", JOptionPane.INFORMATION_MESSAGE);
				validorDeRespueta = Continuacion.main(null);
				iteradorInfinito = false;
			}
		}
		return validorDeRespueta;
		
	}

}

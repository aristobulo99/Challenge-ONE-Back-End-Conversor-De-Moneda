package com.conversor.dialog;

import javax.swing.JOptionPane;

import com.conversor.models.TemperaturaMdels;

public class SeleccionTemperatura {
	
	public static Boolean main(TemperaturaMdels temperatura) {
		
		Object[] conversionesTemperatura = {
				"Grado Celsius",
				"Grado Fahrenheit",
				"Kelvin"
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
					conversionesTemperatura, 
					conversionesTemperatura[0]
			);
			
			String respuesta2 = (String) JOptionPane.showInputDialog(null, 
					"Elige la longitud a convertir", 
					"Longitud a convertir", 
					JOptionPane.DEFAULT_OPTION, 
					null, 
					conversionesTemperatura, 
					conversionesTemperatura[0]
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
				temperatura.setUnidadInicial(respuesta);
				temperatura.setUnidadConvertida(respuesta2);
				JOptionPane.showMessageDialog(null, 
						temperatura.getValorUniidad()+" "+temperatura.getUnidadInicial()+" equivalen a "+
						temperatura.conversor()+" "+temperatura.getUnidadConvertida(), 
						"Excepcion", JOptionPane.INFORMATION_MESSAGE);
				validorDeRespueta = Continuacion.main(null);
				iteradorInfinito = false;
				
			}
		}
		
		return validorDeRespueta;
	}

}

package com.conversor.dialog;

import javax.swing.JOptionPane;

import com.conversor.models.LongitudModels;

public class InputLongitud {
	
	public static Boolean main(String[] args) {
		
		Boolean iteradorInfinito = true;
		Boolean validorDeRespueta = true;
		LongitudModels Objectlongitud = new LongitudModels();
		
		while(iteradorInfinito) {
			
			String respuesta = JOptionPane.showInputDialog(null,
					"Ingresar la longitud a convertir",
					"Input Longitud",
					JOptionPane.QUESTION_MESSAGE
			);
			
			if(respuesta == null) respuesta = "null";
			
			switch (respuesta) {
			case "null": {
				iteradorInfinito = !iteradorInfinito;
				break;
			}
			default:
				try {
					Double longitud = Double.parseDouble(respuesta);
					Objectlongitud.setValorUniidad(longitud);
					validorDeRespueta = SeleccionLongitud.main(Objectlongitud);
					iteradorInfinito = validorDeRespueta;
				} catch (Exception e) {
					ExcepcionCampoInvalido.dialogValorInvalido(e.getLocalizedMessage());
				}
			}
		}
		
		return validorDeRespueta;
	}
}

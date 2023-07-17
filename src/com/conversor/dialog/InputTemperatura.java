package com.conversor.dialog;

import javax.swing.JOptionPane;

import com.conversor.models.TemperaturaMdels;

public class InputTemperatura {
	
	public static Boolean main(String[] args) {
		
		
		Boolean iteracionInfinita = true;
		Boolean validorDeRespueta = true;
		TemperaturaMdels temperaturaObject = new TemperaturaMdels();
		
		while(iteracionInfinita) {
			
			String respuesta = JOptionPane.showInputDialog(null,
					"Ingresar la temperatura a convertir",
					"Input Temperatura",
					JOptionPane.QUESTION_MESSAGE
			);
			
			if(respuesta == null) respuesta = "null";
			
			switch (respuesta) {
			case "null": {
				iteracionInfinita = !iteracionInfinita;
				break;
			}
			default:
				try {
					Double temperatura = Double.parseDouble(respuesta);
					temperaturaObject.setValorUniidad(temperatura);
					validorDeRespueta = SeleccionTemperatura.main(temperaturaObject);
					iteracionInfinita = validorDeRespueta;
				} catch (Exception e) {
					ExcepcionCampoInvalido.dialogValorInvalido(e.getLocalizedMessage());
				}
			}
		}
		
		return validorDeRespueta;
	}

}

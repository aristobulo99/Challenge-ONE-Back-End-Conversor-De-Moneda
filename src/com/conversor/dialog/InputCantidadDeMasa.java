package com.conversor.dialog;

import javax.swing.JOptionPane;

import com.conversor.models.MasaModels;

public class InputCantidadDeMasa {
	
	public static Boolean main(String[] args) {
		
		Boolean iteradorInfinito = true;
		MasaModels modeloMasa = new MasaModels();
		
		while(iteradorInfinito) {
			String respuesta = JOptionPane.showInputDialog(null,
					"Ingresar la cantidad de masa a convertir",
					"Input Masa",
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
						Double masa = Double.parseDouble(respuesta);
						modeloMasa.setValorUniidad(masa);
						iteradorInfinito = UnidadDeLaMasa.unidadDeLaMasaIngresada(modeloMasa);
					} catch (Exception e) {
						ExcepcionCampoInvalido.dialogValorInvalido(e.getLocalizedMessage());
					}
			}
			
		}
		
		return iteradorInfinito;
	}

}

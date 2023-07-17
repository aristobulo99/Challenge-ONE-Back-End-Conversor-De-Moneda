package com.conversor.dialog;

import javax.swing.JOptionPane;

import com.conversor.models.MonedasModels;


public class Conversor_Monedas {
	
	public static Boolean main(String[] args)  {
		
		Boolean iteradorInfini = true;
		Boolean resultadoSeleccion = true;
		Double dinero;
				
		while (iteradorInfini) {
			
			MonedasModels moneda = new MonedasModels();
			
			String respuesta = JOptionPane.showInputDialog(
					null,
					"Ingresa la cantidad de dinero que deseas convertir", 
					"Input",
					JOptionPane.QUESTION_MESSAGE
			);
			
			if(respuesta == null) respuesta = "null";
			
			switch (respuesta) {
			case "null": {
				iteradorInfini = !iteradorInfini;
				break;
			}
			default:
				try {
					dinero = Double.parseDouble(respuesta);
					moneda.setMonedaAConvertir(dinero);
					resultadoSeleccion = SeleccionDeMoneda.main(null, moneda);
					iteradorInfini = resultadoSeleccion;
					break;
				} catch (Exception e) {
					ExcepcionCampoInvalido.dialogValorInvalido(e.getLocalizedMessage());
				}
			}
			
		}
		return resultadoSeleccion;
		
		
		

	}
}

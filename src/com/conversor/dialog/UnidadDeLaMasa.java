package com.conversor.dialog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

import com.conversor.models.MasaModels;

public class UnidadDeLaMasa {

	public static Boolean unidadDeLaMasaIngresada(MasaModels masa) {
		
		Object[] masas = {
				"Tonelada",
				"Kilogramo",
				"Gramo",
				"Miligramo",
				"Microgramo"
		};
		Boolean iteradorInfinito = true;
		Boolean validorDeRespueta = true;
		String validadorDeSelccion = "";
		
		while(iteradorInfinito) {
			
			String respuesta = (String) JOptionPane.showInputDialog(null, 
					"Elige la unidad asociada al valor ingresado", 
					"Unidad De Masa", 
					JOptionPane.DEFAULT_OPTION, 
					null, 
					masas, 
					masas[0]
			);
			
			String respuesta2 = (String) JOptionPane.showInputDialog(null, 
					"Elige la unidad a convertir", 
					"Unidad De Masa", 
					JOptionPane.DEFAULT_OPTION, 
					null, 
					masas, 
					masas[0]
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
				masa.setUnidadInicial(respuesta);
				masa.setUnidadConvertida(respuesta2);
				JOptionPane.showMessageDialog(null, 
						masa.getValorUniidad() +" "+ masa.getUnidadInicial() +
						"s equivale a " + masa.conversor(masas) + " " + masa.getUnidadConvertida()+"s", 
						"Excepcion", JOptionPane.INFORMATION_MESSAGE);
				validorDeRespueta = Continuacion.main(null);
				iteradorInfinito = false;
				
			}
		}
		
		return validorDeRespueta;
		
	}
}

package com.conversor.dialog;

import javax.swing.JOptionPane;

import com.conversor.models.MonedasModels;

public class SeleccionDeMoneda {

	public static Boolean main(String[] args, MonedasModels moneda) {
	
		Boolean resultadoDeMensajeModel = true;
		Object[] opcionesDeConveriso = {
				"De Pesos a Dólar",
				"De Pesos a Euro",
				"De Pesos a Libras Esterlinas",
				"De Pesos a Yen",
				"De Pesos a Won Coreano",
				"De Dólar a Pesos",
				"De Euro a Pesos",
				"De Libras a Pesos",
				"De Yen a Pesos",
				"De Won Coreano a Pesos",
		};
		
		Object[] opcionesDeConverisoNombreDeMoneda = {
				"Dólares",
				"Euros",
				"Libras Esterlinas",
				"Yenes",
				"Won Coreanos",
				"Pesos",
				"Pesos",
				"Pesos",
				"Pesos",
				"Pesos",
		};
		
		Object[] opcionesDeConverisoMonetarias = {
				4168.00,
				4552.08,
				5296.07,
				28.88,
				3.17,
				4168.00,
				4552.08,
				5296.07,
				28.88,
				3.17
		};
		
		Boolean iteradorInfinito = true;
		
		while(iteradorInfinito) {
			String repuesta = (String) JOptionPane.showInputDialog(null, 
					"Elige la moneda a la que deseas convertir tu dinero", 
					"Monedas", 
					JOptionPane.DEFAULT_OPTION, 
					null, 
					opcionesDeConveriso, 
					opcionesDeConverisoMonetarias[0]
					);
			if(repuesta == null) iteradorInfinito = !iteradorInfinito;
			for(int i = 0; i < opcionesDeConveriso.length; i++) {
				if(repuesta == opcionesDeConveriso[i]) {
					moneda.setMonedaConvertora((Double)opcionesDeConverisoMonetarias[i]);
					moneda.setNombreDeMoneda((String)opcionesDeConverisoNombreDeMoneda[i]);
					if(i > 4 ) {
						moneda.setTipoDeConvercion(true);
					}else {
						moneda.setTipoDeConvercion(false);
					}
					resultadoDeMensajeModel = MensajeModel.main(null, moneda);
					iteradorInfinito = resultadoDeMensajeModel;
					break;
				}
			}
		}
		
		
		return resultadoDeMensajeModel;
		
		
	}
}

package com.conversor.models;

public class LongitudModels extends ConversorMasaLongitud {
	
	public LongitudModels() {
		super();
	}
	
	@Override
	public Double conversor(Object[] unidades) {
		
		Integer controlDeConversion = 1000;
		
		Integer posicionUnidadInicial = 0;
		double valorDeConverisoInicial = 0;
		
		Integer posicionUnidadFinal = 0;
		
		Double controlConversion = 1.0;
		
		for(Integer i = 0; i < unidades.length; i++) {
			
			if(unidades[i] == getUnidadInicial()) {
				posicionUnidadInicial = i;
				valorDeConverisoInicial = controlDeConversion;
			}
			
			if(unidades[i] == getUnidadConvertida()) {
				posicionUnidadFinal = i;
			}
			
			controlDeConversion = controlDeConversion/10;
		}
		
		if(getUnidadInicial() == "Micrometro" || getUnidadConvertida() == "Micrometro") {
			valorDeConverisoInicial = 1;
			if(getUnidadInicial() == "Micrometro") valorDeConverisoInicial = 0.1;
			controlConversion = 1000.0;
		}
		
		Integer diferenciaPosiciones = posicionUnidadFinal - posicionUnidadInicial;
		Integer controlIterador = diferenciaPosiciones;
		Double acumuladoraDeConversion = 1.0*controlConversion;
		if(diferenciaPosiciones < 0) {
			controlIterador = diferenciaPosiciones*(-1);
			acumuladoraDeConversion = (1.0/controlConversion);
		}
		
		
		for(Integer j=0; j<controlIterador; j++) {
			if(diferenciaPosiciones > 0) {
				acumuladoraDeConversion = acumuladoraDeConversion*valorDeConverisoInicial;	
				valorDeConverisoInicial = valorDeConverisoInicial/10;
			}else {
				
				valorDeConverisoInicial = valorDeConverisoInicial*10;
				acumuladoraDeConversion = acumuladoraDeConversion/valorDeConverisoInicial;
			}
			
		}
		
		Double respuesta = acumuladoraDeConversion*getValorUniidad();
		
		return respuesta;
	}

}

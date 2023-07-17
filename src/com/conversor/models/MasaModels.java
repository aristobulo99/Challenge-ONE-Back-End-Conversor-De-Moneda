package com.conversor.models;

public class MasaModels extends ConversorMasaLongitud {

	public MasaModels() {
		super();
	}
	
	
	@Override
	public Double conversor(Object[] masas) {
		
		Integer posicionMasaOriginal = 0;
		Integer posicionMasaConvertid = 0;
		
		for (int i = 0; i < masas.length; i++) {
			if(masas[i] == getUnidadInicial()) {
				posicionMasaOriginal = i;
			}
			if(masas[i] == getUnidadConvertida()) {
				posicionMasaConvertid = i; 
			}
		}
		
		Integer potenciaConvertorra = posicionMasaConvertid - posicionMasaOriginal;
		Double resultadoConversion = getValorUniidad() * (Math.pow(1000, potenciaConvertorra));
		return resultadoConversion;
	}
	
	

}

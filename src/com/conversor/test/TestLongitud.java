package com.conversor.test;

import com.conversor.models.LongitudModels;

public class TestLongitud {
	
	public static void main(String[] args) {
		
		Object[] longitudes = {
				"Kilometro",
				"Metro",
				"Centimetro",
				"Milimitro",
				"Micrometro"
		};
		
		LongitudModels logitud = new LongitudModels();
		
		logitud.setValorUniidad(1.0);
		logitud.setUnidadInicial("Micrometro");
		logitud.setUnidadConvertida("Centimetro");
		Double resp = logitud.conversor(longitudes);
		System.out.println(resp);
	}

}

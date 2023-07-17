package com.conversor.models;

public class TemperaturaMdels extends ConversorMasaLongitud {
	
	@Override
	public Double conversor() {
		switch (getUnidadInicial()+" "+getUnidadConvertida()) {
		
			case "Grado Celsius Grado Fahrenheit": {
				return celsiusFahren();
			}
			
			case "Grado Celsius Kelvin":{
				return celsiusKelvin();
			}
			
			case "Grado Fahrenheit Grado Celsius":{
				return fahrenCelsius();
			}
			
			case "Grado Fahrenheit Kelvin":{
				return fahrenKelvin();
			}
			
			case "Kelvin Grado Celsius":{
				return kelvinCelsius();
			}
			
			case "Kelvin Grado Fahrenheit":{
				return kelvinfahren();
			}
		}
		return null;
	}
	
	public Double celsiusFahren() {
		Double divicion = (double)9/5;
		return (getValorUniidad()*(divicion))+32;
	}
	
	public Double celsiusKelvin() {
		return (getValorUniidad()+273.15);
	}
	
	public Double fahrenCelsius() {
		Double divicion = (double)5/9;
		return (getValorUniidad()-32)*(divicion);
	}
	
	public Double fahrenKelvin() {
		return fahrenCelsius()+273.15;
	}
	
	public Double kelvinCelsius() {
		return (getValorUniidad()-273.15);
	}
	
	public Double kelvinfahren() {
		Double divicion = (double)9/5;
		return (kelvinCelsius())*(divicion)+32;
	}

}

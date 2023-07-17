package com.conversor.models;

public class MonedasModels {

	private Double monedaAConvertir; //moneda ingresada por el usuario
	private Double monedaConvertora; //moneda seleccionada para realizar la conversion
	private Boolean tipoDeConvercion; //Tipo de convercion para identifica el paso de pesos a otra moneda y  viceversa
	private String nombreDeMoneda;
	
	public MonedasModels() {
		super();
	}

	
	public Double getMonedaAConvertir() {
		return monedaAConvertir;
	}

	public void setMonedaAConvertir(Double monedaAConvertir) {
		this.monedaAConvertir = monedaAConvertir;
	}

	public Double getMonedaConvertora() {
		return monedaConvertora;
	}

	public void setMonedaConvertora(Double monedaConvertora) {
		this.monedaConvertora = monedaConvertora;
	}
	
	public Boolean getTipoDeConvercion() {
		return tipoDeConvercion;
	}

	public void setTipoDeConvercion(Boolean tipoDeConvercion) {
		this.tipoDeConvercion = tipoDeConvercion;
	}
	
	public String getNombreDeMoneda() {
		return nombreDeMoneda;
	}


	public void setNombreDeMoneda(String nombreDeMoneda) {
		this.nombreDeMoneda = nombreDeMoneda;
	}

	
	public Double pesosOtraMoneda() {
		return this.monedaAConvertir/this.monedaConvertora;
	}
	
	public Double otraMOnedaApesos() {
		return this.monedaAConvertir*this.monedaConvertora;
	}
	
	public Double conversion() {
		if(this.getTipoDeConvercion()) {
			return this.otraMOnedaApesos();
		}
		return this.pesosOtraMoneda();
	}
	
	
	
	

}

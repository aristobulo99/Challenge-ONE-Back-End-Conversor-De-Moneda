package com.conversor.models;

public class ConversorMasaLongitud {

	private Double valorUniidad;
	private String unidadInicial;
	private String unidadConvertida;
	
	public ConversorMasaLongitud() {
		super();
	}

	public ConversorMasaLongitud(Double valorUniidad, String unidadInicial, String unidadConvertida) {
		super();
		this.valorUniidad = valorUniidad;
		this.unidadInicial = unidadInicial;
		this.unidadConvertida = unidadConvertida;
	}
	
	public Double getValorUniidad() {
		return valorUniidad;
	}

	public void setValorUniidad(Double valorUniidad) {
		this.valorUniidad = valorUniidad;
	}

	public String getUnidadInicial() {
		return unidadInicial;
	}

	public void setUnidadInicial(String unidadInicial) {
		this.unidadInicial = unidadInicial;
	}

	public String getUnidadConvertida() {
		return unidadConvertida;
	}

	public void setUnidadConvertida(String unidadConvertida) {
		this.unidadConvertida = unidadConvertida;
	}
	
	public Double conversor(Object[] unidades) {
		return 0.1;
	}

	public Double conversor() {
		// TODO Auto-generated method stub
		return null;
	}

}

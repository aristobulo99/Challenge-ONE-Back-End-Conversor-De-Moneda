package com.conversor.dialog;

import javax.swing.JOptionPane;

public class ExcepcionCampoInvalido {
	
	public static void dialogValorInvalido(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Excepcion", JOptionPane.ERROR_MESSAGE);
	}
}

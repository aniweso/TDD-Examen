package com.TDDExamenTarjeta;

public class Retiro {

	public boolean verificaRetiroSinTarjeta(Usuario miUsuario) {
		if(miUsuario.tarjetaPuedeRetirarSinTarjeta() == true)
			return true;
		return false;
	}

	public boolean verificaNumeroTarjeta(Usuario miUsuario, String tarjetaAValidar) {
		if(miUsuario.numeroTarjetaUsuario() == tarjetaAValidar)
			return true;
		return false;
	}

	public boolean verificaSaldoParaRetiro(Usuario miUsuario, double montoRetiro) {
		if(miUsuario.getSaldo() >= montoRetiro){
			return true;
		}
		return false;
	}

}

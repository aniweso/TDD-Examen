package com.TDDExamenTarjeta;

public class Usuario {
	
	Double usuarioSaldo = 2345.00;
	
	public String numeroTarjetaUsuario(){
		return "1234123412341234";
	}
	
	public boolean tarjetaPuedeRetirarSinTarjeta(){
		return false;
	}
	
	public Double getSaldo(){
		return usuarioSaldo;
	}
	
	public void setSaldo(Double modificadoSaldo){
		usuarioSaldo = modificadoSaldo;
	}

}

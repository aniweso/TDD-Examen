package com.TDDExamenTarjeta;

public class StubUsuarioNoPuedeRetirarSinTarjeta extends Usuario{
	
	public boolean tarjetaPuedeRetirarSinTarjeta(){
		return false;
	}
}

package com.TDDExamenTarjeta;

import static org.junit.Assert.*;

import org.junit.Test;


public class RetiroTest {
	
	Retiro miRetiro = new Retiro();
	

	@Test
	public void SiPuedeRetirarSinTarjeta(){
		Usuario miUsuario = new StubUsuarioPuedeRetirarSinTarjeta();
		
		boolean estadoActual = miRetiro.verificaRetiroSinTarjeta(miUsuario);
		assertTrue(estadoActual);
	}
	
	@Test
	public void NoPuedeRetirarSinTarjeta(){
		Usuario miUsuario = new StubUsuarioNoPuedeRetirarSinTarjeta();
		
		boolean estadoActual = miRetiro.verificaRetiroSinTarjeta(miUsuario);
		assertFalse(estadoActual);
	}
	
	@Test
	public void EsValidoNumeroTarjeta(){
		Usuario miUsuario = new StubTarjetaValida();
		
		boolean estadoActual = miRetiro.verificaNumeroTarjeta(miUsuario,"2345234523452345");
		assertTrue(estadoActual);
	}
	
	@Test
	public void EsNoValidoNumeroTarjeta(){
		Usuario miUsuario = new StubTarjetaValida();
		
		boolean estadoActual = miRetiro.verificaNumeroTarjeta(miUsuario,"111111111111111");
		assertFalse(estadoActual);
	}
	
	@Test
	public void permitirRetiroSaldoMayorQueMonto(){
		Usuario miUsuario = new StubSaldoTarjetaQuinientos();
		
		boolean estadoActual = miRetiro.verificaSaldoParaRetiro(miUsuario,400.00);
		assertTrue(estadoActual);
	}
	
	@Test
	public void noPermiteRetiroSaldoMenorQueMonto(){
		Usuario miUsuario = new StubSaldoTarjetaTrecientos();
		
		boolean estadoActual = miRetiro.verificaSaldoParaRetiro(miUsuario, 400.00);
		assertFalse(estadoActual);
	}
	
	@Test
	public void permitirRetiroSaldoIgualQueMonto(){
		Usuario miUsuario = new StubSaldoTarjetaQuinientos();
		
		boolean estadoActual = miRetiro.verificaSaldoParaRetiro(miUsuario,500.00);
		assertTrue(estadoActual);
	}

}

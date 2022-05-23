package one.digitalinnovation.gof;

import one.digitalinnovation.gof.estrategy.Comportamento;
import one.digitalinnovation.gof.estrategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.estrategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.estrategy.ComportamentoNormal;
import one.digitalinnovation.gof.estrategy.Robo;
import one.digitalinnovation.gof.facade.Facade;

public class Test {
	
	//Singleton

	public static void main(String[] args) {
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazerHolder lazerHolder = SingletonLazerHolder.getInstancia();
		System.out.println(lazerHolder);
		lazerHolder = SingletonLazerHolder.getInstancia();
		System.out.println(lazerHolder);

		
		// Strategy
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		
		robo.mover();
		robo.mover();
		
		robo.setComportamento(defensivo);
		
		robo.mover();
		robo.mover();
		
		robo.setComportamento(agressivo);
		
		robo.mover();
		robo.mover();
		
		// Facade
		
		@SuppressWarnings("unused")
		Facade facade = new Facade();
		facade.migrarCliente("Mara", "25571280");
		
		
	}
	
}

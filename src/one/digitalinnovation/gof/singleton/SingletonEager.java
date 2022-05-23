package one.digitalinnovation.gof.singleton;
/** 
 * Singleton "apressado"
 * 
 * https://github.com/maradiniz91
 */

public class SingletonEager {
 
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}

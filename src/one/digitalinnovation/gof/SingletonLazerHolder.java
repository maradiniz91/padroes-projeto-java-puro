package one.digitalinnovation.gof;
/** 
 * Singleton "apressado"
 * 
 * https://github.com/maradiniz91
 */

public class SingletonLazerHolder {
 
	private static class InstanceHolder {
		public static SingletonLazerHolder instancia = new SingletonLazerHolder();
	}
	private SingletonLazerHolder() {
		super();
	}
	
	public static SingletonLazerHolder getInstancia() {
		return InstanceHolder.instancia;
	}
}

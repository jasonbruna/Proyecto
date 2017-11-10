/**
 * 
 */
package View;

import java.util.ArrayList;

import Model.Ejecutivo;
import Modeldao.EjecutivoDao;

/**
 * @author Jason Bruna
 *	Version 1.0
 */
public class Main {

	/**Generar Vistar!!
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejecutivo ejecutivo1 = new Ejecutivo();//Siempre se necesitan estos 3 para listar
		ArrayList<Ejecutivo> ejecutivos = new ArrayList<>();//Siempre se necesitan estos 3 para listar
		EjecutivoDao ejedao = new EjecutivoDao();//Siempre se necesitan estos 3 para listar
		System.out.println("-------------------------------");
		System.out.println("Banco");
		System.out.println("-------------------------------");
		
		ejecutivos = ejedao.listar();
		for (Ejecutivo ejecutivo : ejecutivos) {
			System.out.println("hola");
			System.out.println(ejecutivo);
		}
	}

}

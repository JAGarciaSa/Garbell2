package generarnumeros;

import java.util.Arrays;

/** 
 * @author: JGarcia
 */

// Classe que utilitzarà el garbell d'Erastòtenes per trobar els nombres primers.
// Veure el comportament gràficament aquí de l'algorisme:
// http://blocs.xtec.cat/ceipcirera6/2014/10/08/garbell-derastostenes/
/**
@RunWith(Parameterized.class)
public class GeneraPrimers{
*/
public class GeneraPrimers {
 	  private static int dim;
	  private static boolean esPrimo[];
	  private static int primos[];
	/**  
	   * Generar nombres primers de 2 fins a max
	   * @return Vector de nombres primers
	   */
	  
	  /**
	   * Se encarga de generar los numeros primos para ser impresos mas tarde
	   * @author JGarcia
	   * @param max
	   * @return primos
	   */
	public static int[] generarPrimos (int max) 
	{   
	    if (max < 2) 
	    {
	       return new int[0];  
	       } else {   
	    	inicializarCuenta(max);
	       contar();
	       rellenarPrimos();
	       return primos; 
	    }
	}
	/**
	 * Inicia la cuenta de los valores primos
	 * @param max
	 */
	private static void inicializarCuenta (int max) 
	  {   
	    int x;
	    dim = max + 1; 
	    esPrimo = new boolean[dim];     
	for (x=0; x<dim; x++)    
		esPrimo[x] = true; 
	    esPrimo[0] = esPrimo[x] = false; 
	}
	/**
	 * 
	 * Cuenta
	 * @author JGarcia
	 * @param 
	 */
	private static void contar () 
	  {   
	    int x, y;
	    for (x=2; x<Math.sqrt(dim)+1; x++) 
	    {    
	    	if (esPrimo[x]) 
	    	{
    		for (y=2*x; y<dim; y+=x)    
    			esPrimo[y] = false; 
	        } 
	    }
	  }
	/**
	 * Rellena el array con los valores primos
	 * @author JGarcia
	 * @param
	 */
	private static void rellenarPrimos ()
	  {
	    int x, y, contar;
	    contar = 0;   
	    for (x=0; x<dim; x++) 
	        if (esPrimo[x])   
	        	contar++;    
	    primos = new int[contar];     
	    for (x=0, y=0; x<dim; x++)
	        if (esPrimo[x])
	           primos[y++] = x;   
	  }
	/**
	 * @author JGarcia
	 * @param args
	 */
    public static void main (String args[]) {
        System.out.println("Generació de nombres primers amb Garbell d'Erastòtenes:");
        System.out.println("-------------------------------------------------------");
        int[] VectorFinalPrimers;
        VectorFinalPrimers = generarPrimos (120);
        System.out.println(VectorFinalPrimers.length + " nombres primers trobats en el interval [1-120]");
        System.out.println(Arrays.toString(VectorFinalPrimers));
    }
    
	
}
	        
	        



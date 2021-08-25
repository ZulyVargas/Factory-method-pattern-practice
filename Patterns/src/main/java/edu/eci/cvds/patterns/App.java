package edu.eci.cvds.patterns;

/**
 * Hello world!
 * Personalized Greeting
 */
public class App 
{
	/**
	 * Main method
	 * @params args Array of strings with the names of the person to greet
	 */
    public static void main( String[] args )
    {
        if (args.length==0) System.out.println( "Hello World!" );
        if (args.length>0) {
        	String saludo="Hello";
        	for (int i=0; i<args.length;i++) {
        		saludo = saludo+" "+args[i];
        	}
        	saludo = saludo +"!";
            System.out.println(saludo);
        }
    }
}

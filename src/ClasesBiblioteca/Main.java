
package ClasesBiblioteca;

/**
 *
 * @author PC-De-GOBIERNO
 */
public class Main {
   public static void main (String [] args){
   
   Libro rayuela = new Libro ();
   
   rayuela.setTitulo("Rayuela");
   rayuela.setAutor("Julio Cortazar");
   rayuela.setPaginas(485);
   
   rayuela.mostrarlibro();
   
   Libro extranjero = new Libro ();
   
   extranjero.setTitulo("Biografia de Vicente Fernandes");
   extranjero.setAutor("Carlos Gomez");
   extranjero.setPaginas(552);
   
   extranjero.mostrarlibro();
   
   System.out.println(rayuela.compararlibro(rayuela, extranjero));
  
   }
}

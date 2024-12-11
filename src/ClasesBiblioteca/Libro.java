package ClasesBiblioteca;

/**
 *
 * @author PC-De-GOBIERNO
 */
public class Libro {
    
    private String autor;
    private String titulo;
    private int paginas;

    public Libro() {
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

public void mostrarlibro() {
    System.out.println("El titulo es: "+titulo+"\nEl autor es: "+autor+"\nLa cantidad de paginas es: "+paginas);
}

public String compararlibro (Libro libro1 ,Libro libro2) {

    return libro1.getPaginas() > libro2.getPaginas()? libro1.getTitulo()+ 
    " Tiene mas paginas" : libro2.getTitulo()+ " Tiene mas paginas";
}   
}

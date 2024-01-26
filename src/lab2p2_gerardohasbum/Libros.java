package lab2p2_gerardohasbum;
public class Libros {
    
    String titulo;
    String autor;
    String genero;
    String año;
    char dispo;

    public Libros(String titulo, String autor, String genero, String año, char dispo) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.año = año;
        this.dispo = dispo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public char getDispo() {
        return dispo;
    }

    public void setDispo(char dispo) {
        this.dispo = dispo;
    }

    @Override
    public String toString() {
        return titulo + "\n Autor: " + autor + "\n Genero: " + genero + "\n Year: " + año + "\n Disponible[s/n]: " + dispo;
    }
    
    
    
}

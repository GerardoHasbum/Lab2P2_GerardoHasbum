package lab2p2_gerardohasbum;
public class Articulos {
    
    String titulo;
    String autor;
    String tema;
    String fecha;
    char dispo;

    public Articulos(String titulo, String autor, String tema, String fecha, char dispo) {
        this.titulo = titulo;
        this.autor = autor;
        this.tema = tema;
        this.fecha = fecha;
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

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public char getDispo() {
        return dispo;
    }

    public void setDispo(char dispo) {
        this.dispo = dispo;
    }
    
    
    
}

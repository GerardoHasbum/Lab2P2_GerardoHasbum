package lab2p2_gerardohasbum;
public class Conferencias {
  
    String titulo;
    String conf;
    String fecha;
    int dur;
    String enlace;

    public Conferencias(String titulo, String conf, String fecha, int dur, String enlace) {
        this.titulo = titulo;
        this.conf = conf;
        this.fecha = fecha;
        this.dur = dur;
        this.enlace = enlace;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConf() {
        return conf;
    }

    public void setConf(String conf) {
        this.conf = conf;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getDur() {
        return dur;
    }

    public void setDur(int dur) {
        this.dur = dur;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    @Override
    public String toString() {
        return titulo + "\n Conferencista: " + conf + "\n Fecha: " + fecha + "\n Duracion: " + dur + "\n Enlace:" + enlace;
    }
    
}

package lab2p2_gerardohasbum;
public class Cursos {
    
    String titulo;
    String inst;
    int dur;
    String plat;

    public Cursos(String titulo, String inst, int dur, String plat) {
        this.titulo = titulo;
        this.inst = inst;
        this.dur = dur;
        this.plat = plat;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInst() {
        return inst;
    }

    public void setInst(String inst) {
        this.inst = inst;
    }

    public int getDur() {
        return dur;
    }

    public void setDur(int dur) {
        this.dur = dur;
    }

    public String getPlat() {
        return plat;
    }

    public void setPlat(String plat) {
        this.plat = plat;
    }

    @Override
    public String toString() {
        return titulo + "\n Instructor: " + inst + "\n Duracion: " + dur + "\n Plataforma: " + plat;
    }
    
    
}

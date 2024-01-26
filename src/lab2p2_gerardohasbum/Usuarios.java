package lab2p2_gerardohasbum;
public class Usuarios {
    
    String nom;
    String cont;
    String tipo;

    public Usuarios(String nom, String cont, String tipo) {
        this.nom = nom;
        this.cont = cont;
        this.tipo = tipo;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}

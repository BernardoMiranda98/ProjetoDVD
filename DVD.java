
package Principal.Principal;


public class DVD {
    private String titulo;
    private String sinopse; 

    public DVD(String titulo, String sinopse) {
        this.titulo = titulo;
        this.sinopse = sinopse;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
    
}

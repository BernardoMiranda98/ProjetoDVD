
package Principal.Principal;


public class DVD {
    private String titulo;
    private String sinopse; 
    private Genero genero;
    private Pessoa artistaPrincipal;
    private Pessoa diretor;

    public DVD(String titulo, String sinopse, Genero genero, Pessoa artistaPrincipal, Pessoa diretor) {
        this.titulo = titulo;
        this.sinopse = sinopse;
        this.genero = genero;
        this.artistaPrincipal = artistaPrincipal;
        this.diretor = diretor;
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

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Pessoa getArtistaPrincipal() {
        return artistaPrincipal;
    }

    public void setArtistaPrincipal(Pessoa artistaPrincipal) {
        this.artistaPrincipal = artistaPrincipal;
    }

    public Pessoa getDiretor() {
        return diretor;
    }

    public void setDiretor(Pessoa diretor) {
        this.diretor = diretor;
    }

  
}

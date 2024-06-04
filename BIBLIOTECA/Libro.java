public class Libro {
    private String titolo;
    private int copie;
    private int copieInPrestito;
    public Libro(String titolo, int copie) {
        this.titolo = titolo;
        this.copie = copie;
        copieInPrestito = 0;
    }
    public String getTitolo() {
        return titolo;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    public int getCopie() {
        return copie;
    }
    public void setCopie(int copie) {
        this.copie = copie;
    }
    public int getCopieInPrestito() {
        return copieInPrestito;
    }
    public void setCopieInPrestito(int copieInPrestito) {
        this.copieInPrestito = copieInPrestito;
    }
    
}

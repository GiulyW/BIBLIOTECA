import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Libro> libriBiblioteca = new ArrayList<>();

    public void aggiungiLibro(Libro libro) {
        for (Libro libroBiblioteca : libriBiblioteca) {
            if (libroBiblioteca.getTitolo().equals(libro.getTitolo())) {
                libroBiblioteca.setCopie(libroBiblioteca.getCopie() + libro.getCopie());
                break;
            }
        }
        libriBiblioteca.add(libro);
    }

    public void prestaLibro(String titolo) {
        for (Libro libroBiblioteca : libriBiblioteca) {
            if (libroBiblioteca.getTitolo().equals(titolo)) {
                if(libroBiblioteca.getCopie() != 0) {
                    libroBiblioteca.setCopie(libroBiblioteca.getCopie() - 1);
                    libroBiblioteca.setCopieInPrestito(libroBiblioteca.getCopieInPrestito()+1);
                    System.out.println("Prestito effettuato con successo");
                    break;
                } else {
                    System.out.println("Non disponibile per mancanza di copie");
                    break;
                }
                
            } else {
                System.out.println("Libro non presente in Biblioteca");
            }
        }
    }

    public void restituisciLibro(String titolo) {
        for (Libro libroBiblioteca : libriBiblioteca) {
            if (libroBiblioteca.getTitolo().equals(titolo)) {
                libroBiblioteca.setCopie(libroBiblioteca.getCopie() + 1);
                libroBiblioteca.setCopieInPrestito(libroBiblioteca.getCopieInPrestito() - 1);
                return;
            }
        }
    }

    public void rimuoviLibro(String titolo){
        for (Libro libroBiblioteca : libriBiblioteca) {
            if (libroBiblioteca.getTitolo().equals(titolo)) {
                libriBiblioteca.remove(libroBiblioteca);
                System.out.println("Libro rimosso con successo");
                break;
            } else {
                System.out.println("Libro non presente in biblioteca");
                break;
            }
        }
    }

    
    public String stampaLibriDisponibili() {
        String str = "Libri disponibili in Biblioteca: \n";
        for (Libro libro : libriBiblioteca) {
            str += "- Titolo: " + libro.getTitolo() + ", Copie: " + libro.getCopie() + "\n";
        }
        return str;
    }


}
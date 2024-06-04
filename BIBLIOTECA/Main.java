import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        System.out.println("\nBENVENUTI NELLA BIBLIOTECA!\n");
        boolean done = false;
        Scanner scanner = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);

        while(!done) {
            System.out.println("Selezionare l'azione desiderata :");
            System.out.println("1) per AGGIUNGERE un libro");
            System.out.println("2) per prendere in PRESTITO un libro");
            System.out.println("3) per RESTITUIRE un libro");
            System.out.println("4) per ELIMINARE un libro e le sue copie");
            System.out.println("5) per USCIRE");
            int scelta = scanner.nextInt();
            switch (scelta) {
                case 1: //aggiungere libro
                    System.out.println("Inserisci il titolo del libro : ");
                    String titolo = scannerS.nextLine();
                    System.out.println("Inserisci il numero di copie : ");
                    int numCopie = scanner.nextInt();
                    Libro libro = new Libro(titolo, numCopie);
                    biblioteca.aggiungiLibro(libro);
                    System.out.println(biblioteca.stampaLibriDisponibili());
                    break;
                case 2: //prendere in prestito
                    System.out.println("Inserisci il titolo del libro : ");
                    String titololibro = scannerS.nextLine();
                    biblioteca.prestaLibro(titololibro);
                    System.out.println(biblioteca.stampaLibriDisponibili());
                    break;
                case 3: //restituire un libro
                    System.out.println("Inserisci il titolo del libro : ");
                    String libroDaRestituire = scannerS.nextLine();
                    biblioteca.restituisciLibro(libroDaRestituire);
                    System.out.println(biblioteca.stampaLibriDisponibili());
                    break;
                case 4: //elimina libro
                    System.out.println("Inserisci il titolo del libro : ");
                    String libroDaEliminare = scannerS.nextLine();
                    biblioteca.rimuoviLibro(libroDaEliminare);
                    System.out.println(biblioteca.stampaLibriDisponibili());
                    break;
                case 5:
                    System.out.println("Uscita...");
                    done = true;
                    break;
                default:
                    System.out.println("Input non valido");
                    break;
            }
        
        }
    scanner.close();
    scannerS.close();     
    }
}

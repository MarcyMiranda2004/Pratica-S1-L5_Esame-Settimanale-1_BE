import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        MultimedialElement[] elements = new MultimedialElement[5];
        int fileNumber = 1;

        for (int i = 0; i < elements.length; i++) {
            System.out.println("Di che tipo è il  tuo file n" + fileNumber++ + " ?");
            System.out.println("\n 1: Immagine \n 2: Audio \n 3: Video");
            int type = scan.nextInt();
            scan.nextLine();

            System.out.println("Dai un titolo al tuo file");
            String title = scan.nextLine();

            switch (type) {
                case 1 -> {
                    System.out.println("seleziona la luminosita della tua immagine (da 1 a 10)");
                    int brightness = scan.nextInt();
                    elements[i] = new Image(title, brightness);
                }

                case 2 -> {
                    System.out.println("Seleziona la durata del tuo Audio");
                    int durata = scan.nextInt();
                    System.out.println("seleziona il volume del tuo Audio (da 0 a 10)");
                    int volume = scan.nextInt();
                    elements[i] = new Audio(title, durata, volume);
                }

                case 3 -> {
                    System.out.println("Seleziona la durata del tuo Video");
                    int durata = scan.nextInt();
                    System.out.println("seleziona il volume del tuo Video (da 0 a 10)");
                    int volume = scan.nextInt();
                    System.out.println("seleziona la luminosita del tuo Video (da 1 a 10)");
                    int brightness = scan.nextInt();
                    elements[i] = new Video(title, durata, volume, brightness);
                }

                default -> {
                    System.out.println("Errore: tipo non valido, Riprova.");
                    i--;
                    fileNumber--;
                }

            }
        }

        while (true) {
            System.out.println("\nQuale file vuoi eseguire? (1-5) oppure 0 per uscire:");
            for (int i = 0; i < elements.length; i++) {
                System.out.println((i + 1) + ": " + elements[i].getName());
            }
            System.out.println("0: Esci");

            int selected = scan.nextInt();

            if (selected == 0) {
                System.out.println("Chiusura programma.");
                break;
            }

            if (selected < 1 || selected > 5) {
                System.out.println("File non valido. Riprova.");
            } else {
                MultimedialElement element = elements[selected - 1];
                if (element instanceof Image image) {
                    image.show();
                } else if (element instanceof Audio audio) {
                    audio.play();
                } else if (element instanceof Video video) {
                    video.play();
                }
            }
        }
        scan.close();
    }
}
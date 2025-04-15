import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scor = 0;

        System.out.println(" Bine ai venit în Universul Copilăriei!");
        System.out.println("Răspunde corect la întrebările de mai jos.\n");

        // Întrebarea 1
        System.out.println("1. Cu ce ne jucam în curtea școlii?");
        System.out.println("a) Playstation 5\nb) Șotron\nc) Jocuri VR");
        System.out.print("Răspunsul tău: ");
        String r1 = scanner.nextLine();
        if (r1.equalsIgnoreCase("b")) {
            scor++;
        }

        // Întrebarea 2
        System.out.println("\n2. Ce personaj animat avea un burete galben și locuia sub apă?");
        System.out.println("a) Spongebob\nb) Tom\nc) Daffy Duck");
        System.out.print("Răspunsul tău: ");
        String r2 = scanner.nextLine();
        if (r2.equalsIgnoreCase("a")) {
            scor++;
        }

        // Întrebarea 3
        System.out.println("\n3. Ce dulciuri primeam la colindat?");
        System.out.println("a) Prăjituri vegane\nb) Napolitane și portocale\nc) Energy bars");
        System.out.print("Răspunsul tău: ");
        String r3 = scanner.nextLine();
        if (r3.equalsIgnoreCase("b")) {
            scor++;
        }

        // Rezultat final
        System.out.println("\n Ai obținut " + scor + " puncte din 3!");

        if (scor == 3) {
            System.out.println("Ești un copil autentic al anilor '90 sau 2000! ");
        } else if (scor == 2) {
            System.out.println("Aproape perfect! Ai prins vibe-ul copilăriei.");
        } else {
            System.out.println("Hmm... mai trebuie să te plimbi pe ulițele copilăriei. ");
        }

        scanner.close();
    }
}

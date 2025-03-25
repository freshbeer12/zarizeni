import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Kolik zařízení chceš zadat?");
        int count = sc.nextInt();
        sc.nextLine();

        IPrehravac[] prehravace = new IPrehravac[count];

        for (int i = 0; i < count; i++) {
            System.out.println("Stiskni 1 pro MP3 ; Stiskni 2 pro Smartphone ; Stiskni 3 pro Radio");
            int volba = sc.nextInt();
            sc.nextLine();

            switch (volba) {
                case 1:
                    System.out.println("Jaká je značka MP3?");
                    String znacka = sc.nextLine();
                    prehravace[i] = new Mp3(znacka);
                    break;
                case 2:
                    System.out.println("Jaký je model smartphonu?");
                    String model = sc.nextLine();
                    prehravace[i] = new Smartphone(model);
                    break;
                case 3:
                    prehravace[i] = new Radio();
                    break;
                default:
                    System.out.println("Neplatná volba. Zkus to znovu.");
                    i--;
                    break;
            }
        }

        System.out.println("Vyber zařízení pro přehrávání (1 až " + (count + 0) + "):");
        int prehraj = sc.nextInt();
        sc.nextLine();

        if (prehraj >= 0 && prehraj < count) {
            prehravace[prehraj].prehraj(true);
        } else {
            System.out.println("Neplatná volba.");
        }

        System.out.println("Vyber zařízení pro zastavení přehrávání (1 až " + (count + 0) + "):");
        int zastav = sc.nextInt();
        sc.nextLine();

        if (zastav >= 0 && zastav < count) {
            prehravace[zastav].prehraj(false);
        } else {
            System.out.println("Neplatná volba.");
        }
    }
}

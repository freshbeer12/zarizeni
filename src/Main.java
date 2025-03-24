import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {

    System.out.println("Chceš zapisovat (1) nebo zobrazovat (2) ?");

    System.out.println("Kolik zařízení chceš zadat?");
    int count = sc.nextInt();
    sc.nextLine();

    IPrehravac[] prehravace = new IPrehravac[count];

    for (int i = 0; i < count; i++) {
        System.out.println("Stiskni 1 pro MP3 ; Stiskni 2 pro Smartphone ; Stiskni 3 pro radio");
        int volba = sc.nextInt();
        sc.nextLine();

        switch (volba) {
            case 1:
                System.out.println("Jaká je značka MP3?");
                String znacka = sc.nextLine();
                prehravace[i] = new Mp3(znacka);
                break;
            case 2:
                System.out.println("Jaký je model smartphonu");
                String model = sc.nextLine();
                prehravace[i] = new Smartphone(model);
                break;
            case 3:
                prehravace[i] = new Radio();
                break;

        }
    }


    IPrehravac[] zarizeni = new Mp3[3];
    zarizeni[0] = new Mp3("Sony");
    zarizeni[1] = new Smartphone("Appel");
    zarizeni[2] = new Radio();

    //Mp3[] mp3 = new Mp3(znacka){
     //   prehravace[i] = mp3

}
}
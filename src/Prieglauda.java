import java.util.ArrayList;
import java.util.Scanner;

public class Prieglauda {
    private ArrayList sunys = new ArrayList<Suo>();
    private ArrayList kates = new ArrayList<Kate>();
    private ArrayList pauksciai = new ArrayList<Paukstis>();
    private boolean veikia = true;

    private Scanner scanner = new Scanner(System.in);

    public Prieglauda() {
        var paukstis = new Paukstis("Erelis",12,5,12);
        var paukstis2 = new Paukstis("Vanagas",12,5,12);
        var kate = new Kate("Kicius",12,5,"Juoda");
        pauksciai.add(paukstis);
        pauksciai.add(paukstis2);
        kates.add(kate);

    }

    public void prieglaudaUi (){

        while (veikia){
            System.out.println("Prieglaudos valdymo sistema");
            System.out.println();
            System.out.println("1: Sukurti nauja gyvuna");
            System.out.println("2: Prideti gyvuna i sarasa");
            System.out.println("3: Spauzdinti esamus gyvunus");
            System.out.println();
            String pasirinkimas = scanner.nextLine();
            switch (pasirinkimas){
                case "1":
                    sukurtiNaujaGyvuna();
                    veikia = false;
                    break;
                case "2":

                    break;
                case "3":
                    spauzdinti();
                    veikia = false;
                    break;
                case "4":
                    spauzdinti();
                    veikia = false;
                    break;
                default:
                    System.out.println("Nepavyko pasirinkti");
                    break;
            }
        }
    }

    private void sukurtiNaujaGyvuna (){
        String veisle;
        String kailioSpalva;
        int sparnuIlgis;
        System.out.println("Pasirinkite koki gyvuna norite prideti:");
        System.out.println("1: Suo");
        System.out.println("2: Kate");
        System.out.println("3: Paukstis");

        String gyvunoTipas = scanner.nextLine();
        int gyvunas = 0;
        boolean aktyvus = true;
        while (aktyvus) {
            switch (gyvunoTipas) {
                case "1":
                    gyvunas = 1;
                    aktyvus = false;
                    break;
                case "2":
                    gyvunas = 2;
                    aktyvus = false;
                    break;
                case "3":
                    gyvunas = 3;
                    aktyvus = false;
                    break;
                default:
                    System.out.println("Blogas pasirinkimas!");
            }
        }

        System.out.println("Iveskite gyvuno varda: ");
        String vardas = scanner.nextLine();
        System.out.println("Iveskite gyvuno amziu");
        int amziu = scanner.nextInt(); // TODO padaryti patikrinima del skaiciu
        System.out.println("Iveskite gyvuno svori");
        int svoris = scanner.nextInt();


        if (gyvunas == 1){
            System.out.println("Iveskite suns veisle: ");
            scanner.nextLine();
            veisle = scanner.nextLine();
            sunys.add(new Suo(vardas,amziu,svoris,veisle));
        } else if (gyvunas == 2){
            System.out.println("Iveskite kates kailio spalva:");
            scanner.nextLine();
            kailioSpalva = scanner.nextLine();
            kates.add(new Kate(vardas,amziu,svoris,kailioSpalva));
        } else if (gyvunas == 3) {
            System.out.println("Iveskite paukscio sparnu ilgy");
            scanner.nextLine();
            sparnuIlgis = scanner.nextInt();
            pauksciai.add(new Paukstis(vardas,amziu,svoris,sparnuIlgis));
        }

        prieglaudaUi();
    }

    private void surastiGyvuna (){
        System.out.println("Iveskite gyvuno varda: ");
        String vardas = scanner.nextLine();


    }

    private void spauzdinti (){
        System.out.println("\nPrieglaudos Gyvunai:");
        for (Object p : pauksciai){
            System.out.println(p);
        }

        for (Object p : sunys){
            System.out.println(p);
        }

        for (Object p : kates){
            System.out.println(p);
        }
        System.out.println();
        prieglaudaUi();
    }
}

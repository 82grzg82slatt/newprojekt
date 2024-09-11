import java.util.*;

public class Main {

    /**
     * wylosujListe - losuje liste liczb całkowitych z zakresu 1,100
     * @param ileElementow - liczba wylosowanych elemwntów
     * @return - ArrayListe z liczbami wylosowanymi
     */
    private static ArrayList<Integer> wylosujListe(int ileElementow){
        //losowanie listy bez powtorzen
        ArrayList<Integer> listaLiczbWylosowanychBezPowtorzen = new ArrayList<>();
        for (int i = 0; i < ileElementow; i++) {
            int liczba = (int)(Math.random()*100+1);
            while (listaLiczbWylosowanychBezPowtorzen.contains(liczba)){
                liczba = (int)(Math.random()*100+1);

            }
            listaLiczbWylosowanychBezPowtorzen.add(liczba);

        }
        return listaLiczbWylosowanychBezPowtorzen;
    }

    private static void  wypiszListe(List<Integer> listaDoWypisania){
        System.out.println("Wypisywana lista:");
        for (int i = 0; i < listaDoWypisania.size(); i++) {
            System.out.println(listaDoWypisania.get(i));
        }
    }

    private static ArrayList<Integer>wstawLiczbyDoListy(int ileElementow){
        ArrayList<Integer> listaLiczbZKlawiatury = new ArrayList<>();
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj "+ileElementow+" liczb");
        for (int i = 0; i <ileElementow; i++) {
            int liczba = klawiatura.nextInt();
            listaLiczbZKlawiatury.add(liczba);
        }
        return listaLiczbZKlawiatury;

    }

    private static ArrayList<Integer> zwrocElementyZObuList (ArrayList<Integer>listaLiczbZKlawiatury, ArrayList<Integer>listaLiczbWylosowanychBezPowtorzen) {
        ArrayList<Integer> trafione = new ArrayList<>();
        for (Integer wpisana : listaLiczbZKlawiatury) {
            if (listaLiczbWylosowanychBezPowtorzen.contains(wpisana)) {
                trafione.add(wpisana);
            }
        }
        return trafione;
    }

    public static void main(String[] args) {
        ArrayList<Integer> losowe = wylosujListe( 6);
        wypiszListe(losowe);
        ArrayList<Integer> wpisane = wstawLiczbyDoListy( 6);
        wypiszListe(wpisane);
        ArrayList<Integer> trafione =zwrocElementyZObuList(losowe, wpisane);
        wypiszListe(trafione);

        /*
            1. git init

2. git config user.name ""

3. git config user.email ""

4. git add .

5. git commit -m "komentarz"

6. git remote add origin https://github.com/82grzg82slatt/newprojekt.git

7. git push -u origin master

i potem tylko

1. git add .

2. git commit -m "komentarz"

3. git push -u
         */
    }
}
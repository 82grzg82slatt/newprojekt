public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //losowanie liczb do tablicy 6 elementowej
        /*
        tablica musi mieć zdefiniowany rozmiar,
        którego potem nie można zmieniać
        W javie tablica może przechowywać typy proste i złożone
         */
        int[] tablicaLiczbLosowych = new int[6];
        for (int i = 0; i < tablicaLiczbLosowych.length; i++) {
            tablicaLiczbLosowych[i] = (int) (Math.random()*100+1);//losuje od 1 do 100

        }
        //wypisywanie tablicy na ekranie
        System.out.println("wylosowana tablica:");
        for (int element:tablicaLiczbLosowych){
            //(typ nazwa:nazwakolekcji)
            System.out.print(element+", ");
        }
    }
}
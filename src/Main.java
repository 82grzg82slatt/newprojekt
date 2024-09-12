import java.util.*;

public class Main {


    public static void main(String[] args) {
        Gra gra1 = new Gra();
        gra1.zagraj();
        gra1.zagraj();

        Gra gra2 = new Gra();
        gra2.zagraj();

        double[] pierwiastki = new double[11];
        pierwiastki[0] = 0;
        for (int i = 1; i < pierwiastki.length; i++) {
            pierwiastki[1] = Math.sqrt(i);

        }
        System.out.println(pierwiastki[2]);

        int fibonaci [] = new  int[30];
        fibonaci[0] = 0;
        fibonaci[1] = 1;
        for (int i = 2; i < fibonaci.length; i++) {
            fibonaci[i] = fibonaci[i-1] + fibonaci[i-2];
        }
    }


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

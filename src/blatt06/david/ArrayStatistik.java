package blatt06.david;
import java.util.*;


public class ArrayStatistik {

    public static int arithmetischerMittelwert(int[] liste){
        long summe = 0;
        for(int x : liste){
            summe += x;
        }
        return (int)(summe/liste.length);
    }

    public static int maximum(int[] liste){
        int max = liste[0];
        for(int x: liste){
            max = Math.max(max,x);
        }
        return max;
    }

    public static int minimum(int[] liste){
        int min = liste[0];
        for(int x: liste){
            min = Math.min(min,x);
        }
        return min;
    }

    public static int median(int[] liste){
       int median;
       Arrays.sort(liste);
       median = liste.length % 2 == 0 ? liste[liste.length/2] : liste[(liste.length + 1) / 2];
       return median;
    }

    public static float erwartungswertDesSchadens(float[][] liste){
        float erwartungswert = 0;
        for( int x = 0; x < liste[0].length ; x++){
            erwartungswert += liste[0][x] * liste[1][x];
        }
        return erwartungswert;
    }

    public static void main(String[] args) {
        int[] geeignetesArray = new int[] {35, 7, 90, 26, 92, 54, 24, 65, 2, 67, 43, 26, 80, 92, 7, 40, 67,
                66, 31, 45, 7, 100, 96, 93, 12, 20, 57, 22, 62, 51, };
        float[][] schadensListe = new float[][] {{0, 350, 1500, 5000, }, {74.4f, 18.2f, 6.1f, 1.3f}};

        System.out.println("Arithmetischer Mittelwert:" + arithmetischerMittelwert(geeignetesArray));
        System.out.println("Maximum:" + maximum(geeignetesArray));
        System.out.println("Minimum:" + minimum(geeignetesArray));
        System.out.println("Median:" + median(geeignetesArray));
        System.out.println("Erwartungswert des Schadens:" + erwartungswertDesSchadens(schadensListe));

    }
}


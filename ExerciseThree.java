//Skriv en rekursiv algoritme med følgende signatur:
// bool additive(String s) Parameteren indeholder en streng bestående
// af cifre, fx. “82842605”.Algoritmen returnerer true, hvis parameteren
// indeholder en substring af tre på hinanden efterfølgende tal,
// hvor det  tredje ciffer er lig med summen af de to forrige.
// I ovenstående eksempel returnerestrue, fordi indeks 5 (6) er summen
// af indeks 3 og 4 (4 plus 2).Tip: ASCII-værdien af karakteren ‘7’ er 55


public class ExerciseThree {
    public static boolean additive(String s){
        if (s.length() < 3) {
            return false;
        }
        // Få de første tre cifre
        int first = s.charAt(0) - '0'; // Konverter fra karakter til numerisk værdi '0' = 48
        int second = s.charAt(1) - '0';
        int third = s.charAt(2) - '0';

        // Tjek om tredje ciffer er summen af de første to
        if (third == first + second) {
            return true;
        }

        // Rekursivt kald med resten af strengen (næste position)
        return additive(s.substring(1));
    }


    public static void main(String[] args) {
        String s = "82842605";

        System.out.println(additive(s));
    }
}

//Skriv en rekursiv metode med følgende signatur:
// int logTo(int N) Algoritmen returner totals-logaritmen af N,
// og det er en forudsætning, at N er et naturligt tal og en
// potens af 2.  Kaldt med N = 32 returneres 5, og med N = 4096
// returneres   12


public class ExerciseTen {

    public static int logTo(int N){
        if (N<=0){
            return 0;
        }

        return (int)(Math.log(N) / Math.log(2));
    }

    public static void main(String[] args) {
        System.out.println(logTo(32));
        System.out.println(logTo(4096));

    }
}

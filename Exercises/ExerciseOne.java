//Skriv en rekursiv algoritme, som har et naturligt tal som parameter og returnerer summen
// af de ulige tals kvadrater fra 1 til N.
// Eksempel: kaldt med parameteren 8 returneres 84 (1^2 +3^2 + 5^2 + 7^2).
// Det er vigtigt at optimere algoritmen, så overflødige rekursive kald undgås


public class recursive{

    public static int sumOfOddSquares(int N){
        // Base-case: Hvis N er 0 eller negativt, returner 0
        if (N <= 0) {
            return 0;
        }

        // Hvis N er lige, kald rekursivt med N-1 for at finde næste ulige tal
        if (N % 2 == 0) {
            return sumOfOddSquares(N - 1);
        }

        // Hvis N er ulige, læg N^2 til summen og kald rekursivt med N-2
        return N * N + sumOfOddSquares(N - 2);


    }

    public static void main(String[]args){

        int N = 8;
        sumOfOddSquares(N);

    }


}



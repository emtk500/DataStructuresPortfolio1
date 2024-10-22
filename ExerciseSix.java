//Skriv en rekursiv algoritme med følgende signatur:
// int sumDivisibleBy3(int N)
// Algoritmen returnerer summen af heltal større end 0 og mindre
// end eller lig med N, som er dividérbare med 3.
// Kaldt medN = 12 er den korrekte returværdi 30 (3+6+9+12).
// Kaldt medN = 14 er den korrekte returværdi også 30.




public class ExerciseSix {

        public static int isDivisibleByThree(int N) {

            if(N<=1){
                return 0;
            }

            // Hvis N er deleligt med 3, så læg N til summen af de tal som er delelige med 3 op til N-3
            if (N % 3 == 0) {
                return N + isDivisibleByThree(N - 3);
            } else {
                // Hvis N ikke er deleligt med 3, så find summen op til N-1
                return isDivisibleByThree(N - 1);
            }

        }

    public static void main(String[] args) {
        System.out.println(isDivisibleByThree(12));
        System.out.println(isDivisibleByThree(14));

    }


    }




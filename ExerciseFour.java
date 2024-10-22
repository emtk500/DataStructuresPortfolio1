//Skriv en algoritme, der har et array af usorterede,
// entydige naturlige tal som input og find de tre tal i arrayet,
// hvis sum er tættest på en potens af 2.
// Det samme tal kan må bruges én gang.
// Algoritmens returværdi skal være et heltalsarray, som først indeholder
// de tre tal og dernæst den tilhørende potens af to (fx 512).
// Kaldt med arrayet {23,56,22,11,65,89,3,44,87,910,45,35,98},
// returneres de tre tal 89, 3, 35 og potensen af 2: 128.
//
// Hvad er Store-O tidskompleksiteten af din algoritme?
// Begrund dit svar og diskuter mulighederne for at optimere din løsning
// yderligere




public class ExerciseFour {
    // Hjælpefunktion til at finde den nærmeste potens af 2
    public static int nearestPowerOfTwo(int n) {
        int power = 1;
        while (power < n) {
            power *= 2;
        }
        return power;
    }

    public static int[] findClosestSum(int[] arr) {
        int[] result = new int[4];  // De tre tal og den tilhørende potens af 2
        int closestDiff = Integer.MAX_VALUE;  // Holder styr på den mindste forskel

        // Gennemgå alle mulige kombinationer af tre tal
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    int nearestPower = nearestPowerOfTwo(sum);
                    int diff = Math.abs(nearestPower - sum);

                    // Opdater resultatet, hvis vi finder en tættere sum
                    if (diff < closestDiff) {
                        closestDiff = diff;
                        result[0] = arr[i];
                        result[1] = arr[j];
                        result[2] = arr[k];
                        result[3] = nearestPower;  // Den tilhørende potens af 2
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {23, 56, 22, 11, 65, 89, 3, 44, 87, 910, 45, 35, 98};
        int[] result = findClosestSum(arr);
        System.out.println("De tre tal: " + result[0] + ", " + result[1] + ", " + result[2]);
        System.out.println("Den nærmeste potens af 2: " + result[3]);
    }
}

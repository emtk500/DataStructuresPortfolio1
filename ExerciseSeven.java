//6561 er et eksempel på et naturligt tal,
// som kan skrives som XY h vor X og Y er heltal, dvs. 94.
// Et andet eksempel er 3125 (55).
// Skriv en algoritme, som kan afgøre om et givent naturligt tal
// Z < 100,000 (algoritmens parameter) k an skrives som Z=XY hvor X og Y
// er heltal, hvorom det gælder, at X > 2 og Y > 2.
// Algoritmens returværdi skal designes således, at følgende information
// kan udledes fra den:•Værdien af X (i tilfældet 6561 er X=9).•
// Værdien af Y (i tilfældet 6561 er Y=4).•
// For det givne Z kan der være flere løsningspar (X,Y).
// For 3125 er der kun et løsningspar; men for 6561 er X=3 og Y=8
// også en mulighed. Hvis der er mere end én løsning, skal den med den
// største X-værdi returneres.•Hvis det givne Z ikke har noget
// løsningspar (X,Y) eller Z indeholder en ulovlig værdi, returneres
// en dummy eller default værdi.
// Algoritmen skal optimeres under antagelsen af, at maksimumværdien for
// Z og minimumsværdierne for X og Y aldrig ændrer sig.

public class ExerciseSeven {

    public static int[] checkInt(int Z) {
        // Tjekker om input er valid
        if (Z <= 2 || Z >= 100000) {
            return new int[]{-1, -1};
        }

        int bestX = -1;
        int bestY = -1;

        // Itererer igennem mulige værdier for X
        for (int x = 3; x <= Math.sqrt(Z); x++) {
            // Udregner mulige Y værdier ved brug af logaritmer
            double yDouble = Math.log(Z) / Math.log(x);
            int y = (int) yDouble; // Truncate to integer

            // Se om X^Y = Z og om Y > 2
            if (Math.pow(x, y) == Z && y > 2) {
                if (bestX < x) { // Check if this is the largest X found
                    bestX = x;
                    bestY = y;
                }
            }
        }

        // Returner dummy tal hvis der ikke er en løsning
        if (bestX != -1) {
            return new int[]{bestX, bestY};
        } else {
            return new int[]{-1, -1};
        }
    }

    public static void main(String[] args) {
        int Z1 = 6561;


        int[] result1 = checkInt(Z1);


        System.out.println("Z = " + Z1 + ": X = " + result1[0] + ", Y = " + result1[1]); // Should print X = 9, Y = 4

    }
}

public class Exercise11 {

    public static int array(int[] arr) {
        int n = arr.length;

        // Loop gennem hele arrayet for at finde alle mulige kandidater
        for (int i = 0; i < n; i++) {
            int count = 0;

            // Et nested loop tæller frekvensen af hver kandidat
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // Tjek hver kandidat om de har 50% eller flere stemmer
            if (count > n / 2) {
                return arr[i];
            }
        }


        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {7,4,3,5,3,1,6,4,5,1,7,5};

        System.out.println(array(arr));

    }
}

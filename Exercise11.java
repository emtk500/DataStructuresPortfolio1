public class Exercise11 {

    public static int array(int[] arr) {
        int n = arr.length;

        // Loop to consider each element as a candidate for majority
        for (int i = 0; i < n; i++) {
            int count = 0;

            // Inner loop to count the frequency of arr[i]
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // Check if count of arr[i] is more than half the size of the array
            if (count > n / 2) {
                return arr[i];
            }
        }

        // If no majority element found, return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {7,4,3,5,3,1,6,4,5,1,7,5};

        System.out.println(array(arr));

    }
}

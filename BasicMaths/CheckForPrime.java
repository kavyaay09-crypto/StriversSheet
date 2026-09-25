class CheckForPrime {
    public static void main(String[] args) {
        int N = 32;
        int count = 0;

        // Standard prime logic for numbers greater than 1
        if (N > 1) {
            for (int i = 1; i * i <= N; i++) {
                if (N % i == 0) {
                    count++;

                    // Count the paired factor if it's distinct
                    if ((N / i) != i) {
                        count++;
                    }
                }
            }
        }

        // A prime number has exactly two distinct positive divisors: 1 and itself
        if (N > 1 && count == 2) {
            System.out.println(N + " is a prime number.");
        } else {
            System.out.println(N + " is not a prime number.");
        }
    }
}
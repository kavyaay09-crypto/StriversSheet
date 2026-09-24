class Amstrong {
    public static void main(String[] args) {
        int N = 371;
        int Original = N;
        int Sum = 0;

        while (N > 0) {
            int Rem = N % 10;
            Sum = Sum + (Rem * Rem * Rem);

            N = N / 10;

        }
        if (Sum == Original) {
            System.out.println("its an Amstrong number" + Original);
        } else {
            System.out.println("its not an Amstrong number" + Original);
        }
    }
}

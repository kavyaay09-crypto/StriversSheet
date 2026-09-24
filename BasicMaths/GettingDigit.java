class GettingDigit {
    public static void main(String[] args) {
        int N = 7859;
        while (N > 0) {
            int Rem = N % 10;
            N = N / 10;
            System.out.println(Rem);
        }
    }
}
class ReverseDigit {

    public static void main(String[] args) {
        int N = 4567;
        int Reverse = 0;

        while (N > 0) {
            int Rem = N % 10;
            N = N / 10;
            Reverse = (Reverse * 10) + Rem;

        }
        System.out.println(Reverse);
    }
}

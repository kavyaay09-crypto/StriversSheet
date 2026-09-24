class Palindrome {

    public static void main(String[] args) {
        int N = 4567;
        int Original = N;
        int Reverse = 0;

        while (N > 0) {
            int Rem = N % 10;
            N = N / 10;
            Reverse = (Reverse * 10) + Rem;
        }

        if (Reverse == Original) {
            System.out.println("It is a Palindrome: " + Reverse);
        } else {
            System.out.println("It is not a Palindrome: " + Reverse);
        }
    }
}

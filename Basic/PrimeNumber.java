class PrimeNumber {
    public static void main(String args[]) {
        int i = 0, m, flag = 0;
        int n = 5; //Enter your number is here.
        m = n / 2;

        if (n == 0 || n == 1) {
            System.out.println(n + " is not prime number");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.print(n + " is prime number");
            }
        }
    }
}
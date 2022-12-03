
class ArmstrongNumber {
    public static void main(String args[]) {
        int input = 1634; //Please enter input here;
        int temp = input;
        int length = Integer.toString(input).length();
        int sum = 0;

        while (input > 0) {
            int n = input % 10;
            sum = sum + (int)Math.pow(n, length);
            input = input / 10;
        }

        if (temp == sum) {
            System.out.print("Armstrong number");
        } else {
            System.out.print("Not Armstrong number");
        }
    }
}
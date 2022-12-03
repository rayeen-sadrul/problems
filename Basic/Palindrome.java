class Palindrome {
    public static void main(String args[]) {
        String input = "48976984".toLowerCase();
        int i = 0;
        int j = input.length() - 1;
        boolean flag = false;

        while (i < j) {
            if (input.charAt(i) == input.charAt(j)) {
                flag = true;
                i++;
                j--;
            } else {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.print("String is palindrome");
        } else {
            System.out.print("String is not palindrome");
        }
    }
}
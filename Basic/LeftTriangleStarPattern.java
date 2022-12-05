class LeftTriangleStarPattern {
    public static void main(String args[]) {

        int rows = 5;
        int i, j;

        for (i = 0; i < rows; i++) {

            for (j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }

            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }
}
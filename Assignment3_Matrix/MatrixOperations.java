import java.util.Scanner;

class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[2][2];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Transpose:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(a[j][i] + " ");
            System.out.println();
        }

        boolean identity = true;
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                if ((i == j && a[i][j] != 1) || (i != j && a[i][j] != 0))
                    identity = false;

        System.out.println(identity ? "Identity Matrix" : "Not Identity Matrix");
    }
}

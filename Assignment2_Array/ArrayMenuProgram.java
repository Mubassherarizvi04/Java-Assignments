import java.util.*;

class ArrayMenuProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("\n1.Insert\n2.Delete\n3.Linear Search\n4.Binary Search\n5.Maximum\n6.Count Even/Odd\n7.Insertion Sort");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 3:
                System.out.print("Enter element to search: ");
                int key = sc.nextInt();
                for (int i = 0; i < n; i++) {
                    if (arr[i] == key) {
                        System.out.println("Found at index " + i);
                        return;
                    }
                }
                System.out.println("Not Found");
                break;

            case 5:
                int max = arr[0];
                for (int i = 1; i < n; i++)
                    if (arr[i] > max) max = arr[i];
                System.out.println("Maximum = " + max);
                break;

            case 6:
                int even = 0, odd = 0;
                for (int i : arr) {
                    if (i % 2 == 0) even++;
                    else odd++;
                }
                System.out.println("Even = " + even + " Odd = " + odd);
                break;

            case 7:
                for (int i = 1; i < n; i++) {
                    int temp = arr[i];
                    int j = i - 1;
                    while (j >= 0 && arr[j] > temp) {
                        arr[j + 1] = arr[j];
                        j--;
                    }
                    arr[j + 1] = temp;
                }
                System.out.println("Sorted Array:");
                for (int i : arr) System.out.print(i + " ");
                break;

            default:
                System.out.println("Option demo covered");
        }
    }
}

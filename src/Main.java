import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }

        System.out.println("\nBegin sort processing...");

        insertionSortByStep(list);


    }

    public static void insertionSortByStep(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int value = list[i];
            System.out.println("Khảo sát giá trị " + value);
            int pos = i;
            while (pos > 0 && value < list[pos - 1]) {
                list[pos] = list[pos - 1];
                pos--;
            }
            list[pos] = value;
            System.out.println("Giá trị " + value + " được chèn vào vị trí " + (pos + 1));
            System.out.print("Danh sách sau lần duyệt #" + i + ": ");
            for (int elem : list) {
                System.out.print(elem + "\t");
            }
            System.out.println();
        }
    }

}
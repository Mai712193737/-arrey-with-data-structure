import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = scan.nextInt();
        Methods Method = new Methods(size);

        System.out.println("Enter elements of array:");
        for (int j = 0; j < size; j++) {
            int valueAdd = scan.nextInt();
            Method.addAt(j, valueAdd); // بتحط العناصر في البداية
        }

        int choice;
        do {
            System.out.print(
                    "\n    Menu   \n" +
                            "1- View\n" +
                            "2- Insert\n" +
                            "3- Delete\n" +
                            "4- Search\n" +
                            "5- Exit\n" +
                            "Your choice: "
            );

            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    Method.printArray();
                    break;
                case 2:
                    System.out.print("Enter index: ");
                    int idx = scan.nextInt();
                    System.out.print("Enter value: ");
                    int val = scan.nextInt();
                    Method.addAt(idx, val);
                    break;
                case 3:
                    System.out.print("Enter index to delete: ");
                    int delIndex = scan.nextInt(); // لازم index مش قيمة
                    Method.delete(delIndex);
                    break;
                case 4:
                    System.out.print("Enter element to search: ");
                    int searchValue = scan.nextInt();
                    Method.search(searchValue);
                    break;
                case 5:
                    System.out.println("Good bye!");
                    break;
                default:
                    System.out.println("Error: Invalid choice!");
            }
        }
        while (choice != 5);


    }
}

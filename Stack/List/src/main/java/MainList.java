import java.util.Scanner;

public class MainList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List list = new List();
        boolean exit = false;

        while (!exit) {
            System.out.println("\n=== Linked List Menu ===");
            System.out.println("1. PushFront");
            System.out.println("2. PushBack");
            System.out.println("3. PrintList");
            System.out.println("4. First");
            System.out.println("5. Last");
            System.out.println("6. Size");
            System.out.println("7. Empty?");
            System.out.println("8. SearchByKeyAndIndex");
            System.out.println("9. EraseByKeyAndIndex");
            System.out.println("10. EraseDoubles");
            System.out.println("11. Clear");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // PushFront
                    System.out.print("Enter value to push at front: ");
                    int frontVal = scanner.nextInt();
                    list.PushFront(frontVal);
                    break;

                case 2: // PushBack
                    System.out.print("Enter value to push at back: ");
                    int backVal = scanner.nextInt();
                    list.PushBack(backVal);
                    break;

                case 3: // PrintList
                    list.PrintList();
                    break;

                case 4: // First
                    list.First();
                    break;

                case 5: // Last
                    list.Last();
                    break;

                case 6: // Size
                    System.out.println("List size: " + list.Size());
                    break;

                case 7: // Empty?
                    System.out.println("List is empty: " + list.Empty());
                    break;

                case 8: // SearchByKeyAndIndex
                    list.SearchByKeyAndIndex();
                    break;

                case 9: // EraseByKeyAndIndex
                    ListNode deleted = list.EraseByKeyAndIndex();
                    if (deleted != null) {
                        System.out.println("Deleted node with value: " + deleted.info);
                    }
                    break;

                case 10: // EraseDoubles
                    list.EraseDoubles();
                    System.out.println("Duplicates removed.");
                    break;

                case 11: // Clear
                    list.Clear();
                    System.out.println("List cleared ");
                    break;

                case 0:
                    exit = true;
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
    }
}

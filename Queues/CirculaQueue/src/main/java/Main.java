import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Queue queue = new Queue();


        //size,push,pop,front/back,empty,clear

        while(true){
            System.out.println("Choose action : ");
            System.out.println("1.Size");
            System.out.println("2.Push");
            System.out.println("3.Pop");
            System.out.println("4.Front");
            System.out.println("5.Back");
            System.out.println("6.Empty?");
            System.out.println("7.Clear");

            int number = sc.nextInt();
            switch (number){
                case 1 :
                    System.out.println( queue.Size());
                    break;
                case 2 :
                    int info = sc.nextInt();
                    queue.Push(info);
                    System.out.println("Actual Queue : "+queue.Display());
                    break;
                case 3 : queue.Pop();
                    System.out.println("Actual Queue: " +queue.Display());
                    break;
                case 4 : queue.Front();

                    break;
                case 5 : queue.Back();

                    break;
                case 6 : queue.Empty();
                    break;
                case 7 : queue.Clear();
                    System.out.println("Actual Queue " + queue.Display());
                    break;
            }
        }




    }

}

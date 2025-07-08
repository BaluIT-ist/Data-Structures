package Nodstack;

import java.util.Scanner;

public class MainStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack stack = new Stack();

       //  front/back,clear
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
                    System.out.println( "The stack has : " + stack.Size() + " numbers");
                    break;
                   case 2 :
                    System.out.println("What number do you want to add to the stack?");
                    int nextNumber = sc.nextInt();
                    stack.Push(nextNumber);
                    System.out.println("Stack : " + stack.Display());
                    break;
                   case 3 :

                    try {
                        stack.Pop();
                    } catch (RuntimeException e) {

                        System.out.println("Nothing to Pop : " + e.getMessage());
                    }
                    System.out.println(stack.Display());
                    break;
                case 4 : stack.Front();
                break;
                case 5 : stack.Back();
                break;
                case 6 : if(stack.Empty())
                {
                    System.out.println("Empty");
                }
                else
                {
                    System.out.println("Not Empty");
                }
                break;
                case 7 : stack.Clear();
                    System.out.println("Stack has been cleaned");
                    break;

            }

        }




    }

}

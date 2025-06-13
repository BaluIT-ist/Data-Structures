package Queues;

import java.util.Scanner;

public class MainCoada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Coada codita = new Coada();

        for(int i=0;i<n;i++)
        {
            int info=sc.nextInt();
            codita.Push(info);

        }

        codita.ToString();
        codita.Pop();
        codita.ToString();
        codita.Front();
        System.out.println(codita.Front().info);
        System.out.println(codita.Back().info);
        System.out.println(codita.Empty());
        codita.Clear();
        codita.ToString();

    }


}




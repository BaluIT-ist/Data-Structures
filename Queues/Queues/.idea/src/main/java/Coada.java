package Queues;

import java.util.Scanner;

public class Coada {

    Nod firstNode=null;
    Nod lastNode=null;

    public int Size()
    {
        int count=0;
        if( firstNode==null)
        {
            return count;
        }


        Nod aux=firstNode;
        do {

            count++;
            aux=aux.next;
        }while(aux !=null);
        return count;
    }

    public void Push(int x)
    {
        // AM AJUSTAT PUTIN CAZUL DACA PRIMUL NOD ESTE NULL SAU NU
        Nod aux=new Nod(x);
        if(firstNode == null) {
            firstNode=aux;
            firstNode.next=null;
        } else {
            lastNode.next = aux;
        }
        lastNode=aux;
    }

    public void Pop()
    {
        firstNode =firstNode.next ;
    }

    public Nod Front()
    {
        return firstNode;
    }


    public Nod Back()
    {
        return lastNode;
    }

    public boolean Empty(){
        if( firstNode==null)
        {
            return true;
        }
        return false;
    }

    public void Clear(){

        int count= Size();
        for(int i=1;i<=count;i++)
        {
            Pop();
        }

    }

    public void Read(int x)
    {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
    }

    public Coada(Nod firstNode) {
        this.firstNode=firstNode;
        this.lastNode=firstNode;
    }
    public Coada(Nod firstNode,Nod lastNode) {
        this.firstNode=firstNode;
        this.lastNode=lastNode;
    }
    public Coada(){

        this.firstNode=null;
        this.lastNode=null;
    }

    public void ToString() {
        StringBuilder sb = new StringBuilder();

        if (firstNode == null) {
            System.out.println("Since first node is null,is it empty.");
            return;
        }
        Nod aux = firstNode;

        do {

            if(aux.next == null) {
                sb.append(aux.info);
            } else {
                sb.append(aux.info).append("-> ");
            }

            aux = aux.next;
        } while (aux != null);


        System.out.println(sb);

    }

}

package Nodstack;

import javax.jws.soap.SOAPBinding;

public class Stack {

    NodStack firstnode=null;
    NodStack lastnode = null;


    public int Size(){
        int count = 0;
        if(firstnode == null)
        {
            return count;
        }

        NodStack aux = firstnode;
        do {

            count++;
            aux=aux.next;
        }while(aux !=null);
        return count;
    }
    

    public void Push(int x){
        NodStack aux = new NodStack(x);
        if(firstnode==null)
        {
            firstnode=aux;
            lastnode=aux;
        }
        else
        {
            lastnode.next=aux;
            lastnode=aux;
        }

    }
    public boolean Empty(){
        if(firstnode==null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    public void Pop() {
        if (Empty()) {
            throw new RuntimeException("Cannot pop since the stack is empty");
        }

        if (firstnode == lastnode) {

            firstnode = null;
            lastnode = null;
            return;
        }

        // More than one node
        NodStack current = firstnode;
        while (current.next != lastnode) {
            current = current.next;
        }

        current.next = null;
        lastnode = current;
    }



    public NodStack Front(){
        if(firstnode==null)
        {
            System.out.println("Stack is empty.");
            return null;
        }

        System.out.println("Last term to exit the stack : " +firstnode.info);
        return firstnode;
    }

    public NodStack Back()  {
        if (lastnode == null) {
            System.out.println("Stack is empty.");
            return null;
        }

        System.out.println(" First term to exit the stack : " + lastnode.info);
        return lastnode;
    }
    public void Clear()
    {
        int count = Size();
        for(int i = 0; i<count;i++)
        {
            Pop();
        }
    }

    public Stack(NodStack firstNode,NodStack lastNode)
    {
        this.firstnode=firstNode;
        this.lastnode=lastNode;
    }
    public Stack(NodStack firstNode)
    {
        this.firstnode=firstNode;
        this.lastnode=null;
    }
    public Stack()
    {
        this.firstnode=null;
        this.lastnode=null;
    }

    public String Display() {
        StringBuilder sb = new StringBuilder();
        NodStack aux = firstnode;


            while (aux != null) {
                sb.append(aux.info);
                if (aux.next != null) {
                    sb.append(" -> ");
                }
                aux = aux.next;
            }

            return sb.toString();

    }

}

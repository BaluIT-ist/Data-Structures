package Queues;

public class Nod {
    int info;
    Nod next = null ;

    public Nod(int info){
        this.info = info;
    }

    public Nod(int info,Nod nod){
        this.info=info;
        this.next=nod;
    }
}

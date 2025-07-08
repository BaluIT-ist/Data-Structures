package Nodstack;

public class NodStack {

    int info;
    NodStack next = null;

    public NodStack(int info ){ this.info=info;}
    public NodStack(int info,NodStack nod ) {
        this.info=info;
        this.next=nod;
    }
}
